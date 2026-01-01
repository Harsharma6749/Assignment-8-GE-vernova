import java.util.Arrays;

public class MaxMore {

    static <T extends Comparable<T>> T max(T... values) {

        Arrays.sort(values);
        return values[values.length - 1];
    }

    public static void main(String[] args) {

        System.out.println(max(1, 4, 6, 2, 9));
        System.out.println(max(1.1f, 5.5f, 3.3f, 9.9f));
        System.out.println(max("apple", "banana", "peach", "grapes"));
    }
}
