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


    public static void main(String[] args) {
        int[] rs = new Random().ints(1, 50).limit(10).toArray();
        System.out.println(Arrays.toString(rs));
        System.out.println(Arrays.toString(sort(rs)));
    }
}


