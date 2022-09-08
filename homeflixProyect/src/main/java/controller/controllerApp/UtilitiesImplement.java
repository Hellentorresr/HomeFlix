package controller.controllerApp;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import view.MainApp;

import java.io.IOException;
import java.util.Objects;

public class UtilitiesImplement extends Utilities {

    @Override
    public String pathInterfazGrafica(String path, Button button) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(MainApp.class.getResource(path)));
        Stage window = (Stage) button.getScene().getWindow();
        window.setScene(new Scene(root));
        return path;
    }
}
