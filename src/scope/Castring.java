package scope;

public class Castring {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int 타입이 long 타입으로 자동 형변환
        //long maxIntOver = 2147483648; //int 타입의 최대값을 넘었기 때문에 오류 생김
        long maxIntOver = 2147483648L; //long 타입으로 묵시적 형변환을 했기 때문에 오류 안 생김

        int intValue = (int) maxIntValue;
        System.out.println("maxIntValue casting " + intValue);

        intValue = (int) maxIntOver; //int 최대값보다 커서 overflow 발생
        System.out.println("maxIntOver casting " + intValue);
    }
}
