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
                while (!isCancelled()) {
                    count++;
                    publish(count);
                    Thread.sleep(1000);  // Simula tiempo de procesamiento
                }
                return null;
            }

            @Override
            protected void process(java.util.List<Integer> chunks) {
                // Aquí podrías actualizar la GUI si fuera necesario
            }
        };
        worker.execute();
    }

    public int getCount() {
        return count;
    }

    public void stopCounting() {
        if (worker != null) {
            worker.cancel(true);
        }
    }
}