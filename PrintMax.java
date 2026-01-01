public class PrintMax {

    static <T extends Comparable<T>> void printmax(T a, T b, T c) {

        T max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }

        System.out.println("max value : " + max);
    }

    public static void main(String[] args) {

        printmax(10, 20, 5);
        printmax(1.1f, 0.5f, 3.3f);
        printmax("apple", "peach", "banana");
    }
}
