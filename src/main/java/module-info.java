module com.example.tpi420232024 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.tpi420232024 to javafx.fxml;
    exports com.example.tpi420232024;
}