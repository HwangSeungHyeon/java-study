package loop;

public class DoWhile1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 3;

        do {
            sum += i;
            i++;
        } while (i <= endNum);
        System.out.println(sum);
    }
}
