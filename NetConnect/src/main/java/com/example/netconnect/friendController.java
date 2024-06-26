package com.example.netconnect;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class friendController implements Initializable {
    static UserData currentUser;
    //static UserData staticCurrentUser;

    @FXML
    ListView listView;
    @FXML
    TextField friendUsername;
    @FXML
    Button addButton;
    @FXML
    Label addLabel;
    static UserData friendAcc;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listView.getItems().removeAll();
        if (currentUser.friendList != null) {
            listView.getItems().setAll(currentUser.friendList);
        }
        else
        {
            listView.getItems().setAll("USER HAVE NO FRIEND");
        }
    }
    @FXML
    public void addFriend()
    {
        int condition = 0;

            for (UserData acc : ProfileFirstPageController.userDataArrayList) {
                if (acc.username.equals(friendUsername.getText()))
                {
                    currentUser.addFriend(acc.username);
                    acc.addFriend(currentUser.username);
                    friendAcc = acc;

                    addLabel.setText(String.format("SUCCESSFULLY ADDED @"+ friendUsername.getText().toUpperCase()));
                    condition++;
                }
            }

        if (condition==0){
            addLabel.setText("USER NOT FOUND !");
            System.out.println(currentUser);
        }

        ProfileFirstPageController.updateFile(currentUser);
        ProfileFirstPageController.updateFile(friendAcc);
        System.out.println("Update Call in friend Function");
    }

    public static void setCurrentUser(UserData user)
    {
        currentUser = user;
        System.out.println("Inside SetCurrentUser of Friend Controller " + currentUser.username);
    }
}
