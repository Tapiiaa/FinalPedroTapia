package AnalizadorDeCódigo.Main;

import AnalizadorDeCódigo.Analyzer.Analyzer;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;

public class MainGUI {
    private JFrame frame;
    private JTextField inputField;
    private JButton analyzeButton;
    private JTextArea resultArea;
    private JTextArea rulesArea;  // Define el JTextArea para las reglas

    public MainGUI() {
        initializeUI();
    }

    private void initializeUI() {
        frame = new JFrame("Analizador de Código");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // Configuración del campo de entrada
        inputField = new JTextField(20);

        // Botón de análisis
        analyzeButton = new JButton("Analizar");

        // Área de resultado
        resultArea = new JTextArea(10, 30);
        resultArea.setEditable(false);

        // Área de reglas
        rulesArea = new JTextArea("Normas para el uso del analizador:\n" +
                "Norma 1: Ingresa el código 'CountUp' o 'CountDown'.\n" +
                "         Ejemplo CountUp: for (int i = 0; i < 10; i++) { ... }\n" +
                "         Ejemplo CountDown: for (int i = 10; i >= 0; i--) { ... }\n" +
                "Norma 2: Evita dar intro, escribe de seguido para que el programa detecte correctamente cada sentencia.\n" +
                "         Asegúrate de incluir todo el bucle en una sola línea.");
        rulesArea.setEditable(false);
        rulesArea.setWrapStyleWord(true);
        rulesArea.setLineWrap(true);
        rulesArea.setBackground(new Color(233, 236, 239)); // Un color de fondo claro
        rulesArea.setFont(new Font("Arial", Font.PLAIN, 12)); // Fuente legible
        rulesArea.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Espacio en el borde

        // Layout
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(rulesArea);
        panel.add(inputField);
        panel.add(analyzeButton);
        panel.add(new JScrollPane(resultArea));
        frame.add(panel);

        // Configuración del botón
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
