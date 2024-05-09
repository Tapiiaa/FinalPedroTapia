package CountDown;

public class CountDownController {
    private CountDownModel model;
    private CountDownView view;

    public CountDownController(CountDownModel model, CountDownView view) {
        this.model = model;
        this.view = view;
        initView();
    }

    private void initView() {
        view.setVisible(true);
        view.addCountButtonListener(e -> handleCountDown());
    }

    private void handleCountDown() {
        model.decrementCount();  // Decrementa el contador en el modelo.
        view.setCountDisplay(model.getCount());  // Actualiza
    }
}