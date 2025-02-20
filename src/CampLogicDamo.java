public class CampLogicDamo {
  public static void main(String[] args) {
    int x = 1, y = 0;
    System.out.println((x > 2) && (x/y == 0));
    System.out.println((x == 1) || (x/y == 0));
    // 비교연산 AND(&&) 와 OR(||) 는 앞부분이 true(참) 이면 뒷부분은 계산을 안하므로 오류가 안난다.
  }
}
