package haltchecker;
/**
 * Handler to check if the code will halt.
 * @author Pedro Alonso Tapia Lobo

 */



public class CountDownHandler implements Handler {
    private Handler nextHandler;

    /**
     * Sets the next handler in the chain of responsibility.
     * @param nextHandler The next handler in the chain of responsibility.
     */
    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * Checks if the code will halt.
     * @param code The code to check.
     * @return True if the code will halt, false otherwise.
     */
    @Override
    public boolean handleRequest(String code) {
        if (code.contains("count--;") && code.contains("for")) {
            return true; // El código se detiene eventualmente
        } else if (nextHandler != null) {
            return nextHandler.handleRequest(code);
        }
        return true; // Si no se reconoce el patrón, asumimos que se detiene
    }
}

