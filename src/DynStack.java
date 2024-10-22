// Michelle Pohl
public class DynStack extends DynSequence {

    // b) Methode push
    public void push(double value) {
        insertValueAt(value, size());
    }

    // b) Methode pop
    public double pop() {
        if (!isEmpty()) {
            return removeValueAt(size() - 1);
        }
        return Double.NaN; // Wenn der Stack leer ist
    }

    public static void main(String[] args) {
        DynStack stack = new DynStack();

        for (int i = 0; i < 5; i++) {
            int randomValue = (int) (Math.random() * 100);
            stack.push(randomValue);
            System.out.println(stack);
        }

        double sum = 0;
        // Entferne alle Elemente aus dem Stack und gib sie aus
        while (!stack.isEmpty()) {
            double removedValue = stack.pop();
            System.out.println(stack);
            sum += removedValue;
        }

        System.out.println("Summe: " + sum);
    }
}
