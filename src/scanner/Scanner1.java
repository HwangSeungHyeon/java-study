package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열 입력 : ");
        String str = scanner.nextLine(); //입력을 String으로 가져옮
        System.out.println("str = " + str);

        System.out.print("정수 입력 : ");
        int intValue = scanner.nextInt(); //입력을 Int로 가져옮
        System.out.println("int = " + intValue);

        System.out.print("실수 입력 : ");
        double doubleValue = scanner.nextDouble(); //입력을 double로 가져옮
        System.out.println("doubleValue = " + doubleValue);
    }
}
