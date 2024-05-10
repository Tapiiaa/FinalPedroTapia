
package ElProblemaDeParada.haltchecker.Reverser;

/**
 * Controlador de la aplicación Reverser.
 * @autor Pedro Alonso Tapia Lobo
 */

import ElProblemaDeParada.haltchecker.haltchecker.HaltChecker;
import ElProblemaDeParada.haltchecker.haltchecker.Handler;

public class ReverserController {
    private ReverserView view;
    private Handler chain;

    public ReverserController(ReverserView view) {
        this.view = view;
        initView();
        setupChain();
    }

    // Configura la cadena de responsabilidad
    private void setupChain() {
        InfiniteLoopHandler loopHandler = new InfiniteLoopHandler() {
            @Override
            public boolean handleRequest(String code) {
                return false;
            }
        };
        ForLoopHandler forLoopHandler = new ForLoopHandler() {
            @Override
            public boolean handleRequest(String code) {
                return false;
            }
        };

        loopHandler.setNextHandler(forLoopHandler);  // Enlaza el manejador de while con el de for
        this.chain = loopHandler;  // Inicia la cadena en el primer manejador
    }

    private void initView() {
        view.setVisible(true);
        view.addReverserButtonListener(e -> handleReverser());
        view.addCountUpButtonListener(e -> handleCountUp());
        view.addCountDownButtonListener(e -> handleCountDown());
    }

    private void handleReverser() {
        String code = view.getCodeInput();  // Obtén el código de la vista (debe estar implementado en ReverserView)
        boolean result = chain.handle(code);
        view.displayResult(result ? "Detected a potential infinite loop." : "No infinite loops detected.");
    }

    private void handleCountUp() {
        // Muestra el mensaje "Terminando inmediatamente"
        view.displayResult("Count Up no parará.Terminando inmediatamente");
    }

    private void handleCountDown() {
        // Muestra un mensaje indicando "Parará. Bucle infinito" y entra en un bucle infinito.
      view.displayResult("Count Down parará. Bucle infinito");
    }
}

