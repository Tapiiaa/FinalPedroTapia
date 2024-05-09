package Reverser;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ReverserView extends JFrame {
    private JTextArea codeArea;
    private JButton analyzeButton;
    private JLabel resultLabel;

    public ReverserView() {
        super("Reverser Simulation");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        codeArea = new JTextArea(10, 30);
        JScrollPane scrollPane = new JScrollPane(codeArea);

        analyzeButton = new JButton("Analyze");
        resultLabel = new JLabel(" Enter code and press Analyze.");

        add(scrollPane, BorderLayout.CENTER);
        add(analyzeButton, BorderLayout.SOUTH);
        add(resultLabel, BorderLayout.NORTH);
    }

    public void setAnalyzeButtonAction(ActionListener actionListener) {
        analyzeButton.addActionListener(actionListener);
    }

    public String getCode() {
        return codeArea.getText();
    }

    public void setResultText(String text) {
        resultLabel.setText(text);
    }
}
