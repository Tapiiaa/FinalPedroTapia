package AnalizadorDeCodigo.handlers;
// handlers/LoopAnalysisHandler.java


import javax.swing.JTextArea;

public class LoopAnalysisHandler implements Handler {
    private Handler nextHandler;
    private JTextArea resultArea;

    public LoopAnalysisHandler(JTextArea resultArea) {
        this.resultArea = resultArea;
    }

    @Override
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(String code) {
        resultArea.append("Análisis de bucle completado.\n");
        if (nextHandler != null) {
            nextHandler.handleRequest(code);
        }
    }
}
