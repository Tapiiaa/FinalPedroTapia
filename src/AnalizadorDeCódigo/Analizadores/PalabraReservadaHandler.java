package AnalizadorDeCódigo.Analizadores;

import AnalizadorDeCódigo.AbstractHandler;

public class PalabraReservadaHandler extends AbstractHandler {
    @Override
    public String handle(String request) {
        if (request.contains("while") || request.contains("for")) {
            return super.handle(request);
        }
        return "Error: Falta la palabra reservada 'while' o 'for'.";
    }
}