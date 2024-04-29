package chap_07.camera;

// FacgtoryCam is a Camera (IS-A) -> 상속 관계는 IS-A 관계다.
public class FactoryCam extends Camera { // 자식 클래스, 부모는 딱 하나의 클래스로만 정의할 수 있습니다.
    public FactoryCam() {
//        this.name = "공장 카메라";
        //super(); //부모클래스의 생성자에 바로 접근하는 것
        super("공장카메라");
    }

    public void recordVideo() {
        // 동영상 녹화
        super.recordVideo();
        detectFire();
    }

    public void detectFire() {
        // 화재 감지
        System.out.println("화재를 감지합니다.");
    }

    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 화재 감지");
    }
}
