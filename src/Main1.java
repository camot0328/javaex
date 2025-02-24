public class Main1 {
  public static void main(String[] args) {
    MyMath m = new MyMath();
    long res1 = m.add(10L, 20L);
    System.out.println("res1 = " + res1);
    // MyMath class 를 불러오고 m으로 지정 그러므로 MyMath 에 있는 명령들을 m. 으로 불러올수있다.
    long res2 = m.sub(20, 10);
    System.out.println("res2 = " + res2);
    long res3 = m.mul(1, 10);
    System.out.println("res3 = " + res3);
    long res4 = m.div(5, 3);
    System.out.println("res4 = " + res4);
  }
}
