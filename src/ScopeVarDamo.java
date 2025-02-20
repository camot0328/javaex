public class ScopeVarDamo {
  public static void main(String[] args) {
    int var1 = 1;
    // 메소드 블록에 선언한 var1 는 전체에 영향을 미친다.

    if(true) {
      int var2 = 2;
      // if 안에서 선언한 var2 는 if 안에서만 영향을 미치고 다른 곳에서는 영향을 미치지 못한다.
      System.out.println("(if) var1 => " + var1);
      System.out.println("(if) var2 => " + var2);
    }


    for (String arg : args) {
      int var3 = 3;
      // if 와 마찬가지로 for 안에만 미치는 var3
      System.out.println("(for) var1 ==> " + var1);
      System.out.println("(for) var3 ==> " + var3);
    }

    System.out.println("(main) var1 ==> " + var1);

  }
}
