import java.util.Scanner;

public class SweetHomeDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("우리집은 몇층일까? ");
        int i = in.nextInt();
        String x = (i == 14) ? "우리집" : "느그집";
        System.out.println(x);

    }
}
