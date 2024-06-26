package com.example.netconnect;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Button logIn;
    @FXML
    private Button signUp;

    @FXML
    protected void onSignInButtonClick()  {
        System.out.println("SignIn Button Click");
        methodClass.signIn();
    }

    @FXML
    protected void onSignUpButtonClick() {
        System.out.println("SignUp Button Click");

        methodClass.signUp();

    }
}