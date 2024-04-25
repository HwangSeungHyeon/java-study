package loop.ex;

public class LoopEx1 {
    public static void main(String[] args) {
        int count=1;

        while(count < 11){
            System.out.println(count++);
        }

        for (count=1; count < 11; count++){
            System.out.println(count);
        }
    }
}
