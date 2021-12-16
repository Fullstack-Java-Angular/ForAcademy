module com.foracademy.foracademy {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.foracademy.foracademy to javafx.fxml;
    exports com.foracademy.foracademy;
}