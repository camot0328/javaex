public class AddDemo {
  public static void main(String[] args) {
    int j = 0, e = 1;
    System.out.printf("연산전 : j = %d, e = %d \n", j , e);
    j = e++;
    // j = ++e;
    System.out.printf("연산후 : j = %d, e = %d \n", j , e);
    // ++ 뒤에 올경우 = 보다 후에 계산을 한다.
  }
}
