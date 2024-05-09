package CountUp;
public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            CountUpModel model = new CountUpModel();   // Crea la instancia del modelo.
            CountUpView view = new CountUpView();     // Crea la instancia de la vista.
            CountUpController controller = new CountUpController(model, view);  // Crea el controlador y lo conecta con el modelo y la vista.

            view.setVisible(true);  // Hace visible la ventana de la interfaz gráfica.
        });
    }
}
