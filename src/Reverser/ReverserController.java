package Reverser;


import haltchecker.HaltChecker;

import javax.swing.*;

public class ReverserController {
    private ReverserView view;

    public ReverserController(ReverserView view) {
        this.view = view;
        initView();
    }

    private void initView() {
        view.setVisible(true);
        view.setAnalyzeButtonAction(e -> analyzeCode());
    }

    private void analyzeCode() {
        String code = view.getCode();
        if (HaltChecker.willHalt(code)) {
            view.setResultText("Code will halt. This would enter an infinite loop...");
            // Simulamos un bucle infinito sin bloquear la GUI
            SwingUtilities.invokeLater(() -> {
                while (true);  // Esto bloquearía la GUI en la vida real
            });
        } else {
            view.setResultText("Code will never halt. Terminating...");
            System.exit(0);  // Termina el programa
        }
    }
}
