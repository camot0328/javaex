public class EchoDemo {
  public static void main(String[] args) {
    // 1. 반환값이 없음
    // 2. main 에서 별도의 객체 생성 없이 호출
    // 3. 매개변수가 2개 있음(문자, 숫자)
    // 4. 문자열을 정수의 횟수만큼 반복 출력
    echo("안녕", 3);
  }// end of main

  static void echo(String a, int b) {
    // a 는 문자열이므로 String b 는 숫자이므로 b 를 선언한다.
    for (int i = 1 ; i <= b ; i++ ) {
      System.out.println(a);
    }
  }

}// end of class
