import java.util.Scanner;

public class ArithmeticDemo2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("궁금한 숫자를 입력하세요");
    int i = in.nextInt();
    int v = i % 2 ;
    if(v == 0) {
      System.out.printf("입력한 숫자는 %d 이며, 짝수입니다.", v);
    } else{
      System.out.printf("입력한 숫자는 %d 이며, 홀수입니다.", v);
    }

  }
}
