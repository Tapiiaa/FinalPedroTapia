package haltchecker;

public class CountUpHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

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
