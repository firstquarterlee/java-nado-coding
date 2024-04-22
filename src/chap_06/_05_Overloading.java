package chap_06;

public class _05_Overloading {
    public static int getPower(int number) {
        int result = number * number;
        return result;
        // return number * number;
    }

    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }


    public static void main(String[] args) {
        // 메소드 오버로딩 -> 이름이 같은 메소드를 여러개 만드는 것.
        // 같은 이름의 메소드를 여러 번 선언
        // 1. 전달값(파라미터)의 타입이 다르거나
        // 2. 전달값의 갯수가 다르거나
        System.out.println(getPower(3)); // 3 * 3 = 9
        System.out.println(getPower("4")); // 4 * 4 = 16
        System.out.println(getPower(3, 3)); // 3 * 3 * 3 = 27
    }
        /*
        메소드 오버로딩은 전달값의 타입이 다르거나 전달값의 자료형이 다르거나
        또는 전달값의 개수가 다르면 똑같은 이름의 메소드를 얼마든지 중복해서 선언할 수가있다.
        */
}
