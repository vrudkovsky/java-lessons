package lesson05.warmup;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class PlusMinus3 {
/**
 * https://www.hackerrank.com/challenges/plus-minus/problem
 */
    static double ratio(long n, int total) {
        return (double) n / total;
    }

    static Long filter(int[]a, IntPredicate f) {
        return Arrays.stream(a).filter(f).count();
    }

    static void plusMinus(int[] arr) {
        int len = arr.length;
        double[] ratios = new double[3];
        long gt0 = filter(arr, x -> x > 0);
        long lt0 = filter(arr, x -> x < 0);
        long eq0 = len - gt0 - lt0;
        ratios[0] = ratio(gt0, len);
        ratios[1] = ratio(lt0, len);
        ratios[2] = ratio(eq0, len);
        for (double r: ratios) System.out.printf("%f\n", r);
    }
}
