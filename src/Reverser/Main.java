package Reverser;
import javax.swing.SwingUtilities;

/**
 * Main class to run the application.

 */
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ReverserView view = new ReverserView();
            new ReverserController(view);
        });
    }
}
