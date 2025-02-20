public class PrintDamo {
  public static void main(String[] args) {
    System.out.print("hello");
    System.out.print("hello");
    System.out.print("hello");
    System.out.print("hello");
    System.out.print("hello");
    // 자동복사 컨트롤 D
    // print 는 연결되게 출력된다.

    System.out.printf("%s: %s: %s \n" , "a" , "b", "c");
    System.out.printf(":%d: :%d: :%-4d: \n" , 1 , 2, 3);

    System.out.println("이것은 우리의 9번째 프로젝트입니다.");
    System.out.printf("%s %d %s", "이것은 우리의 ", 9,"번째 프로그램입니다.");

    int i = 2, j = 1;
    int result = i * j;

    System.out.printf("\n%d x %d = %d 입니다. \n", i , j , result);
  }
}
