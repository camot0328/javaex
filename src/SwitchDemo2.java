public class SwitchDemo2 {
  public static void main(String[] args) {
    String day = "일";
    String result = "";

//    switch (day) {
//      case "월" :
//      case "화" :
//      case "수" :
//      case "목" :
//        result = "평일";
//        break;
//      case "일" :
//        result = "휴일";
//        break;
//      default:
//        result = "나머지일"
//    }

//    switch (day) {
//      case "월", "화", "수", "목"
//        result = "평일";
//        break;
//      case "일"
//        result = "휴일";
//        break;
//    }

    result = switch (day) {
      case "월", "화", "수", "목" -> "평일";
      case "토", "일"            -> "휴일";
      default                   -> "금";
    }; //앞에 result 를 사용했으므로 끝에 ; 를 해서 끝을 맺어야된다.
    System.out.println(day + ":" + result);
  }
}
