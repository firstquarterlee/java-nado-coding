package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로

        // int to float, double
        int score = 93;
        System.out.println(score); // 93
        System.out.println((float)score); // 93.0
        System.out.println((double)score); // 93.0

        // float, double to int
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int)score_f); // 93
        System.out.println((int)score_d); // 98

        // 정수 + 실수 연산
        score = 93 + (int) 98.9; // 93 + 98
        System.out.println(score); // 191

        score_d = (double) 93 + 98.8; // 93.0 + 98.8
        System.out.println(score_d);

        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 191 -> 191.0
        // int -> long -> float -> double (자동 형변환됨)

        int convertedScoreInt = (int) score_d; // 191.8 -> 191
        // double -> float -> long -> int (수동 형변환)

        // 숫자를 문자열로
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93); // toString은 정수를 문자열로 바꿔줌
        //스트링이라는 클래스가 제공해주는 valueof라는 어떤 기능 써가지고 93을 문자열로 바꿔준거임
        System.out.println(s1); // 93

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        // Double이라는 클래스가 제공해주는 toString이라는 기능을 써가지고 이 실수를 문자로 바꿔주는 역할을 함
        System.out.println(s2);

        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        //"93"여기있는 문자열을 파싱한다고 표현하는데 여기에서 이제 93만큼을 꺼내 가지고 정수로 변환해주는것
        System.out.println(i); // 93
        double d = Double.parseDouble("98.8");
        System.out.println(d);

        int error = Integer.parseInt("자바");
    }
}
