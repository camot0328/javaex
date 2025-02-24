public class MethodDemo2 {
  public static void main(String[] args) {
    method1();
    int i = add(2, 3);
    System.out.println("i = " + i);
  }// end of main


  static void method1(){
    System.out.println("반환값이 없는 method 가 호출되었습니다.");
  }
  // 여기는 return 이 숨겨져있다.
  static int add(int num1, int num2){
    int result = num1 + num2;
    return result;
  } //int 는 반환값을 지정해 줘야된다.
}// end of class
// main -> method1 -> 출력 -> 출력(리턴) -> method1(리턴) -> int i -> add -> 출력 -> 출력(리턴) -> add(리턴) -> int i(리턴)
// ->main(리턴) 식으로
