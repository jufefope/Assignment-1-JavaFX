module com.example.premier {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.example.premier to javafx.fxml;
    exports com.example.premier;
}
