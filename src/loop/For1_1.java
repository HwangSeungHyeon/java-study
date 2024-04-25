package loop;

public class For1_1 {
    public static void main(String[] args) {
        int sum = 0;
        int endNum = 15;
        for (int i=2; i<=endNum; i+=2){
            sum += i;
        }
        System.out.println("2부터 10까지 짝수의 합 = " + sum);

        int n = endNum/2;
        System.out.println("2부터 10까지 짝수의 합 = " + n * (n + 1));
    }
}
