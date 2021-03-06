package lesson04;

public class Methods2 {
    int c;

    public Methods2(int c) {
        this.c = c;
    }

    public int add(int a, int b) {
        int c = 33;
        return a + b + this.c + c;
    }
}
