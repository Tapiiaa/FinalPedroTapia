package ElProblemaDeParada.haltchecker.haltchecker;
/**
 * Clase que verifica si un programa se detiene o no.
 * @autor Pedro Alonso Tapia Lobo
 */
public class HaltChecker {

    /**
     * Verifica si un programa se detiene o no.
     * @param code El código a verificar.
     * @return True si el programa se detiene, false en otro caso.
     */
    public static boolean willHalt(String code) {
        if (code.equalsIgnoreCase("CountUp")) {
            return false;  // Asumimos que CountUp nunca se detiene.
        } else if (code.equalsIgnoreCase("CountDown")) {
            return true;  // Asumimos que CountDown siempre se detiene.
        }
        return false;  // Por defecto, otros códigos no se detienen.
    }
}




