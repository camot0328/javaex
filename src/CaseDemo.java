public class CaseDemo {
  public static void main(String[] args) {
    int number = 3;

    switch (number) {
      case 3 :
        System.out.print("★");
      case 2 :
        System.out.print("★");
        break;
        // break 를 하면 거기까지만 한다.
      case 1 :
        System.out.print("★");
    }
    // 걸리는거부터 아래로 찍힘.
  }
}
