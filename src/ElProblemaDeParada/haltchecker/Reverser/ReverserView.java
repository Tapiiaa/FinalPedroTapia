
package ElProblemaDeParada.haltchecker.Reverser;
/**
 * Vista para la simulación de ElProblemaDeParada.haltchecker.Reverser.
 * @autor Pedro Alonso Tapia Lobo
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ReverserView extends JFrame {
    private JButton countUpButton;
    private JButton countDownButton;
    private JButton reverserButton;
    private JTextArea resultArea;

    public ReverserView() {
        setTitle("ElProblemaDeParada.haltchecker.Reverser Simulation");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        initializeComponents();
    }

    private void initializeComponents() {
        JPanel buttonPanel = new JPanel(new GridLayout(1, 3));
        countUpButton = new JButton("CountUp");
        countDownButton = new JButton("CountDown");
        reverserButton = new JButton("Reverser");

        buttonPanel.add(countUpButton);
        buttonPanel.add(countDownButton);
        buttonPanel.add(reverserButton);

        add(buttonPanel, BorderLayout.NORTH);

        resultArea = new JTextArea("Results will appear here...");
        resultArea.setEditable(false);
        add(new JScrollPane(resultArea), BorderLayout.CENTER);
    }

    public void addCountUpButtonListener(ActionListener listener) {
        countUpButton.addActionListener(listener);
    }

    public void addCountDownButtonListener(ActionListener listener) {
        countDownButton.addActionListener(listener);
    }

    public void addReverserButtonListener(ActionListener listener) {
        reverserButton.addActionListener(listener);
    }

    public void displayResult(String result) {
        resultArea.setText(result);
    }

    public String getCodeInput() {
        return JOptionPane.showInputDialog("Introduce el código a analizar:");
    }
}

