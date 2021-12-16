module com.foracademy.foracademy {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.foracademy.foracademy to javafx.fxml;
    exports com.foracademy.foracademy;
}