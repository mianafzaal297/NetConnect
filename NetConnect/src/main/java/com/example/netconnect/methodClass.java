package com.example.netconnect;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class methodClass implements Initializable {
    static Stage stage = new Stage();

    public static void welcome(){
        //Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load());
        } catch (IOException e) {
            System.out.println("Error in Home Page");
        }
//        stage.setTitle("NETCONNECT");
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();
    }

    public static void back() {
        welcome();
    }

    public static void signUp() {
        //Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("signUp.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load());
        } catch (IOException e) {
            System.out.println("Error in SignUp");
        }
//        stage.setTitle("NETCONNECT");
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();
    }

    public static void signIn() {
        //Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("signIn.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load());
        } catch (IOException e) {
            System.out.println("Error in SignIn");
        }
//        stage.setTitle("NETCONNECT");
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();
    }

    public static void profileFirstPage(AccountsDetails acc)
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ProfileFirstPage.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load());
        } catch (IOException e) {
            System.out.println("Error in SignIn");
        }
//        stage.setTitle("NETCONNECT");
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();

        //ProfileFirstPageController.profileTable(acc);
        profileController.setAccountData(acc);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        stage.setTitle("NETCONNECT");
        //stage.show();
    }
}
