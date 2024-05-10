package ElProblemaDeParada.haltchecker.Programas;
/**
 * Clase que cuenta indefinidamente hasta abajo
 * @autor Pedro Alonso Tapia Lobo
 */

import static org.junit.jupiter.api.Assertions.*;

class CountDownTest {
    //Test para el programa CountDown
    @org.junit.jupiter.api.Test
    void countDown() {
        CountDown countDown = new CountDown();
        countDown.countDown();
    }
}