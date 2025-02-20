public class Hello {
  public static void main(String[] args) {
    // 여러가지 실행문을 작성해보자.
    // 정수를 x 에 담고자 한다.
    int x;
    // 변수 x 에 1 을 할당/저장한다.
    x = 1;
    int y = 2;
    // 변수 result 에 x 와 y 의 값을 더한 후 저장한다.
    int result = x + y ;
    System.out.println(x);
    System.out.println(result);
    // hello 에 "안녕!" 이라는 문자열을 저장한 후 출력한다.
    String hello = "안녕!" ;
    System.out.println(hello);
    // hello 에 "안녕!" 이라는 개체값을 넣은 상태에서 뒤에 추가로 덮어넣을수 있다.
    hello = hello + "1" ;
    System.out.println(hello);

    int NUMBER_ONE = 1;
    NUMBER_ONE = NUMBER_ONE + 1;
    // NUMBER_ONE 값 1에 1을 더한다고 해서 NUMBER_ONE 값이 2이 된다.
    // final 사용시 NUMBER_ONE 은 상수(변할수 없는 값)가 되므로 변화할수가 없다.
    System.out.println(NUMBER_ONE);
  }
}
