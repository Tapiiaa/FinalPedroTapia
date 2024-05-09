package haltchecker;
/**
 * Handler to check if the code contains an infinite loop.
 * @author Pedro Alonso Tapia Lobo
 */
public class CountUpHandler implements Handler {
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
     * Checks if the code contains an infinite loop.
     * @param code The code to check.
     * @return True if the code contains an infinite loop, false otherwise.
     */
    @Override
    public boolean handleRequest(String code) {
        if (code.contains("count++;") && code.contains("while (true)")) {
            return false; // El código nunca se detiene
        } else if (nextHandler != null) {
            return nextHandler.handleRequest(code);
        }
        return false; // Si no se reconoce el patrón, asumimos que no se detiene
    }
}
