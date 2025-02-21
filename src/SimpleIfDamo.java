import java.util.Scanner;

public class SimpleIfDamo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("숫자를 입력해 ");
    int nember = in.nextInt();

    /*
    if(nember % 2 == 0 ) {
      System.out.println("짝수!");
    }
    if(nember % 2 == 1 ) {
      System.out.println("홀수!");
    }
     */
    // 이것도 맞지만 너무 길어지므로 짧게 수정할수있다.

    int remainder = nember % 2 ;
    String result = "";
    if(remainder == 0) {
      result = "짝수";
    }
    if(remainder == 1) {
      result = "홀수";
    }
    System.out.println(result);
    // if 안에서 String 을 선언할 경우 if 밖에서는 적용이 안되므로 먼저 선언을 한다.

  }
}
