package ElProblemaDeParada.haltchecker.Reverser;

/**
 * Clase que maneja un bucle for potencialmente infinito.
 * @autor Pedro Alonso Tapia Lobo
 */
import ElProblemaDeParada.haltchecker.haltchecker.Handler;

public abstract class ForLoopHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public boolean handle(String code) {
        // Simplificamos el análisis buscando un patrón básico de un bucle for potencialmente infinito
        if (code.matches(".*for\\s*\\([^;]*;\\s*[^;]+;\\s*[^)]*\\)\\s*\\{.*")) {
            System.out.println("Detected a potentially infinite 'for' loop.");
            return true;
        } else if (nextHandler != null) {
            return nextHandler.handle(code);
        }
        return false;
    }
}

