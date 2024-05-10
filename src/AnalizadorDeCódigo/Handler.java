package AnalizadorDeCódigo;

public interface Handler {
    void setNext(Handler handler);
    String handle(String request);
}