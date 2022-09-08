package controller.controllerApp;

/**
 * @autor por Hellen Torres
 * @FechaCreacion 08/09/2022
 * @Ultima_Modificacion 08/09/2022
 * @por Hellen torres
 */


import javafx.scene.control.Button;

import java.io.IOException;

/**
 * clase UtilitiesAbstract para abstraer código repetitivo
 */
public abstract class Utilities {
    /**
     * Constructor
     */
    public Utilities() {
    }

    /**
     * Creacion de metodo
     */

    public abstract String pathInterfazGrafica(String path, Button button) throws IOException;
}
