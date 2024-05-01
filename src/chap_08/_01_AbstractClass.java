package chap_08;

import chap_08.camera.Camera;
import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화 (Data Abstraction)
        // -> 굳이 몰라도 되는 디테일한 부분을 숨기고 꼭 필요한 정보만 공개하도록 하는 과정
        // 이때 쓰이는 것이 abstract
        // 추상 클래스 (아직 완성되지 않은 클래스)
        // 추상 메소드 (추상 클래스 또는 인터페이스에서 사용가능한 껍데기만 있는 메소드)

        //Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}
