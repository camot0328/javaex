public class MethodOverloingDemo {
  public static void main(String[] args) {
    // Alt + enter 눌르면 그거에 맞는 메소드를 알아서 만들어준다.
//    add2number(1,2);
//    add3number(1,2,3);
//    add4number(1,2,3,4);
    addNumber(1,2);
    addNumber(1,2,3);
    addNumber(1,2,3,4);
    addNumber(1,2,3,4,5,6,7);

  }

  private static void addNumber(int...numbers){
    // int... <- 여기 안에있는 숫자들을 정의
    int result = 0;
    for (int number : numbers) {
      result += number;
      // += 오른쪽 계산 후 왼쪽과 더한다. -= 오른쪽 계산 후 왼쪽에 뺀다.
    }
    System.out.println(result);
  }

//  private static void add4number(int i, int i1, int i2, int i3) {
//    System.out.println(i + i1 + i2 + i3);
//  }
//
//  private static void add3number(int i, int i1, int i2) {
//    System.out.println(i + i1 + i2);
//  }
//
//  private static void add2number(int i, int i1) {
//    System.out.println(i + i1);
//  }
}
