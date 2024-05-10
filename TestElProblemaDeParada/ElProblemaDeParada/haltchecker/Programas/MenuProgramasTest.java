package ElProblemaDeParada.haltchecker.Programas;
/**
 * Clase que cuenta indefinidamente hasta abajo
 * @autor Pedro Alonso Tapia Lobo
 */
import static org.junit.jupiter.api.Assertions.*;

class MenuProgramasTest {

    //Test para el programa Menu
    @org.junit.jupiter.api.Test
    void menu() {
        MenuProgramas menuProgramas = new MenuProgramas();
        menuProgramas.menuProgramas();
    }
}