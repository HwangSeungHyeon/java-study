package array.ex;

import java.util.Arrays;

public class ArrayEx1 {
    public static void main(String[] args) {
        int [] students= {90, 80, 70, 60, 50};

//        int total = Arrays.stream(students).sum();
        int total = 0;
        for(int i : students){
            total += i;
        }

        double avg = (double) total / 5;

        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + avg);
    }
}
