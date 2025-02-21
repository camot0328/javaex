import java.util.Scanner;

public class Example1 {
  public static void main(String[] args) {
    // 두 개의 숫자를 입력 받아서 더해주는 프로그램을 while 문과 method 를 이용해서 작성
    // while 문의 종료 조건은 음수 값을 입력하는 경우이다.
    Scanner in = new Scanner(System.in);
    System.out.print("첫번째 숫자를 입력하세요? ");
    int x = in.nextInt();
    System.out.print("두번째 숫자를 입력하세요? ");
    int y = in.nextInt();
    while (true){
      if (sum(x, y) >= 0){
        System.out.printf("%d 와 %d 의 합은 %d 입니다. \n", x , y , sum(x, y));
      } else {
        break;
      }
      System.out.print("첫번째 숫자를 입력하세요? ");
      x = in.nextInt();
      System.out.print("두번째 숫자를 입력하세요? ");
      y = in.nextInt();
    }
  } //end of main
  static int sum(int num1, int num2){
    int total = num1 + num2;
    return total;
  } // end of main
} // end of class
