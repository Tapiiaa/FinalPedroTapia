package CountUp;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CountUpView extends JFrame {
    private JButton startButton;
    private JLabel countLabel;

    public CountUpView() {
        setTitle("Count Up");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        initializeComponents();
    }

    private void initializeComponents() {
        startButton = new JButton("Start Counting");
        countLabel = new JLabel("Count: 0");
        add(startButton);
        add(countLabel);
    }

    public void setCountDisplay(int count) {
        countLabel.setText("Count: " + count);
    }

    public void addStartCountingListener(ActionListener listener) {
        startButton.addActionListener(listener);
    }
}
