package chap_07.camera;

// SpeedCam is a Camera
public class SpeedCam extends Camera { // 자식 클래스
    public SpeedCam() {
        this.name = "과속단속 카메라";
    }

    public void checkSpeed() {
        // 속도 체크
        System.out.println("속도를 측정합니다.");
    }

    public void recognizeLicensePlate() {
        // 번호 인식
        System.out.println("차량 번호를 인식합니다.");
    }

    @Override // annotation -> 컴파일러한테 오버라이딩하는거라고 말해주는거다.
    public void showMainFeature() {
            System.out.println(this.name + "의 주요 기능 : 속도 측정, 번호 인식");
    }
}
/*
우리가 작성한 소스 코드를 컴퓨터가 알아볼 수 있는 형태로 바꾸는 거를 컴파일이라고 하고
그 역할을 해주는 것을 컴파일러라고 한다.
*/

