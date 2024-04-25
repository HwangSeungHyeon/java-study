package loop.ex;

public class LoopEx6 {
    public static void main(String[] args) {
        int rows = 5;
        int width = rows * 2; //10
        int center = width / 2; //5
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < width; j++) {
                if (j <= center - i || j >= center + i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
