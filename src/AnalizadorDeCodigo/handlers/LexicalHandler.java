package AnalizadorDeCodigo.handlers;

import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class LexicalHandler implements Handler {
    private Handler nextHandler;
    private JTextArea resultArea;

    public LexicalHandler(JTextArea resultArea) {
        this.resultArea = resultArea;
    }

    @Override
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(String code) {
        String[] tokens = code.split("\\s+");
        for (String token : tokens) {
            // Utilizar invokeLater para asegurar que la actualización de la UI se haga en el EDT
            SwingUtilities.invokeLater(() -> {
                if (token.matches("[a-zA-Z_][a-zA-Z0-9_]*")) {
                    resultArea.append("Token '" + token + "': Correcto\n");
                } else {
                    resultArea.append("Token '" + token + "': Incorrecto\n");
                }
            });
            try {
                // Pausa corta para permitir que la GUI se actualice visualmente entre tokens
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        SwingUtilities.invokeLater(() -> {
            resultArea.append("Análisis léxico completado.\n");
            if (nextHandler != null) {
                nextHandler.handleRequest(code);
            }
        });
    }
}