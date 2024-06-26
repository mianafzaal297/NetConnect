package com.example.netconnect;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.nio.Buffer;

public class postController {
    @FXML
    TextArea postTextArea;
    @FXML
    Label postLabelCheck;
    static UserData currentUser;



    @FXML
    public void postButton()
    {
        currentUser.addPost(postTextArea.getText());
        //postTextArea.setText("SUCCESSFULLY POSTED!");
        postLabelCheck.setText("SUCCESSFULLY POSTED!");
        ProfileFirstPageController.updateFile(currentUser);
        System.out.println("Update call in Post Function");
    }
    public static void setCurrentUser(UserData user)
    {
        currentUser = user;
        System.out.println("Inside SetCurrentUser of Post Controller " + currentUser.username);
    }
}
