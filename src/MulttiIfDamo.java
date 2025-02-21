import java.util.Scanner;

public class MulttiIfDamo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("점수를 입력하세요(0~100) : ");
    int score = in.nextInt();
    String grade = "";
    if(score >= 90 && score <= 100) {
      if(score >= 95) {
        grade = "A+";
      } else {
        grade = "A";
      }
    } else if(score >= 80 && score < 90) {
      grade = "B";
    } else if(score >= 70 && score < 80) {
      grade = "C";
    } else if(score >= 60 && score < 70) {
      grade = "D";
    } else {
      grade = "F";
    }
//    if(score >= 60) {
//      grade = "D"
//    } else if (score >= 70) {
//      grade = "C"
//    } else {
//      grade = "F"
//    }
    // 이렇게 했을 경우 먼저 60보다 크다에서 걸러지므로 밑에 있는 연산이 쓸모없게 된다.
    System.out.printf("입력한 점수가 %d점 이며, 학점은 %s 입니다. ", score , grade);
    if(grade.equals("F")){
      System.out.println("당신은 불합격입니다.");
    }
  }
}
