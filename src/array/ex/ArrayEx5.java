package array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int size = scanner.nextInt();

        int [] nums = new int[size];

        System.out.println(size + "개의 정수를 입력하세요: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("가장 큰 정수: " + Arrays.stream(nums).max().getAsInt());
        System.out.println("가장 작은 정수: " + Arrays.stream(nums).min().getAsInt());
    }
}
