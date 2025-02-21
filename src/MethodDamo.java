public class MethodDamo {
  public static void main(String[] args) {
    // sum = 1 + 2 + 3 + 4 + 5 + ...... + 10
//    int sum = 0;
//    sum += 1;
//    sum += 2;
//    sum += 3;
//    sum += 4;
//    sum += 5;
//    sum += 6;
//    sum += 7;
//    sum += 8;
//    sum += 9;
//    sum += 10;

//    for (int i = 1 ; i <= 10 ; i++){
//      sum += i;
//    }
//    System.out.println("1 부터 10까지의 합은 " + sum);
//
//    sum = 0;
//    for (int i = 10 ; i <= 100 ; i++){
//      sum += i;
//    }
//    System.out.println("10 부터 100까지의 합은 " + sum);

    int result = sum(1 , 10);
    System.out.println("1 부터 10까지의 합은 " + result);

    result = sum(10 , 100);
    System.out.println("10 부터 100까지의 합은 " + result);

    System.out.println("1 부터 1000까지의 합은 " + sum(1,1000));

  }// end main

  static int sum(int num1, int num2){
    int total = 0;
    for (int i = num1 ; i <= num2 ; i++){
      total += i;
    }
    return total;
  }
}// end class
