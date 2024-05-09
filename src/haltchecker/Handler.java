package haltchecker;
/**
 * Interfaz que define un manejador de solicitudes.
 * @autor Pedro Alonso Tapia Lobo
 */
public interface Handler {
    void setNextHandler(Handler nextHandler);
    boolean handleRequest(String code);
}

