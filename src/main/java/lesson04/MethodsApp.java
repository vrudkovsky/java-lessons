package lesson04;

public class MethodsApp {
    public static int add(int x, int y) {
        return x + y;
    }

    public static int add(int... as) {
        int sum = 0;
        for (int a: as) sum += a;
        return sum;
    }

    public static int add(int a, int b, int c) {
        return add(
                add(a, b),
                c
        );
    }

    public static int add(int a, int b, int c, int d) {
        return add(
                add(a, b),
                add(c, d)
        );
    }

    public static int addN1(int... as) {
        int sum = 0;
        for (int a: as) {
            sum += a;
        }
        return sum;
    }


//  public static int add(int[] as) {
//    int sum = 0;
//    for (int a: as) sum += a;
//    return sum;
//  }

    public static void main(String[] args) {
        add(1,2);
        add(1,2,5);
        add(1,2,5,6);
        add(1,2,3,4,5,6);
        add(1,2,3,4,5,6,7,8);
        add(1,2,3,4,5,6,7,8,10);
    }
}
