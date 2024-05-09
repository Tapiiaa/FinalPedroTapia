package Programas;
/**
 * Clase menú que muestra las opciones de programas a ejecutar
 * @autor Pedro Alonso Tapia Lobo
 */
import java.util.Scanner;
public class MenuProgramas {
    public void menuProgramas() {
        /**
         * Método que muestra las opciones de programas a ejecutar
         * @param opcion Variable que almacena la opción seleccionada por el usuario
         * @switch Estructura de control que ejecuta el programa seleccionado por el usuario
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Contador ascendente");
        System.out.println("2. Contador descendente");
        System.out.println("3. Salir");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                CountUp countUp = new CountUp();
                countUp.countUp();
                break;
            case 2:
                CountDown countDown = new CountDown();
                countDown.countDown();
                break;
            case 3:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

    }
}
