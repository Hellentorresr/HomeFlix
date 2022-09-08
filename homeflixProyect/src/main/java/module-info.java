module com.example.homeflixproyect {
    requires javafx.controls;
    requires javafx.fxml;


    opens view to javafx.fxml;
    exports view;
    exports model;
    opens model to javafx.fxml;
    exports controller.controllerApp;
    opens controller.controllerApp to javafx.fxml;
}