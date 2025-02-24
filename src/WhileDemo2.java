import java.util.Scanner;

public class WhileDemo2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("점수 넣어라 ");
    int score = in.nextInt(); // 초기식
    String grade = "";
    while(score > 0) { // 조건식
      if (score >= 90 && score <= 100) {
        if (score >= 95) {
          grade = "A+";
        } else {
          grade = "A";
        }
      } else if (score >= 80 && score < 90) {
        grade = "B";
      } else if (score >= 70 && score < 80) {
        grade = "C";
      } else if (score >= 60 && score < 70) {
        grade = "D";
      } else {
        grade = "F";
      }
      System.out.printf("입력한 점수가 %d점 이며, 학점은 %s 입니다. \n", score , grade);
      if(grade.equals("F")) {
        System.out.println("당신은 불합격입니다. \n");
      }
      System.out.print("점수 넣어라 ");
      score = in.nextInt(); // 증강식
    }

  }
}
