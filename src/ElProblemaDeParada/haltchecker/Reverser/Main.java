package ElProblemaDeParada.haltchecker.Reverser;
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
