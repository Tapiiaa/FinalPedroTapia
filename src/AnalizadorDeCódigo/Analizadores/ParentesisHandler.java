package AnalizadorDeCódigo.Analizadores;
import AnalizadorDeCódigo.AbstractHandler;
public class ParentesisHandler extends AbstractHandler {
    @Override
    public String handle(String request) {
        int open = request.length() - request.replace("(", "").length();
        int close = request.length() - request.replace(")", "").length();
        if (open == close) {
            return super.handle(request);
        }
        return "Error: Desequilibrio en los paréntesis.";
    }
}