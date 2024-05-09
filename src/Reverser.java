import java.util.concurrent.Callable;

public class Reverser implements Callable<Boolean> {

    private String programa;

    public Reverser(String programa) {
        this.programa = programa;
    }

    public Boolean llamada(){
        return true;
    }
    @Override
    public Boolean call() throws Exception {
        return null;
    }
}
