public class CastDamo3 {
  public static void main(String[] args) {
    // 사칙연산에는 + , - , / , *
    int result = 7 / 4;
    System.out.println(result);

    double result2 = 7.0 / 4.0;
    // 정확도를 위해 7.0 , 4.0 으로 계산하다. 아니면 7 , 4 에 (double) 을 붙인다.
    // 7 / (double)4 로 했을경우 7이 자동으로 (double)7로 자동형변환된다.
    System.out.println(result2);
  }
}
