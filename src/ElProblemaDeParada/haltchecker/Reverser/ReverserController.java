//package ElProblemaDeParada.haltchecker.Reverser;
//
//import ElProblemaDeParada.haltchecker.haltchecker.HaltChecker;
//
//import javax.swing.*;
//
//public class ReverserController {
//    private ReverserView view;
//
//    public ReverserController(ReverserView view) {
//        this.view = view;
//        initView();
//    }
//
//    private void initView() {
//        view.setVisible(true);
//        view.addCountUpButtonListener(e -> handleCountUp());
//        view.addCountDownButtonListener(e -> handleCountDown());
//    }
//
//    private void handleCountUp() {
//        String codeType = "CountUp";
//        boolean willHalt = HaltChecker.willHalt(codeType);
//
//        // Si no se detiene, muestra el mensaje y no termina la aplicación.
//        if (!willHalt) {
//            view.displayResult("CountUp code will never halt. Terminating...");
//        } else {
//            view.displayResult("Unexpected: CountUp code will halt.");
//        }
//    }
//
//    private void handleCountDown() {
//        String codeType = "CountDown";
//        boolean willHalt = HaltChecker.willHalt(codeType);
//
//        // Si se detiene, CountDown entra en bucle infinito.
//        if (willHalt) {
//            view.displayResult("CountDown code will halt. Now entering an infinite loop...");
//            runInfiniteLoop();
//        } else {
//            view.displayResult("Unexpected: CountDown code will never halt.");
//        }
//    }
//
//    private void runInfiniteLoop() {
//        new SwingWorker<Void, Void>() {
//            @Override
//            protected Void doInBackground() {
//                while (!isCancelled()) {
//                    try {
//                        Thread.sleep(1000);  // Reduce CPU usage while simulating infinite loop
//                    } catch (InterruptedException e) {
//                        Thread.currentThread().interrupt();
//                    }
//                }
//                return null;
//            }
//
//            @Override
//            protected void done() {
//                view.displayResult("Infinite loop was stopped unexpectedly.");
//            }
//        }.execute();
//    }
//}

package ElProblemaDeParada.haltchecker.Reverser;


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

