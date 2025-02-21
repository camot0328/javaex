public class SwitchDamo {
  public static void main(String[] args) {
    whoIsIt("호랑이");
    whoIsIt("참새");
    whoIsIt("고등어");
  } // end of main method 여기가 하나의 메소드의 끝부분

  static void whoIsIt(String animal) {
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
} // end of class 클라스 끝부분
