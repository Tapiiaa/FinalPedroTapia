package AnalizadorDeCódigo.Handler;

public interface Handler {
    void setNext(Handler handler);
    String handle(String request);
}