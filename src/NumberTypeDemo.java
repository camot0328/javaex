public class NumberTypeDemo {
  public static void main(String[] args) {
    /*
    // 정수를 선언하고 사용
    int mach = 340;
    int distance = mach  * 60 * 60;
    // 문자열과 숫자를 더하면 => 문자열
    System.out.println("소리가 1시간 동안 가는 거리 : " + distance + "m");

    // 실수를 선언하고 사용
    double radius = 10.0;
    final double PI = 3.14159265;
    double area = radius * radius * PI;
    System.out.println("반지름이 " + radius + "인 원의 넓이 : " + area);
    */


    long mach = 340, distance = mach  * 60 * 60;
    System.out.println("소리가 1시간 동안 가는 거리 : " + distance + "m");

    float radius = 10.0F;
    final float PI = 3.14159265F;
    float area = radius * radius * PI;
    System.out.println("반지름이 " + radius + "인 원의 넓이 : " + area);


    // 논리 boolean 은 참인지 거짓인지 구분한다.
    int x = 10;
    boolean result = (x == 10);
    result = (x != 10);
    // 둘 중 하나라도 불일치하면 false 가 나온다.
    System.out.println(result);

    float re = 1123f;
    float re1 = (float) 1123;
    System.out.println(re);
    System.out.println(re1);

  }
}
