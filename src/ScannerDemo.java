import java.util.Scanner;

public class ScannerDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("첫 번째 정수를 입력해주세요 : ");
    int x = in.nextInt();
    // 출력하는 곳에 숫자를 입력하면 x 와 y 를 입력하면 범위안에 들어오면 출력이 된다.
    System.out.print("두 번째 정수를 입력해주세요 : ");
    int y = in.nextInt();
    int result = x + y;
    System.out.printf("%d + %d = %d 입니다.", x , y , result);
  }
}
