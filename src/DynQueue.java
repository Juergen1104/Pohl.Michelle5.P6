// Michelle Pohl
public class DynQueue extends DynSequence {

    public void enqueue(double value) {
        insertValueAt(value, size());
    }

    // c) Methode dequeue: Entfernt das Element am Anfang der Queue und gibt es zurück
    public double dequeue() {
        if (!isEmpty()) {
            return removeValueAt(0);
        }
        return Double.NaN;
    }

    public static void main(String[] args) {
        DynQueue queue = new DynQueue();

        for (int i = 0; i < 5; i++) {
            int randomValue = (int) (Math.random() * 100);
            queue.enqueue(randomValue);
            System.out.println(queue);
        }

        double sum = 0;
        while (!queue.isEmpty()) {
            double removedValue = queue.dequeue();
            System.out.println(queue);
            sum += removedValue;
        }

        System.out.println("Summe: " + sum);
    }
}
