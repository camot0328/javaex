public class ForDamo {
  public static void main(String[] args) {
    System.out.println("Hello Wrold !");
    System.out.println("Hello Wrold !");
    System.out.println("Hello Wrold !");

    for ( int i = 0 ; i <= 2 ; i++ ) {
      System.out.println("Hello Wrold !");
    } // 0부터 시작하므로 2까지 0,1,2 이렇게 3번 출력된다.

    for (int i = 0; i <10 ; i++) {
      System.out.println(i + 1);
    }

    for (int i = 0 ; i < 10 ; i++) {
      if(i % 2  == 1) {
        System.out.println(i + 1);
      }
    }

    for ( int i = 10 ; i > 0 ; i--){
      System.out.println(i);
    }

    for ( int i = 0 ; i < 10 ; i++){
      System.out.println(10 - i);
    }

  }
}
