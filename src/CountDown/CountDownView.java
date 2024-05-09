package CountDown;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CountDownView extends JFrame {
    private JButton startButton;
    private JLabel countLabel;

    public CountDownView() {
        setTitle("Count Down");
        setSize(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        initializeComponents();
    }

    private void initializeComponents() {
        startButton = new JButton("Start Counting Down");
        countLabel = new JLabel("Waiting to start...");
        add(startButton);
        add(countLabel);
    }

    public void setCountDisplay(int count) {
        countLabel.setText("Count: " + count);
    }

    public void addStartButtonListener(ActionListener listener) {
        startButton.addActionListener(listener);
    }
}

