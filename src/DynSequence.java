// Michelle Pohl
public class DynSequence {
    private double[] array;

    public DynSequence() {
        array = new double[0];
    }

    public int size() {
        return array.length;
    }

    public boolean isEmpty() {
        return array.length == 0;
    }

    public void insertValueAt(double value, int index) {
        if (index < 0) {
            index = 0;
        } else if (index > array.length) {
            index = array.length;
        }

        double[] newArray = new double[array.length + 1];
        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == index) {
                newArray[i] = value;
            } else {
                newArray[i] = array[j++];
            }
        }
        array = newArray;
    }

    public double removeValueAt(int index) {
        if (index < 0 || index >= array.length) {
            return Double.NaN;
        }

        double removedValue = array[index];
        double[] newArray = new double[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != index) {
                newArray[j++] = array[i];
            }
        }
        array = newArray;
        return removedValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Inhalt:");
        for (double value : array) {
            sb.append(" ").append(value);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        DynSequence sequence = new DynSequence();

        for (double i = 0.5; i <= 9.5; i += 1.0) {
            sequence.insertValueAt(i, 0);  // Einfügen am Anfang
        }

        System.out.println(sequence);

        sequence.removeValueAt(sequence.size() - 2);
        System.out.println(sequence);

        sequence.removeValueAt(sequence.size() - 3);
        System.out.println(sequence);

        sequence.removeValueAt(sequence.size() - 4);
        System.out.println(sequence);
    }
}

