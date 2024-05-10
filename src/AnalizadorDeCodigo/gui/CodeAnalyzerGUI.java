package AnalizadorDeCodigo.gui;
// gui/CodeAnalyzerGUI.java

import AnalizadorDeCodigo.handlers.Handler;
// gui/CodeAnalyzerGUI.java



import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CodeAnalyzerGUI extends JFrame {
    private JTextArea codeInputArea;
    private JButton analyzeButton;
    private JTextArea resultArea;
    private Handler lexicalHandler;

    public CodeAnalyzerGUI(Handler lexicalHandler) {
        this.lexicalHandler = lexicalHandler;
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Code Analyzer");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        codeInputArea = new JTextArea("Escribe tu código aquí...");
        JScrollPane scrollPaneInput = new JScrollPane(codeInputArea);
        add(scrollPaneInput, BorderLayout.CENTER);

        analyzeButton = new JButton("Analizar Código");
        analyzeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                analyzeCode(codeInputArea.getText());
            }
        });
        add(analyzeButton, BorderLayout.SOUTH);

        resultArea = new JTextArea(10, 40);
        resultArea.setEditable(false);
        JScrollPane scrollPaneResult = new JScrollPane(resultArea);
        add(scrollPaneResult, BorderLayout.EAST);
    }

    private void analyzeCode(String code) {
        resultArea.setText("Iniciando análisis...\n");
        lexicalHandler.handleRequest(code);
    }
}
