module com.foracademy.foracademy {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.junit.jupiter.api;


    opens com.foracademy.gui to javafx.fxml;
    exports com.foracademy.gui;
}