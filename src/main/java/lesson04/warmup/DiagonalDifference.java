package lesson04.warmup;

        import java.util.List;
        import java.util.stream.IntStream;

/**
 * https://www.hackerrank.com/challenges/diagonal-difference/problem
 */
public class DiagonalDifference {

    public static int[][] convert(List<List<Integer>> a) {
        int size = a.size();
        int[][] res = new int[size][size];
        IntStream.range(0, size).forEach(y ->
                IntStream.range(0, size).forEach(x ->
                        res[y][x] = a.get(y).get(x)));
        return res;
    }

    public static int diagonalDifferenceV1(List<List<Integer>> arr) {
        int[][] a = convert(arr);
        int d1 = 0;
        int d2 = 0;
        int size = a.length;

        for (int i = 0; i < size; i++) {
            d1 = d1 + a[i][i];
        }
        for (int i = 0; i < size; i++) {
            int i_inv = size - i - 1;
            d2 = d2 + a[i][i_inv];
        }
        int r = Math.abs(d1 - d2);
        return r;
    }

    public static int diagonalDifferenceV2(List<List<Integer>> arr) {
        int[][] a = convert(arr);
        int d1 = 0;
        int d2 = 0;
        int size = a.length;

        for (int i = 0; i < size; i++) {
            d1 = d1 + a[i][i];
            d2 = d2 + a[i][size - i - 1];
        }
        int r = Math.abs(d1 - d2);
        return r;
    }

    public static int diagonalDifferenceV3(List<List<Integer>> arr) {
        int[][] a = convert(arr);
        int d = 0;
        int size = a.length;

        for (int i = 0; i < size; i++) {
            d += a[i][i] - a[i][size - i - 1];
        }
        return Math.abs(d);
    }

    public static int diagonalDifferenceV4(List<List<Integer>> arr) {
        int[][] a = convert(arr);
        int size = a.length;
        int sum = IntStream.range(0, size)
                .map(i -> a[i][i] - a[i][size - i - 1])
                .reduce(0, (r, item) -> r + item);
        return Math.abs(sum);
    }

    public static int diagonalDifferenceV5(List<List<Integer>> a) {
        int size = a.size();
        int sum = IntStream.range(0, size)
                .map(i -> a.get(i).get(i) - a.get(i).get(size - i - 1))
                .sum();
        return Math.abs(sum);
    }

}
