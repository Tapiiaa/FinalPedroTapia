package AnalizadorDeCodigo.handlers;

// handlers/SyntaxHandler.java



import javax.swing.JTextArea;

public class SyntaxHandler implements Handler {
    private Handler nextHandler;
    private JTextArea resultArea;

    public SyntaxHandler(JTextArea resultArea) {
        this.resultArea = resultArea;
    }

    @Override
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(String code) {
        resultArea.append("Análisis sintáctico completado.\n");
        if (nextHandler != null) {
            nextHandler.handleRequest(code);
        }
    }
}
