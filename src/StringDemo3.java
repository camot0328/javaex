public class StringDemo3 {
  public static void main(String[] args) {
    String s1 = "hi, Java"; // 0x100
    String s2 = "hi, Java"; // 0x100

    System.out.println("s1 == s2 " + s1 == s2);
    // () 를 안하면 "s1 == s2" + s1 를 먼저 계산하고 == s2 를 그다음 계산하므로 false 가 나온다.
    System.out.println("s1 == s2 " + (s1 == s2));

    String s3 = new String("hi, Java"); // 0x200
    String s4 = new String("hi, Java"); // 0x300
    System.out.println("s1 == s2 " + (s3 == s4));

    s1 = s3; // s1 에 s3 주소를 넣는다. 0x200 동일하게 된다.
    System.out.println("s1 == s3 " + (s1 == s3));
    System.out.println("s1 == s2 " + (s1 == s2));
    // 그러므로 원래 같았던 s1 과 s2 는 다른 주소를 가지므로 달라진다.

    System.out.println(s1.equals(s4)); // equals 는 대소문자 관계 없이 둘이 같은지를 확인하는 것이다.

    String a = "apple";
    String b = "banana";
    String c = "banana";
    String d = "BANANA";
    System.out.println(a.compareTo(b)); // 문자열을 사전순으로 비교
    System.out.println(b.compareTo(a));
    System.out.println(c.compareTo(b));
    System.out.println(c.compareToIgnoreCase(b));
    // 원래는 대문자가 앞이지만 compareToIgnoreCase 는 대소문자 구분을 하지 않는다.
  }
}
