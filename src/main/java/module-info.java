module com.example.testsqlconnection {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.testsqlconnection to javafx.fxml;
    exports com.example.testsqlconnection;
}