import java.util.Scanner;

public class TenaryOperatorDamo2 {
  public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    System.out.print("숫자를 입력하세요. ");
    int i = x.nextInt();
    int y = i % 2;
    String c = (y == 0) ? "짝수" : "홀수" ;
    System.out.printf("입력한 y값은 %s 이며, 숫자는 %d 입니다.", c , i );

  }
}
