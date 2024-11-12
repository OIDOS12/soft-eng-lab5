package labN5;

/**
 * Demonstrates the use of the labN5.EncapsulatedArrayList class by adding elements
 * and performing both sequential and sorted iteration.
 */
public class Main {
    /**
     * The main method that executes the example, adding elements to an
     * labN5.EncapsulatedArrayList and printing them in sequential and sorted order.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        EncapsulatedArrayList<Integer> list = new EncapsulatedArrayList<>();

        list.add(5);
        list.add(1);
        list.add(3);
        list.add(7);
        list.add(6);
        list.add(9);

        System.out.println("Звичайний послідовний обхід:");
        for (Integer el : list.getIterator()) {
            System.out.println(el);
        }

        System.out.println("Послідовний обхід у впорядкованій структурі:");
        for (Integer el : list.getSortedIterator()) {
            System.out.println(el);
        }
    }
}
