module com.example.circlesdrawing {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.circlesdrawing to javafx.fxml;
    exports com.example.circlesdrawing;
}