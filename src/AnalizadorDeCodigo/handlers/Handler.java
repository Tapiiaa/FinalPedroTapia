package AnalizadorDeCodigo.handlers;

// handlers/Handler.java



public interface Handler {
    void setNext(Handler handler);
    void handleRequest(String code);
}
