package haltchecker;


public class HaltChecker {
    private Handler handlerChain;

    public HaltChecker() {
        setupChain();
    }

    private void setupChain() {
        Handler countUpHandler = new CountUpHandler();
        Handler countDownHandler = new CountDownHandler();

        countUpHandler.setNextHandler(countDownHandler); // Configura la cadena
        this.handlerChain = countUpHandler;
    }

    public String checkProgram(String program, String input) {
        boolean willHalt = handlerChain.handleRequest(program + " with input " + input);
        return willHalt ? "halts" : "never";
    }
}

