package com.the.Backend;

public class constantFromDB {
    private int id;
    private String nameToName;
    private float value;

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
    @Override
    public String toString(){
        return "["+id+"]" +" "+nameToName+" "+" "value;
    }



}
