package loop.ex;

public class LoopEx2 {
    public static void main(String[] args) {
        int num = 2;
        int cnt = 0;

        while (cnt < 10) {
            System.out.println(num);
            num += 2;
            cnt++;
        }

        for (cnt = 0, num = 2; cnt < 10; num += 2, cnt++) {
            System.out.println(num);
        }

        num=2;
        for (cnt = 0; cnt < 10; cnt++) {
            System.out.println(num);
            num += 2;
        }
    }
}
