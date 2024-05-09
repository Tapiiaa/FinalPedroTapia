public class HaltChecker {
    // Función HaltChecker que toma como entradas el código de un programa y una entrada específica para ese programa

    public static boolean willHalt(String programCode, int startValue) {
        // Verifica si el programa tiene un límite claro de detención en el bucle
        if (programCode.contains("for") && programCode.contains("i >= 0")) {
            return true; // El programa tiene un bucle que cuenta hacia atrás hasta cero
        } else if (programCode.contains("while") && programCode.contains("true")) {
            return false; // El programa tiene un bucle infinito
        }
        return false; // Por defecto asumimos que no se detiene
    }
}
