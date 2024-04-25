package cond;

public class Switch {
    public static void main(String[] args) {
        //자바 14부터 사용할 수 있는 코드

        int grade = 2;
        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
