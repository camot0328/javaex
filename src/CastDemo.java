public class CastDemo {
  public static void main(String[] args) {
    float f = (float) 3.14;
    // 원래 double 이지만 강제로 float 로 변환
    byte b = (byte)300;
    // byte 가 300까지 계산이 안되는데 강제로 실행했으므로 값을 잘라내서 실행함
    System.out.println(f);
    System.out.println(b);

  }
}
