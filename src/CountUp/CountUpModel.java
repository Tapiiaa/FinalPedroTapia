package CountUp;
import javax.swing.*;

public class CountUpModel {
    private int count;
    private SwingWorker<Void, Integer> worker;

    public CountUpModel() {
        this.count = 0;
    }

    public void startCounting() {
        worker = new SwingWorker<Void, Integer>() {
            @Override
            protected Void doInBackground() throws Exception {
                while (!isCancelled()) {  // Bucle while para contar indefinidamente
                    count++;
                    publish(count);
                    Thread.sleep(1000);  // Simula el tiempo entre conteos
                }
                return null;
            }

            @Override
            protected void process(java.util.List<Integer> chunks) {
                // Puede usar este método para actualizar la interfaz de usuario con los resultados intermedios
                int lastCount = chunks.get(chunks.size() - 1);
                System.out.println("Count is now: " + lastCount);
            }
        };
        worker.execute();
    }

    public void stopCounting() {
        if (worker != null) {
            worker.cancel(true);
        }
    }

    public int getCount() {
        return count;
    }
}
