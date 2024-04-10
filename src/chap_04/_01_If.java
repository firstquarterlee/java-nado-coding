package chap_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 if
        int hour = 10; // 오전 10시
        /*
        if ( 조건 ) {
            ... 수행할 명령 ...
        }
         */
        // if 문 내에서 하나의 문장을 실행할 때는 { } 생략 가능.
        // if 문 내에서 2개 이상의 문장을 실행할 때는 { } 생략 불가.
        if(hour < 14) {
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷추가");
        }
        System.out.println("커피 주문 완료");

    }
}
