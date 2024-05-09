package CountUp;


import javax.swing.*;
import java.beans.PropertyChangeSupport;

public class CountUpModel {
    private int count;
    private SwingWorker<Void, Integer> worker;
    private PropertyChangeSupport pcs;

    public CountUpModel() {
        this.count = 0;
        this.pcs = new PropertyChangeSupport(this);
    }

    public void startCounting() {
        worker = new SwingWorker<Void, Integer>() {
            @Override
            protected Void doInBackground() throws Exception {
                while (!isCancelled()) {
                    count++;
                    pcs.firePropertyChange("count", count - 1, count);
                    Thread.sleep(500);  // Espera de 0.5 segundos entre incrementos
                }
                return null;
            }
        };
        worker.execute();
    }

    public void addPropertyChangeListener(String propertyName, java.beans.PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(propertyName, listener);
    }
}
