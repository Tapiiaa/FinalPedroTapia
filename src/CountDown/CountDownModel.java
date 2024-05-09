package CountDown;


import javax.swing.*;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

public class CountDownModel {
    private int count;
    private SwingWorker<Void, Integer> worker;
    private PropertyChangeSupport pcs;

    public CountDownModel(int start) {
        this.count = start;
        this.pcs = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
        this.pcs.addPropertyChangeListener(propertyName, listener);
    }

    public void startCounting() {
        worker = new SwingWorker<Void, Integer>() {
            @Override
            protected Void doInBackground() throws Exception {
                int oldCount;
                while (count >= 0 && !isCancelled()) {
                    oldCount = count;
                    publish(count);
                    count--;
                    Thread.sleep(500);  // 0.5 segundos entre conteos
                    pcs.firePropertyChange("count", oldCount, count);
                }
                return null;
            }

            @Override
            protected void process(java.util.List<Integer> chunks) {
                // Actualiza algún componente de la UI si es necesario, aunque los listeners ya manejan esto
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

