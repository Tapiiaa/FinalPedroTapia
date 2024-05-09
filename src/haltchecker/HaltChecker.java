package haltchecker;
public class HaltChecker {

    // Evalúa si el código suministrado se detiene.
    public static boolean willHalt(String code) {
        // Ejemplos de condiciones que podríamos evaluar
        if (code.contains("while (true)") && !code.contains("break")) {
            return false;  // Un bucle infinito sin una declaración de salida.
        }
        if (code.matches(".*for \\(.*;.*;.*\\) \\{.*\\}") && !code.contains("break")) {
            return false;  // Un bucle for sin una condición de escape clara.
        }
        return true;  // Por defecto, suponemos que cualquier otro código se detiene.
    }
}



