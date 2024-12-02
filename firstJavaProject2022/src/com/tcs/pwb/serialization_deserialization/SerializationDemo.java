package com.tcs.pwb.serialization_deserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

    public static void main(String[] args) {
        Student s = new Student(1,"Kiran");

        String filePath="C:\\My_Computer\\output\\myFile.txt";

        try{

            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s);
            oos.close();
            fos.close();



        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
