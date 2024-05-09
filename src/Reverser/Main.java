package Reverser;



import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ReverserView view = new ReverserView();
            new ReverserController(view);
        });
    }
}
