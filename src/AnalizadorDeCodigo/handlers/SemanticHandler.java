package AnalizadorDeCodigo.handlers;

// handlers/SemanticHandler.java


import javax.swing.JTextArea;

public class SemanticHandler implements Handler {
    private Handler nextHandler;
    private JTextArea resultArea;

    public SemanticHandler(JTextArea resultArea) {
        this.resultArea = resultArea;
    }

    @Override
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(String code) {
        resultArea.append("Análisis semántico completado.\n");
        if (nextHandler != null) {
            nextHandler.handleRequest(code);
        }
    }
}
