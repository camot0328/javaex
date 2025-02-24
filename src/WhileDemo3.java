import java.util.Scanner;

public class WhileDemo3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("구구단 몇단을 입력해드릴까요? ");
    int dan = in.nextInt();
    while (true){
      if(dan < 2 || dan > 9){
        break;
      }
      for(int i = 1 ; i <= 9 ; i++ ) {
        System.out.printf("%d X %d = %d \n", dan, i, dan*i);
      }
      System.out.print("몇단?");
      dan = in.nextInt();
    }
  }
}
