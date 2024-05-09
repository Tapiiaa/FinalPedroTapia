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
/**
 * Controlador para la vista de ElProblemaDeParada.haltchecker.Reverser.
 * @autor Pedro Alonso Tapia Lobo
 */
import ElProblemaDeParada.haltchecker.haltchecker.HaltChecker;

import javax.swing.*;

public class ReverserController {
    private ReverserView view;

    public ReverserController(ReverserView view) {
        this.view = view;
        initView();
    }

    private void initView() {
        view.setVisible(true);
        view.addCountUpButtonListener(e -> handleCountUp());
        view.addCountDownButtonListener(e -> handleCountDown());
        view.addReverserButtonListener(e -> handleReverser());
    }

    private void handleCountUp() {
        String codeType = "CountUp";
        boolean willHalt = HaltChecker.willHalt(codeType);

        // CountUp: Si el código no se detiene, mostramos un mensaje indicando que el programa terminará.
        if (!willHalt) {
            view.displayResult("CountUp code will never halt. Operation will terminate soon...");
            // No system exit, just a message indicating the program would end.
        } else {
            view.displayResult("Unexpected: CountUp code will halt.");
        }
    }

    private void handleCountDown() {
        String codeType = "CountDown";
        boolean willHalt = HaltChecker.willHalt(codeType);

        // CountDown: Si el código se detiene, entra en un bucle infinito.
        if (willHalt) {
            view.displayResult("CountDown code will halt. Now entering an infinite loop...");
            runInfiniteLoop();
        } else {
            view.displayResult("Unexpected: CountDown code will never halt.");
        }
    }

    private void handleReverser() {
        boolean willHalt = ReverserLogic.willHalt();
        // ElProblemaDeParada.haltchecker.Reverser: Comportamiento basado en la lógica simulada de si se detendrá o no.
        if (willHalt) {
            view.displayResult("ElProblemaDeParada.haltchecker.Reverser simulation will halt. Now entering an infinite loop...");
            runInfiniteLoop();
        } else {
            view.displayResult("ElProblemaDeParada.haltchecker.Reverser simulation detected to never halt. Terminating...");
            System.exit(0);
        }
    }

    private void runInfiniteLoop() {
        new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() {
                while (!isCancelled()) {
                    try {
                        Thread.sleep(1000);  // Reduce CPU usage while simulating infinite loop
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                return null;
            }

            @Override
            protected void done() {
                view.displayResult("Infinite loop was stopped unexpectedly.");
            }
        }.execute();
    }
}

