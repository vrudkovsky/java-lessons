package lessonA6;

import java.util.stream.Stream;

public class SortApp {


//    public static int cmp(int a, int x) {
//        int result;
//        if (a < x) result = -1;
//        else if (a > x) result = 1;
//        else return result = 0;
//        return result;
//    }

    /**
     * @param as - sorted array of ints
     */
    public static boolean contains(int[] as, int x) {
        if (x < as[0]) return false;
        if (x > as[as.length - 1]) return false;
        int l = 0;
        int r = as.length - 1;
        while (l <= r) {
            int m = (l + r) >> 1;
            if (x < as[m]) r = m - 1;
            else if (x > as[m]) l = m + 1;
            else return true;
        }
        return false;
    }

    public static boolean containsr(int[] as, int x, int l, int r) {
//        throw new IllegalArgumentException("Not yet");
        if (l > r) return false;
        int m = (l + r) >> 1;
        if (x < as[m]) return containsr(as, x, l, m - 1); // can be lambda!!!
        else if (x > as[m]) return containsr(as, x, m + 1, r);
        else return true;

    }

    public static boolean containsr(int[] as, int x) {
        if (x < as[0]) return false;
        if (x > as[as.length - 1]) return false;
        return containsr(as, x, 0, as.length - 1);
    }

    public static <A extends Comparable<A>> boolean containsGeneric(A[] as, A x) {
        int r = as[0].compareTo(x);
        return true;
    }

    public static void main(String[] args) {

        int[] data = {1, 2, 3, 5, 10};
//        String[] chars = {"222", "Abcd", "aBc", "ab", "az", "z"};

        // 1_000_000
        int[] data1 = Stream.generate(() -> (int) (Math.random() * 2_000_000))
                .mapToInt(a -> a)
                .limit(1_000_000)
                .toArray();

        // 100_000
        int[] data2 = Stream.generate(() -> (int) (Math.random() * 2_000_000))
                .mapToInt(a -> a)
                .limit(100_000)
                .toArray();


//        System.out.println(contains(data, 5));
        System.out.println(containsr(data, 5));
//        System.out.println(containsGeneric(chars, "a"));
//        System.out.println(containsGeneric(chars, "az"));

    }

}
