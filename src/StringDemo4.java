import java.util.Locale;

public class StringDemo4 {
  public static void main(String[] args) {
    String s1 = new String("hi,");
    String s2 = new String(" Java");

    System.out.println(s1.charAt(0));
    // 몇번째 글자 뽑을지 0부터 시작
    System.out.println(s1.charAt(s1.length() - 1));
    // .length() 로 길이 -1 마지막 글자를 물어본다.

    for (int i = 0; i < s2.length(); i++) {
      System.out.println(s2.charAt(i));
      // 글자 길이에 맞게 알파벳을 순서대로 출력한다.
    }

    System.out.println(s1);
    s1.toUpperCase();
    // .toUpperCase() 한다고 s1이 대문자로 바뀌는게 아니라 보이기만 대문자이므로 s1을 대문자로 바꾸고 싶다면
    // s1 = s1.toUpperCase(); 이런식으로 명령어를 적어야된다.
    System.out.println(s1);
    System.out.printf("");

    // 3.14 를 문자열로 변환하는 방법
    String str = "" + 3.14;
    // 문자열 뒤에 넣어서 변환하거나
    String str1 = String.valueOf(3.14);
    // String.valueOf 를 사용해서 변환한다.
    String fruits = String.join(",", "apple", "banana", "cherry", "durian");
    System.out.println("fruits = " + fruits);
    String str3 = String.format("%s %d", "JDK", 14);
    // souf 에 f 가 format 에 f 이고 사용방법은 비슷하다.
    System.out.println("str3 = " + str3);

    // 텍스트 블록 """~"""
    String strBlock = """
        <html>
          <body>
            <p>hello, world</p>
          </body>
        <html>
        """;
    System.out.println("strBlock = /n" + strBlock);
  }
}
