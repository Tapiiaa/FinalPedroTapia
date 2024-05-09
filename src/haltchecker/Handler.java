package haltchecker;


public interface Handler {
    void setNextHandler(Handler nextHandler);
    boolean handleRequest(String code);
}

