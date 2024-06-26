package com.example.netconnect;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ResourceBundle;


public class ProfileFirstPageController implements Initializable{

    /*@FXML
    static Label name1,username1,email1,phone1,DoB1,gender1,testingLabel;

    @FXML
    static TextField merital1,address1,nationality1;*/

    @FXML
    BorderPane first;

    //UserData user;
    static UserData currentUser;
    static ArrayList<UserData> userDataArrayList;


    public void setProfilePane() throws IOException {
        Parent node = null;
        node = FXMLLoader.load(getClass().getResource("profile.fxml"));
        //profileController.setCurrentUser(currentUser);
        first.setCenter(node);
    }

    public void setFriendPane() throws IOException {
        Parent node = null;
        node = FXMLLoader.load(getClass().getResource("friend.fxml"));

//        friendController.setCurrentUser(currentUser);
        first.setCenter(node);
    }

    public void setPostPane() throws IOException {
        Parent node = null;
        node = FXMLLoader.load(getClass().getResource("post.fxml"));

//        postController.setCurrentUser(currentUser);
        first.setCenter(node);
    }

    public void setTimelinePane() throws IOException {
        Parent node = null;
        node = FXMLLoader.load(getClass().getResource("timeline.fxml"));

//        timelineController.setCurrentUser(currentUser);
        first.setCenter(node);
    }

    public static void setCurrentUser(UserData user)
    {
        currentUser = user;
        friendController.setCurrentUser(currentUser);
        postController.setCurrentUser(currentUser);
        timelineController.setCurrentUser(currentUser);
        System.out.println("Inside SetCurrentUser of Friend Controller " + currentUser.username);

    }

    public void onSignoutButton()
    {
        methodClass.welcome();
    }




    public static void updateFile(UserData userUpdate) {
        Iterator<UserData> iterator = userDataArrayList.iterator();
        while (iterator.hasNext()) {
            UserData user = iterator.next();
            if (user.username.equals(userUpdate.username)) {
                int index = userDataArrayList.indexOf(user);
                userDataArrayList.set(index, userUpdate);
                userFileFunction.onlyWriteFile(userDataArrayList);
                System.out.println("Inside Update File");
            }
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        userDataArrayList = userFileFunction.readFile();
    }
}
