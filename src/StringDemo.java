public class StringDemo {
  public static void main(String[] args) {
    int a = 1;
    int b = a;

    System.out.println("a = "+ a);
    System.out.println("b = "+ b);

    b = 2;

    System.out.println("a = "+ a);
    System.out.println("b = "+ b);

    Cat c1 = new Cat("나비!");
    Cat c2 = c1;
    System.out.println(c1.getName());
    System.out.println(c2.getName());
    c2.setName("야옹이");
    System.out.println(c1.getName());
    System.out.println(c2.getName());
  }
}

class Cat{
  private String name;
  // 값이 변경할수 없게 할려면 String 앞에 Final 을 쓰면 된다.
  // final 이 붙었을 경우 값을 변경하고 싶으면 새로운 c1, c2 가 아닌 새로운 c3 를 만들어야된다.
  public Cat(String name){
    this.name = name;
  }
  // Alt + ins 를 눌르면 getName 과 setName 을 자동으로 만들어준다.
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
}
