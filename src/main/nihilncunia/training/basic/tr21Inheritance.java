package main.nihilncunia.training.basic;

public class tr21Inheritance {
  public static void main(String[] args) {
    // 상속에 대한 이야기
    BetterCal bc = new BetterCal(2);
    // 인스턴스를 만들어준다.
  
    System.out.println(bc.sum(5, 4));
    // BetterCal 클래스에는 아무런 메소드도 변수도 없지만 Cal 클래스를 상속 받았기 때문에 사용할 수 있는 것이다.
    System.out.println(bc.minus(6, 2));
    // 상속받은 클래스의 메소드를 사용하지 않고 추가를 할 수도 있으며, 오버라이딩을 할 수도 있다.
    // 이로써 BetterCal 클래스는 더 뛰어난 클래스가 되었다.
  }
}

class Cal {
  public int id;
  
  public Cal(int id) {
    this.id = id;
  }
  // 클래스 내에서 만들어진 변수의 이름과 매개변수의 이름이 같을 수도 있는데, 그럴 때에 헷갈리지 않기 위해 this 를 사용하면 된다.
  
  public int sum(int num1, int num2) {
    System.out.println("이것은 원본 클래스의 메소드입니다.");
    return num1 + num2;
  }
}

class BetterCal extends Cal {
  // extends 라는 키워드는 클래스를 확장한 클래스를 새롭게 만든다.
  // 기존에 만들어둔 메소드를 그대로 사용할 수 있다.
  // 상속은 클래스를 이용해서 새로운 클래스를 만들고 싶을 때에 사용하는 기술이다.
  // final 키워드가 붙은 클래스는 상속받을 수 없다는 점은 이해해야한다.
  // 기존의 클래스의 메소드나 변수를 상속받은 클래스에 아무것도 없더라도 기존의 클래스의 메소드와 변수를 사용할 수 있다.
  
  public BetterCal(int id) {
    super(id);
  }
  
  // 원본 클래스(부모 클래스)에 생성자가 있다면 상속을 받은 클래스에도 생성자가 있어야한다.
  // 이 경우에 부모 클래스의 생성자를 한 번 실행하게끔 되어있다.
  // 부모 클래스를 의미하는 super를 이용해서 생성자를 실행해준다.
  
  public int sum(int num1, int num2) {
    return super.sum(num1, num2);
  }
  // super 는 본래 클래스를 나타낸다.
  // this 는 자기 자신을 나타낸다.
  
  public int minus(int num1, int num2) {
    return num1 - num2;
  }
  
  // 오버로딩과 오버라이딩은 이름이 비슷한데 상당히 다르다.
  // 오버로딩은 같은 메소드를 다양한 방법으로 사용하기 위함이고, 오버라이딩은 상속받은 메소드를 재정의하는 것을 말한다.
}