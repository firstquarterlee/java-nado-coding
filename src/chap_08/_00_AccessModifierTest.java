package chap_08;

import chap_07.*;

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이"; // public
        //b1.getResolution = "FHD"; // 에러남, default는 같은 패키지안에서만 사용가능하기때문
        //b1.price = 200000; // private, 에러남, private는 해당 클래스 내에서만 접근 가능하기때문
        //b1.color = "블랙"; //protected, 에러남, protected는 같은 패키지 내에서, 다른 패키지인 경우 자식 클래스에서 접근 가능하기때문
    }
}
