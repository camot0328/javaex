public class AddDamo {
  public static void main(String[] args) {
    int j = 0, i = 1;
    System.out.printf("연산전 : j = %d, i = %d \n", j , i);
    j = i++;
    // j = ++i;
    System.out.printf("연산후 : j = %d, i = %d \n", j , i);
    // ++ 뒤에 올경우 = 보다 후에 계산을 한다.
  }
}
