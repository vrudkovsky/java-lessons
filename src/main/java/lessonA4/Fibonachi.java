package lessonA4;

import java.util.HashMap;
import java.util.Map;

public class Fibonachi {
    static Map<Integer, Long> cache = new HashMap<>();

    public static long fibo(int n) {
        if (n == 1 || n == 2) return 1;
        return fibo(n - 1) + fibo(n - 2);
    }

    public static long fibo2(int n, Map<Integer, Long> cache) {
        if (n <= 2) {
            Fibonachi.cache.put(1, 1L);
            Fibonachi.cache.put(2, 1L);
            return 1;
        }

        long f1;
        if (Fibonachi.cache.containsKey(n - 1)) {
            f1 = Fibonachi.cache.get(n - 1);
        } else {
            f1 = fibo2(n - 1, Fibonachi.cache);
            Fibonachi.cache.put(n - 1, f1);
        }

        long f2;
        if (Fibonachi.cache.containsKey(n - 2)) {
            f2 = Fibonachi.cache.get(n - 2);
        } else {
            f2 = fibo2(n - 2, Fibonachi.cache);
            Fibonachi.cache.put(n - 2, f2);
        }
        return f1 + f2;
    }

    public static void main(String[] args) {
        System.out.printf("fibonachi 100 = %d\n", fibo2(100, cache));
    }
}


