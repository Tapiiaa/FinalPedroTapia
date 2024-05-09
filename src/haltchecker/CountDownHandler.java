package haltchecker;


public class CountDownHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

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

