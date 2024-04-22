package chap_07;

public class _01_Class {
    public static void main(String[] args) {
        // 객체 지향 프로그래밍 (OOP : Object-Oriented Programming)
        // 유지보수 용이
        // 높은 재사용성
        // + 모든것이 객체로 이루어져 있다.

        // 차량용 블랙박스
        // 모델명, 해상도, 가격, 색상

        // 우리가 만든 첫 번째 제품
        String modelName = "까망이";
        String resolution = "FHD";
        int price = 200000;
        String color = "블랙";

        // 새로운 제품을 개발
        String modelName2 = "하양이";
        String resolution2 = "UHD";
        int price2 = 300000;
        String color2 = "화이트";

        // 또 다른 제품 개발?
        BlackBox bbox = new BlackBox(); // -> 이게 블랙박스라는 클래스로부터 bbox라는 객체를 만드는 과정이다.
        // BlackBox 클래스로부터 bbox라는 객체 생성했다.
        // bbox 객체는 BlackBox 클래스의 인스턴스라고 표현한다.
        // 클래스는 설계도다. 객체는 그 설계도로부터 만들어진 어떤 결과물이다.

        BlackBox bbox2 = new BlackBox();
    }
}
