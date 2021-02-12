package lesson01;

public class Rectangle {

    public static void print(String s) {
        System.out.print(s);
    }

    public static boolean isBorder(int i, int j, int h, int w) {
        return j == 0 || j == w - 1 || i == 0 || i == h - 1;
    }

    public static boolean isDiagonal(int i, int j, int h, int w) {
        double k = ((double) w) / h;
        int ik = (int) (i * k);
        int i_mirrored = w - ik - 1;
        return ik == j               //from left-top to right-bottom
                || i_mirrored == j;     //from right-top to left-bottom
    }

    public static boolean isVisible(int i, int j, int h, int w) {
        return isBorder(i, j, h, w) || isDiagonal(i, j, h, w);

    }

    public static void drawEnvelope(int W, int H) {
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                print(isVisible(i, j, H, W) ? "*" : " ");
            }
            print("\n");
        }
    }

    public static void main(String[] args) {
        drawEnvelope(20, 7);
    }
}
