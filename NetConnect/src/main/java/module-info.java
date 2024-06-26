module com.example.netconnect {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.netconnect to javafx.fxml;
    exports com.example.netconnect;
}