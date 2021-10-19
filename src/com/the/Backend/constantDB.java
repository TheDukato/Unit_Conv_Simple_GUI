package com.the.Backend;

public class constantDB {
    private int id;
    private String nameToName;
    private float value;
    private String kind;

    public String getKind() {return kind;}
    public void setKind(String kind) {this.kind = kind;}
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNameToName() {
        return nameToName;
    }
    public void setNameToName(String nameToName) {
        this.nameToName = nameToName;
    }
    public float getValue() {
        return value;
    }
    public void setValue(float value) {
        this.value = value;
    }
    public constantDB(){}
    public constantDB(int id, String nameToName, float value, String kind){
        this.id=id;
        this.nameToName=nameToName;
        this.value=value;
        this.kind=kind;
    }

    @Override
    public String toString(){
        return "[" + id + "]" + " " + nameToName + " " + " " + value;
    }



}
