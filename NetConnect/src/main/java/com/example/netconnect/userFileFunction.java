package com.example.netconnect;

import java.io.*;
import java.util.ArrayList;

public class userFileFunction implements Serializable {


    public static void writeFile(ArrayList<UserData> accList) {
        ArrayList<UserData> acc = new ArrayList<>();
        
/*
        FOR TESTING PURPOSE
        acc.add(new UserData("waqas21"));
        acc.add(new UserData("waqas021"));
        acc.add(new UserData("awais297"));
        acc.add(new UserData("bilal297"));

*/

        acc = readFile();
       // System.out.println(acc);
        for (UserData accc:accList) {
            acc.add(accc);
        }
        try {
            ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream("userFile.ser"));
            OOS.writeObject(acc);

            OOS.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static ArrayList<UserData> readFile()
    {
        ArrayList<UserData> userDetails = new ArrayList<>();
        try {
            ObjectInputStream OIS = new ObjectInputStream(new FileInputStream("userFile.ser"));
            userDetails = (ArrayList<UserData>) OIS.readObject();

            OIS.close();

        } catch (IOException | ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }

        return userDetails;
    }



    public static void onlyWriteFile(ArrayList<UserData> accList) {
        ArrayList<UserData> acc = new ArrayList<>();

        //System.out.println(acc);
        for (UserData accc:accList) {
            acc.add(accc);
        }
        try {
            ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream("userFile.ser"));
            OOS.writeObject(accList);
            System.out.println("Successfuly Write in USER FILE FUNCTION");

            OOS.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        acc.clear();
    }


}
