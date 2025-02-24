public class IncrementDemo {
  public static void main(String[] args) {
    int x = 0;
    System.out.println("Increment 매소드 호출 전 n = " + x);
    increment(x);
    System.out.println("Increment 매소드 호출 후 n = " + x);


  }// end of main

  static void increment(int n) {
    System.out.println("Increment 매소드 시작 n = " + n);
    n++;
    System.out.println("Increment 매소드 종료 n = " + n);
  }
}// end of class
