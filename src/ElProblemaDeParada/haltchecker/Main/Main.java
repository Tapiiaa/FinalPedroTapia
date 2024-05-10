package ElProblemaDeParada.haltchecker.Main;
import ElProblemaDeParada.haltchecker.Reverser.ReverserController;
import ElProblemaDeParada.haltchecker.Reverser.ReverserView;

import javax.swing.SwingUtilities;

/**
 * Main class to run the application.
 * Swing utilities are used to ensure that the GUI is created and updated on the Event Dispatch Thread.
 * @autor Pedro Alonso Tapia Lobo

 */
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ReverserView view = new ReverserView();
            new ReverserController(view);
        });
    }
}
