module com.example.recursions {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.recursions to javafx.fxml;
    exports com.example.recursions;
}