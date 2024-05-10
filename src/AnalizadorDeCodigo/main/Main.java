package AnalizadorDeCodigo.main;
// main/Main.java



import AnalizadorDeCodigo.gui.CodeAnalyzerGUI;
import AnalizadorDeCodigo.handlers.*;
import javax.swing.*;
import javax.swing.SwingUtilities;
import javax.swing.JTextArea;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JTextArea resultArea = new JTextArea();
            LexicalHandler lexicalHandler = new LexicalHandler(resultArea);

            CodeAnalyzerGUI gui = new CodeAnalyzerGUI(lexicalHandler);
            gui.setVisible(true);
        });
    }
}
