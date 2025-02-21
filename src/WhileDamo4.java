import java.util.Scanner;

public class WhileDamo4 {
  public static void main(String[] args) {
    // 초기식(while 문)
    Scanner in = new Scanner(System.in);
    System.out.print("어떤 동물을 넣으실껀가요? ");
    String animal = in.nextLine(); // 숫자가 아닌 문자를 반복하기위해 String 과 nextLine 씀
    while (true) {
      if (animal.equalsIgnoreCase("stop")) {
        break;
      }

      example(animal);
      System.out.print("동물 이름을 입력하세요? ");
      animal = in.nextLine();
    }
  }

  private static void example(String animal) {
    String kind = "";
    switch (animal) {
      case "호랑이":
        kind = "포유류";
        break;
      case "참새":
        kind = "조류";
        break;
      case "고등어":
        kind = "어류";
        break;
      default:
        kind = "분류할 수 없음";
    }
    System.out.printf("%s는 %s 입니다.\n", animal , kind);
  }
}
