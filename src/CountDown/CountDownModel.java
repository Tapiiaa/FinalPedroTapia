package CountDown;

import javax.swing.*;

public class CountDownModel {
    private int count;
    private SwingWorker<Void, Integer> worker;

    public CountDownModel() {
        this.count = 10;
    }

    public void startCounting() {
        worker = new SwingWorker<Void, Integer>() {
            @Override
            protected Void doInBackground() throws Exception {
                for (int i = count; i >= 0; i--) {
                    count = i;
                    publish(count);
                    Thread.sleep(1000);  // Simula tiempo de procesamiento
                    if (count == 0) {
                        break;
                    }
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
