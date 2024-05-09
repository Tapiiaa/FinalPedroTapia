package CountDown;

public class Main {
    //Clase para probar
    public static void main(String[] args) {
        CountDownModel model = new CountDownModel(10);
        CountDownView view = new CountDownView();
        CountDownController controller = new CountDownController(model, view);
    }
}
