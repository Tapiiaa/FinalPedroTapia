package CountDown;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CountDownView extends JFrame {
    private JButton countButton;
    private JLabel countLabel;

    public CountDownView() {
        setTitle("Count Down");
        setSize(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        initializeComponents();
    }

    private void initializeComponents() {
        countButton = new JButton("Count Down");
        countLabel = new JLabel("10");
        add(countButton);
        add(countLabel);
    }

    public void setCountDisplay(int count) {
        countLabel.setText(String.valueOf(count));
    }

    public void addCountButtonListener(ActionListener listener) {
        countButton.addActionListener(listener);
    }
}
