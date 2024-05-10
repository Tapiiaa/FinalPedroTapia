package ElProblemaDeParada.haltchecker.Programas;
/**
 * Clase que cuenta indefinidamente hasta arriba
 * @autor Pedro Alonso Tapia Lobo
 */
import static org.junit.jupiter.api.Assertions.*;

class CountUpTest {

    @org.junit.jupiter.api.Test
    void countUp() {
        CountUp countUp = new CountUp();
        countUp.countUp();
    }

}