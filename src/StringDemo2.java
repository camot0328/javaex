public class StringDemo2 {
  public static void main(String[] args) {
    String s1 = "hello";
    String s2 = "hello";
    // hello 라는 같은 객체를 String pool 에서 찾아 공유함.
    // 하나를 바꾼다고 둘 다 바뀌는 것이 아니라 바뀌는게 새로운 객체로 바뀐다.

    System.out.println(s1 == s2);

    String s3 = new String("hello");
    String s4 = new String("hello");
    // hello 는 같지만 서로 다른 객체이다.

    System.out.println(s3 == s4);
  }
}
