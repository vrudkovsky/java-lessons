package lesson12.warmup;

/**
 * https://www.hackerrank.com/challenges/counting-valleys/problem
 */
public class CountingValleysApp {

    public static int countingValleys(int steps, String path) {
        int count = 0;
        int level = 0;
        int prev;

        for (char step : path.toCharArray()) {
            prev = level;
            switch (step) {
                case 'U': level++; break;
                case 'D': level--; break;
            }
            if (level == 0 && prev < 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int r = countingValleys(8, "UDDDUDUU");

        System.out.println(r);
        Integer a = 5;
        Integer b = 4;
        Integer c = 6;
        Integer d = 5;
        System.out.printf("a > b : %d\n", a.compareTo(b));
        System.out.printf("a <  c : %d\n", b.compareTo(a));
        System.out.printf("a = d : %d\n", a.compareTo(d));

    }

}