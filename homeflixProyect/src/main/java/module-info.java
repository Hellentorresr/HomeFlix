module com.example.homeflixproyect {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.homeflixproyect to javafx.fxml;
    exports com.example.homeflixproyect;
}