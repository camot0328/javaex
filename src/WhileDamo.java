public class WhileDamo {
  public static void main(String[] args) {
    // 초기식
    int count = 0;
    // 조건에 맞는 동안 실행할 조건식
    while (true) {
      if(count <= 1) {
        System.out.println("VVVVV");
      } else {
        break;
      }
      // 증강식
      count++;
    } // for 문으로 작성할 경우 간단한 것을 while 문으로 작성시 복잡해 진다.


    count = 0;
    while (count <=2) {
      System.out.println("WWWWW");
      count++;
    } // 위에 했던 식을 좀 더 간단하게 줄일수있다.

  }
}
