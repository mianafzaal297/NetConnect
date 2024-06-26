package com.example.netconnect;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class timelineController implements Initializable {
    @FXML
    ListView postListView;

    static UserData currentUser;

    public static void setCurrentUser(UserData user)
    {
        currentUser = user;
        System.out.println("Inside SetCurrentUser of Timeline Controller " + currentUser.username);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if (currentUser.postList!=null) {
            postListView.getItems().setAll(currentUser.postList);
        }
        else {
            postListView.getItems().setAll("USER NOT POSTED YET !!");
        }
    }
}
