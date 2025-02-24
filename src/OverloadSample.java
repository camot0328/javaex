public class OverloadSample {
  public static void main(String[] args) {
    Printer printer = new Printer();
    printer.println(10);
    printer.println(true);
    printer.println(10.0);
    printer.println("이게맞나");
  }
}
  class Printer{
    public void println(int value){
      System.out.println("value = " + value);
    }// int 이라는 메서드 시그니처를 가진다.
    public void println(boolean value) {
      System.out.println("value = " + value);
    }// boolean 이라는 메서드 시그니처를 가진다.
    public void println(double value) {
      System.out.println("value = " + value);
    }// double 이라는 메서드 시그니처를 가진다.
    public void println(String value){
      System.out.println("value = " + value);
    }// String 이라는 메서드 시그니처를 가진다.
    // 메서드 이름은 같지만 메서드 시그니처가 다른 메서드를 정의하는 것 메서드 오버로딩
  }
