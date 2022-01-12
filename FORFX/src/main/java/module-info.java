module com.example.forfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.forfx to javafx.fxml;
    exports com.example.forfx;
}