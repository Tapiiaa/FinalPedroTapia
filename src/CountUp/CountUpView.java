package CountUp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CountUpView extends JFrame {
    private JButton countButton;
    private JButton stopButton;
    private JLabel countLabel;

    public CountUpView() {
        setTitle("Count Up");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        initializeComponents();
    }

    private void initializeComponents() {
        countButton = new JButton("Start Counting");
        stopButton = new JButton("Stop Counting");
        countLabel = new JLabel("0");
        add(countButton);
        add(stopButton);
        add(countLabel);
    }

    public void setCountDisplay(int count) {
        countLabel.setText("Count: " + count);
    }

    public void addStartCountingListener(ActionListener listener) {
        countButton.addActionListener(listener);
    }

    public void addStopCountingListener(ActionListener listener) {
        stopButton.addActionListener(listener);
    }
}


