package lesson04.warmup;

import java.util.Arrays;
import java.util.Random;

public class Sort {
    public static int[] sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        return a;
    }

    public static int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int ai = 0;
        int bi = 0;
        int ci = 0;

        while (ai < a.length && bi < b.length) {
            if (a[ai] < b[bi]) {
                c[ci++] = a[ai++];
            } else {
                c[ci++] = b[bi++];
            }
        }

        while (ai < a.length) {
            c[ci++] = a[ai++];
        }

        while (bi < b.length) {
            c[ci++] = b[bi++];
        }

        return c;
    }


    public static void main(String[] args) {
        int[] rs = new Random().ints(1, 50).limit(10).toArray();
        System.out.println(Arrays.toString(rs));
        System.out.println(Arrays.toString(sort(rs)));

        System.out.println(Arrays.toString(
                merge(new int[]{1, 2, 100, 200}, new int[]{3, 4, 5})
        ));
        System.out.println(Arrays.toString(
                merge(new int[]{}, new int[]{3, 4, 5})
        ));
        System.out.println(Arrays.toString(
                merge(new int[]{1, 2, 100, 200}, new int[]{})
        ));
    }
}


