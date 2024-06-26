package com.example.netconnect;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class signUpController implements Initializable {

    ArrayList<AccountsDetails> accountsList = new ArrayList<>();
    AccountsDetails account;
    ArrayList<UserData> userList = new ArrayList<>();
    UserData user;


    @FXML
    TextField name,username,email,phone,address,nationality;
    @FXML
    ComboBox merital,gender;

    @FXML
    DatePicker DoB;

    @FXML
    PasswordField password1,password2;

    @FXML
    Label passwordLabel;


    @FXML
    public void onsignUpButtonClick()
    {

        if (password1.getText().equals(password2.getText()))
        {
            account = new AccountsDetails();
            user = new UserData(username.getText());

            account.name = name.getText();
            account.username = username.getText();
            account.email= email.getText();
            account.DoB = DoB.getValue().toString();
            account.address = address.getText();
            account.gender = gender.getValue().toString();
            account.merital = merital.getValue().toString();
            account.natinality = nationality.getText();
            account.phone = phone.getText();
            account.password = password1.getText();

            System.out.println(account);

            accountsList.add(account);
            userList.add(user);

            fileFunction.writeFile(accountsList);
            userFileFunction.writeFile(userList);


            passwordLabel.setText("Successfully SignUp");

            methodClass.welcome();

        }
        else {
            passwordLabel.setText("Passwords Must be Same !!");
        }

    }

    @FXML
    public void onBackButtonClick()
    {
        methodClass.back();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gender.getItems().setAll("MALE","FEMALE");
        merital.getItems().setAll("MARRIED","UNMARRIED");
    }
}
