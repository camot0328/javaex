public class CastDemo2 {
  public static void main(String[] args) {
    String strint = "20";
    int i = Integer.parseInt(strint);
    System.out.println(strint);
    System.out.println(i + 1);
    // 문자열을 숫자로 바꿨는지 확인할려고 i + 1 을 해서 숫자인지 확인한다.

    String strDouble = "20.001";
    double d = Double.parseDouble(strDouble);
    // 메소드 parseDouble 에 두고 컨트롤 + 알트 + v 를 하면 그에 맞는 앞부분을 만들어준다.
    System.out.println(d);
    System.out.println(d + 0.1);
    System.out.println(d + 1);
    // 약간에 오류가 나는데 float 가 double 보다 오차가 크다.

    String strFloat = "3.14";
    float v = Float.parseFloat(strFloat);
    System.out.println(v);
    System.out.println(v + 1.1);
    System.out.println(v + 1);
    // 1 을 더 했을경우 double 은 오류가 안나지만 float 는 약간에 오차가 생긴다.

  }
}
