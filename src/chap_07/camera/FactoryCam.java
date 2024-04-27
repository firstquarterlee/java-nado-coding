package chap_07.camera;

public class FactoryCam extends Camera { // 자식 클래스, 부모는 딱 하나의 클래스로만 정의할 수 있습니다.
    public FactoryCam() {
        this.name = "공장 카메라";
    }

    public void detectFire() {
        // 화재 감지
        System.out.println("화재를 감지합니다.");
    }

    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 화재 감지");
    }
}
