package chap_08.detector;

public interface Detectable {
    public static final String name = "감지자";
    // 이것도 자등으로 public static final이 붙어있음
    public abstract void detect(); // 감지
    // 자동으로 public abstract가 붙어있음
}
