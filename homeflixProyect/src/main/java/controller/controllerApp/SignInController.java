package controller.controllerApp;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class SignInController {
    public Button button_signUp;

    public TextField tf_userName;
    public PasswordField tf_userPassword;
    public Button button_login;
    public Label loginMessage;
    UtilitiesImplement ut;

    public SignInController() {
        ut = new UtilitiesImplement();
    }

    public void IrACrearCuenta(ActionEvent event) {

    }

    public void login(ActionEvent event) {

    }

    public void validateLogin(MouseEvent mouseEvent) {

    }

    /**
     * Para enviar al usuario a la página principal de videos
     *
     * @throws IOException dara un exception si no se conecta correctamente a la base de datos
     */
    public void ingresarApp() throws IOException {
        ut.pathInterfazGrafica("Home.fxml", button_login); // ------------------
    }
}
