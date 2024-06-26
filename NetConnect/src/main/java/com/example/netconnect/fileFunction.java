package com.example.netconnect;

import java.io.*;
import java.util.ArrayList;

public class fileFunction implements Serializable {


    public static void writeFile(ArrayList<AccountsDetails> accList) {
        ArrayList<AccountsDetails> acc = new ArrayList<>();

/*
        FOR TESTING PURPOSE
        acc.add(new AccountsDetails("Waqas","waqas21","waqas21@gmail.com","03427712421","2023-01-01","Single","Male","Jaranwala","PK","waqas21"));
        acc.add(new AccountsDetails("Waqas","waqas021","waqas21@gmail.com","03427712421","2023-01-01","Single","Male","Jaranwala","PK","waqas021"));
        acc.add(new AccountsDetails("Awais","awais297","awais297@gmail.com","03427537613","1996-01-01","Single","Male","TTS","PK","awais297"));
        acc.add(new AccountsDetails("Bilal","bilal297","bilal297@gmail.com","03086562297","1995-01-01","Single","Male","TTS","PK","bilal297"));

*/


        acc = readFile();
        //System.out.println(acc);
        for (AccountsDetails accc:accList) {
            acc.add(accc);
        }
        try {
            ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream("accountFile.ser"));
            OOS.writeObject(acc);

            OOS.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static ArrayList<AccountsDetails> readFile()
    {
        ArrayList<AccountsDetails> accDetails = new ArrayList<>();
        try {
            ObjectInputStream OIS = new ObjectInputStream(new FileInputStream("accountFile.ser"));
            accDetails = (ArrayList<AccountsDetails>) OIS.readObject();

            OIS.close();

        } catch (IOException | ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }

        return accDetails;
    }
}
