package com.the.Backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class connDB {

    public static final String Driver = "org.sqlite.JDBC";
    public static final String DB_URL = "jdbc:sqlite:constant.db";

    private Connection conn;
    private Statement stat;

    public connDB(){
        /*
        Load external driver of DataBases
         */
        try{
            Class.forName(connDB.Driver);
        }catch (Exception e){
            System.err.print("Error when try to load driver");
            e.printStackTrace();
        }
        /*
        Connect to database
         */
        try{
            conn = DriverManager.getConnection(DB_URL);
            stat = conn.createStatement();
        }catch (SQLException e){
            System.err.print("Error when try to connect DataBases");
            e.printStackTrace();
        }
        createdTalbe();
    }
    private boolean createdTalbe(){
        String createTableOfConstant = "CREATE TABLE IF NOT EXISTS constant (id_const INTEGER PRIMARY KEY AUTOINCREMENT, name varchar(255), value float)";
        try{
            stat.execute(createTableOfConstant);
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public boolean insertConstant(int id, String nameToName, float value){
        //Method adding record to DB
        return true;
    }
    public constantFromDB selectConstant(int id){
        //Method selected record from DB
        constantFromDB value = new constantFromDB();
        return value;
    }
    public void deleteConstant(int id){
        //Method deleted record from DB
    }
}
