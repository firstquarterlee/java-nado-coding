package chap_07;

public class _03_ClassVariables {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        System.out.println(b1.modelName);

        BlackBox b2 = new BlackBox();
        b2.modelName = "하양이";
        System.out.println(b2.modelName);

        // 특정 범위를 초과하는 충돌 감지 시 자동 신고 기능 개발 여부
        System.out.println("- 개발 전 -");
        System.out.println(b1.modelName + " 자동 신고 기능 : " + b1.canAutoReport);
        System.out.println(b2.modelName + " 자동 신고 기능 : " + b2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + BlackBox.canAutoReport);

        // 기능 개발
        BlackBox.canAutoReport = true;

        System.out.println("- 개발 후 -");
        System.out.println(b1.modelName + " 자동 신고 기능 : " + b1.canAutoReport);
        System.out.println(b2.modelName + " 자동 신고 기능 : " + b2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + BlackBox.canAutoReport);

        /* 어떤 클래스로부터 만들어진 객체에다가 공통적으로 적용해야 되는 상황이 있다고 하면
           그 변수는 인스턴스 변수가 아니고 클래스 변수로 만들어 보는것을 고려해도 좋을 것 같다.*/
        // 또한 b1.canAutoReport -> BlackBox.canAutoReport(권장)
        // 객체 쩜! 으로 접근하지 말고 클래스 이름 쩜! 을 통해서 클래스 변수에 접근하는것이 권장되는 방식이다.
    }
}
