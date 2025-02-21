public class Del {
  public static void main(String[] args) {
    int x = 10;
    int y = 20;
    int z = ++x + y--;
    System.out.printf("%d  %d  %d", x, y, z);
  }
}
