package AnalizadorDeCódigo;

public abstract class AbstractHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public String handle(String request) {
        if (nextHandler != null) {
            return nextHandler.handle(request);
        }
        return "Código sin errores detectados.";
    }
}
