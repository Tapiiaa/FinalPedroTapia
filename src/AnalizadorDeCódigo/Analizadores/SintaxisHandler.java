package AnalizadorDeCódigo.Analizadores;
import AnalizadorDeCódigo.AbstractHandler;


public class SintaxisHandler extends AbstractHandler {
    @Override
    public String handle(String request) {
        String whilePattern = "while\\s*\\(([^)]+)\\)\\s*\\{[^}]*\\}";
        String forPattern = "for\\s*\\(\\s*([^;]+\\s*;\\s*[^;]+\\s*;\\s*[^)]+)\\)\\s*\\{[^}]*\\}";

        if (request.matches(whilePattern) || request.matches(forPattern)) {
            return super.handle(request);
        }
        return "Error de sintaxis: La estructura de 'while' o 'for' es incorrecta.";
    }
}
