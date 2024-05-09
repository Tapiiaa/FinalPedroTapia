package CountUp;

public class CountUpController {
    private CountUpModel model;
    private CountUpView view;

    public CountUpController(CountUpModel model, CountUpView view) {
        this.model = model;
        this.view = view;
        initView();
    }

    private void initView() {
        view.setVisible(true);
        view.addStartCountingListener(e -> model.startCounting());
        view.addStopCountingListener(e -> model.stopCounting());
    }
}

