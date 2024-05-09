package CountUp;


import javax.swing.*;

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
        view.addStartCountingListener(e -> startCounting());
        model.addPropertyChangeListener("count", evt -> {
            SwingUtilities.invokeLater(() -> {
                view.setCountDisplay((Integer) evt.getNewValue());
            });
        });
    }

    private void startCounting() {
        model.startCounting();  // Inicia el proceso de conteo en el modelo.
    }
}

