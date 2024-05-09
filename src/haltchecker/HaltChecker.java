package haltchecker;



public class HaltChecker {

    public static boolean willHalt(String code) {
        if (code.equalsIgnoreCase("CountUp")) {
            return false;  // Asumimos que CountUp nunca se detiene.
        } else if (code.equalsIgnoreCase("CountDown")) {
            return true;  // Asumimos que CountDown siempre se detiene.
        }
        return false;  // Por defecto, otros códigos no se detienen.
    }
}




