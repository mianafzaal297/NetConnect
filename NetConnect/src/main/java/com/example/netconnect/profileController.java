package com.example.netconnect;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class profileController implements Initializable {
    //static UserData currentUser;
    @FXML
    Label name,username,mail,phone,DoB,gender,merital,address,nationality;
    static AccountsDetails acc;

    public static void setAccountData(AccountsDetails account)
    {
        acc=account;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        name.setText(acc.name);
        username.setText(acc.username);
        mail.setText(acc.email);
        phone.setText(acc.phone);
        DoB.setText(acc.DoB);
        gender.setText(acc.gender);
        merital.setText(acc.merital);
        address.setText(acc.address);
        nationality.setText(acc.natinality);
    }

   /* public static void setCurrentUser(UserData user)
    {
        currentUser = user;
        System.out.println("Inside SetCurrentUser of Profile Controller "+ currentUser.username);
    }*/

}
