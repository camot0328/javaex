public class CharDemo {
  public static void main(String[] args) {
    char c = 'A';

    int i = c;
    System.out.println(c);
    // c를 문자 A라 지정했으므로 A로 출력
    System.out.println(i);
    // 문자열을 c를 출력했을경우 유니코드로 출력됨
    System.out.println((int)c);

    // char c1 = ''; 빈공간으로 놔두면 오류가 난다.
    String S = "ABC";
    String T = "i love you so";
    System.out.println(S);
    System.out.println(T);

    String s1 = S + 1;
    // 문자열에 숫자를 더할경우 문자열로 바뀐다.
    // String s2 = i ;
    String s3 = "" + i ;
    // i가 65이므로 이것을 문자열로 바꿀려면 앞에 ""빈칸을 넣고 문자열과 숫자를 더한다음 값을 나오게 한다.

    // System.out.println(s2);
    System.out.println(s3);

    System.out.println("안녕하세요. 저는 \"최상근\"입니다.");
    // \뒤에 오는것을 문자로 인식하게 한다.
    System.out.println("안녕하세요. \n저는 \"최상근\"입니다.");
    // \n 다음줄에 출력함.

    char c3 = 3 + '0';
    System.out.println(c3);

    int i3 = c3 - '0';
    System.out.println(i3);

    String c4 = "hello";
    System.out.println(c4.charAt(1));
    // charAt 출력하는것에서 몇번째(0번부터 시작)를 출력하고 싶은지
    System.out.println("안 녕하세요".charAt(1));
    // 빈칸도 하나로 취급함.

  }
}
