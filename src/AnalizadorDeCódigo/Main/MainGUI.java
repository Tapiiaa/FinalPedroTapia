package AnalizadorDeCódigo.Main;

import AnalizadorDeCódigo.Analyzer.Analyzer;

import javax.swing.*;

public class MainGUI {
    private JFrame frame;
    private JTextField inputField;
    private JButton analyzeButton;
    private JTextArea resultArea;

    public MainGUI() {
        initializeUI();
    }

    private void initializeUI() {
        frame = new JFrame("Analizador de Código");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        inputField = new JTextField(20);
        analyzeButton = new JButton("Analizar");
        resultArea = new JTextArea(10, 30);
        resultArea.setEditable(false);

        JPanel panel = new JPanel();
        panel.add(inputField);
        panel.add(analyzeButton);
        panel.add(new JScrollPane(resultArea));
        frame.add(panel);

        analyzeButton.addActionListener(e -> {
            String input = inputField.getText();
            Analyzer analyzer = new Analyzer();
            String result = analyzer.analyze(input);
            resultArea.setText(result);
        });

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MainGUI();
    }
}
