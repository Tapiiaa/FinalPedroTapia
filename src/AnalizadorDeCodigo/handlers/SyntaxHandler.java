package AnalizadorDeCodigo.handlers;
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
        // Asignamos true para simplificar el ejemplo
        resultArea.append("Análisis sintáctico completado: true\n");
        if (nextHandler != null) {
            nextHandler.handleRequest(code);
        }
    }
}
