package com.the.Backend;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class handleDB {

    public static final String Driver = "org.sqlite.JDBC";
    public static final String DB_URL = "jdbc:sqlite:constant.db";

    private Connection conn;
    private Statement stat;

    public handleDB() {
        /*
        Load external driver of DataBases
         */
        try {
            Class.forName(handleDB.Driver);
        } catch (Exception e) {
            System.err.print("Error when try to load driver");
            e.printStackTrace();
        }
        /*
        Connect to database
         */
        try {
            conn = DriverManager.getConnection(DB_URL);
            stat = conn.createStatement();
        } catch (SQLException e) {
            System.err.print("Error when try to connect DataBases");
            e.printStackTrace();
        }
        createdTalbe();
    }
    private boolean createdTalbe() {
        String createTableOfConstant = "CREATE TABLE IF NOT EXISTS constant (id_const INTEGER PRIMARY KEY AUTOINCREMENT, nameToName varchar(255), value float)";
        try {
            stat.execute(createTableOfConstant);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public boolean insertConstant(String nameToName, float value) {
        //Method adding record to DB
        try {
            PreparedStatement prepStmt = conn.prepareStatement("Insert Into constant values (NULL, ?, ?);");
            prepStmt.setString(1, nameToName);
            prepStmt.setFloat(2, value);
            prepStmt.execute();
        } catch (SQLException e) {
            System.err.print("Unexpection error when adding record");
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public List<constantDB> selectAllRowConstant() {
        //Method selected record from DB
        List<constantDB> constantTable= new LinkedList<constantDB>();
        try {
            ResultSet result = stat.executeQuery("SELECT * FROM constant");
            int id;
            String nameToName;
            float value;
            while (result.next()) {
                id = result.getInt("id_const");
                nameToName = result.getString("nameToName");
                value = result.getFloat("value");
                constantTable.add(new constantDB(id, nameToName, value));
            }
        }catch (SQLException e) {
            System.err.print("Unexpection error when reading record");
            e.printStackTrace();
        }
        return constantTable;
    }
    public float getConstant(String selectedName) {
        float value =0;
        try {
            ResultSet result = stat.executeQuery("SELECT * FROM constant");
            while (result.next()) {
                if(selectedName.equals(result.getInt("id_const"))) {
                    value = result.getFloat("value");
                }
            }
        }catch (SQLException e) {
            System.err.print("Unexpection error when reading record");
            e.printStackTrace();
            return 1;
        }
        if (value==0){
            System.err.print("Wrong value readed from DB");
            return 1;
        }
        return value;
    }
    public void deleteConstant ( int id){
            //Method deleted record from DB
        }
    public void closeConnection() {
        try {
            conn.close();
        } catch (SQLException e) {
            System.err.println("Unexpection error when try to close database");
            e.printStackTrace();
        }
    }
}

