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
        view.addStartButtonListener(e -> model.startCounting());
        model.addPropertyChangeListener("count", evt -> {
            view.setCountDisplay((Integer) evt.getNewValue());
        });
    }
}
