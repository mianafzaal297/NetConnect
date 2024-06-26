package com.example.netconnect;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

public class signInController {

    @FXML
    public TextField username;
    @FXML
    public PasswordField password;

    @FXML
    public Label authenticationLabel;
    static UserData userData = null;
    static ArrayList<UserData> userDataArrayList;


    @FXML
    public void onLogInButtonClick()
    {
        String un,ps;
        ArrayList<AccountsDetails> wholeList = fileFunction.readFile();
        for (AccountsDetails acc: wholeList) {
            if (username.getText().equals(acc.username))
            {
                if (password.getText().equals(acc.password))
                {
                    userDataArrayList= userFileFunction.readFile();
                    for (UserData user:userDataArrayList) {
                        if (user.username.equals(username.getText())) {
                            userData = user;
                            System.out.println("Succesfuly Find User from USER FILE");
                            //userFileFunction.writeFile(userDataArrayList);
                        }
                    }
                    System.out.println("Successfully Login");
                    System.out.println(acc);
                    ProfileFirstPageController.setCurrentUser(userData);
                    methodClass.profileFirstPage(acc);
                }
                else
                {
                    //Invalid Password or username label
                    authenticationLabel.setText("Invalid Username or Password...!!");
                    System.out.println("LogIn Details Incorrect");
                }
            }
        }


    }

    @FXML
    public void onBackButtonClick()
    {
        methodClass.back();
    }
}
