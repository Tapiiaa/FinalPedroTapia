package ElProblemaDeParada.haltchecker.Reverser;

/**
 * Clase que maneja un bucle for potencialmente infinito.
 * @autor Pedro Alonso Tapia Lobo
 */
import ElProblemaDeParada.haltchecker.haltchecker.Handler;

public abstract class InfiniteLoopHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public boolean handle(String code) {
        if (code.contains("while(true)")) {
            System.out.println("Detected infinite loop with 'while(true)'");
            return true;
        } else if (nextHandler != null) {
            return nextHandler.handle(code);
        }
        return false;
    }
}

