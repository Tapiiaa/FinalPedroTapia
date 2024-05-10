package AnalizadorDeCódigo.Analyzer;

import AnalizadorDeCódigo.Handler.Handler;
import AnalizadorDeCódigo.Analizadores.PalabraReservadaHandler;
import AnalizadorDeCódigo.Analizadores.SintaxisHandler;
import AnalizadorDeCódigo.Analizadores.ParentesisHandler;


public class Analyzer {
    private Handler chain;

    public Analyzer() {
        buildChain();
    }

    private void buildChain() {
        chain = new PalabraReservadaHandler();
        Handler sintaxisHandler = new SintaxisHandler();
        Handler parentesisHandler = new ParentesisHandler();
        // Continuar conectando otros handlers...

        chain.setNext(sintaxisHandler);
        sintaxisHandler.setNext(parentesisHandler);
        // Configurar los siguientes handlers...
    }

    public String analyze(String request) {
        return chain.handle(request);
    }
}
