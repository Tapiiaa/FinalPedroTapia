package AnalizadorDeCodigo.main;
// main/Main.java



import gui.CodeAnalyzerGUI;
import handlers.*;

import javax.swing.SwingUtilities;
import javax.swing.JTextArea;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JTextArea resultArea = new JTextArea();
            LexicalHandler lexicalHandler = new LexicalHandler(resultArea);
            SyntaxHandler syntaxHandler = new SyntaxHandler(resultArea);
            SemanticHandler semanticHandler = new SemanticHandler(resultArea);
            LoopAnalysisHandler loopAnalysisHandler = new LoopAnalysisHandler(resultArea);

            lexicalHandler.setNext(syntaxHandler);
            syntaxHandler.setNext(semanticHandler);
            semanticHandler.setNext(loopAnalysisHandler);

            new CodeAnalyzerGUI(lexicalHandler).setVisible(true);
        });
    }
}
