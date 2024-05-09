package ElProblemaDeParada.haltchecker.Programas;
/**
 * Clase que cuenta indefinidamente hasta abajo
 * @author Pedro Alonso Tapia Lobo
 */

public class CountDown {

    public void countDown() {
        /**
         * Método que cuenta indefinidamente hasta abajo
         * @param i Variable que se inicializa en 10
         * @while Bucle que imprime el valor de i y le resta 1 en cada iteración
         */
        int i = 10;
        while (i >= 0) {
            System.out.println(i);
            i--;
        }
    }


}
