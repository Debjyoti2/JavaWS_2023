package com.tcs.pwb.serialization_deserialization;

import java.io.Serializable;

public class Student implements Serializable{

    private int id;
    private String name;

    Student(int id, String name){
        this.id = id;
        this.name =name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

/*

implements Serializable nz likhele below error debe

java.io.NotSerializableException: com.tcs.pwb.serialization_deserialization.Student
        at java.base/java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1187)
        at java.base/java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:350)
        at com.tcs.pwb.serialization_deserialization.SerializationDemo.main(SerializationDemo.java:17)

*/