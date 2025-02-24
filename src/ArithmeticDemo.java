import java.util.Scanner;

public class ArithmeticDemo {
  public static void main(String[] args) {
    int a = 1_000_000;
    int b = 2_000_000;
    int result = a * b;
    System.out.println(result);
    // 값이 이상하게 나온 이유는 나올수 있는 범위 밖이라 오버플로우가 발생한거다.

    long result1 = a * b;
    System.out.println(result1);
    // 롱을 했는데 값에 변화가 없는 이유는 이미 a * b가 계산된 후 이므로 그렇다

    long result2 = a * (long)b;
    System.out.println(result2);
    // double 실수로 계산할 경우 약간의 오차 범위가 날수도 있다.

    int apple = 1;
    double priceUnit = 0.1;
    int number = 7;

    double result3 = number * priceUnit * apple;
    System.out.println(result3);
    // 소수점이 있을때는 float 보다는 double 을 쓰지만 소수점이 필요없다면 long 을 사용한다.

    Scanner in = new Scanner(System.in);
    System.out.print("어떤 숫자로 나눌까요 ? ");
    int i = in.nextInt();
    if(i != 0) {
      int result4 = 3 / i;
      System.out.println(result4);
    }

    System.out.print("어떤 숫자로 나눌까요(실수로 받을경우) ? ");
    double v = in.nextDouble();
    double result5 = 3 / v;
    System.out.println(result5);
    System.out.println(3 % v +100);

  }
}
