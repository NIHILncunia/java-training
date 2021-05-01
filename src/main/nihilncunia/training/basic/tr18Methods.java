package main.nihilncunia.training.basic;

public class tr18Methods {
  public static void main(String[] args) {
    // 메소드에 대해서 알아보자.
    
    // 접근제어자
    // public private protected default 네가지의 접근제어자가 존재한다.
    // private -> default -> protected -> public 순으로 보다 많은 접근을 허용한다.
    
    // private 의 경우에는 해당 클래스 내에서만 접근할 수 있게 만든다. 다른 클래스에서는 사용을 못한다.
    // 접근제어자가 없으면 default 로 인식되고, 패키지 내에서 사용할 수 있게 된다.
    // protected 의 경우에는 같은 패키지 내에서 기본적으로 접근이 가능하고, 상속을 받은 클래스에서도 사용할 수 있게 된다.
    // public 의 경우에는 그냥 제한이 없다. 어디서든 사용이 가능하다.
    
    // 지금 작성되고 있는 클래스의 경우엔 public 이기 때문에 다른 패키지에서도 접근이 가능한 셈이다.
    
    hello("Hello");
    // static을 붙여주면 그냥 사용이 가능하다. 하지만 static을 붙이지 않았다면 그냥은 사용할 수 없다.
    // static이 붙은 메소드는 클래스의 메소드이다. 클래스에서 기본적으로 쓸 수 있는 메소드라는 것이다. 그렇기에 없으면 사용을 못한다.
    // static이 없는 메소드는 인스턴스의 메소드이다. 인스턴스를 만들어야지만 사용이 가능한 메소드가 된다.
    
    Test test = new Test();
    test.num = 4545;
    System.out.println(test.number());
    // Test 클래스를 인스턴스로 가져와서 그 안에 있는 넘버 메소드를 사용했다.
    // 그냥은 사용할 수가 없다. static이 없어서 클래스에서 사용할 수 있는 메소드가 아니기 때문이다.
    
    // 매개변수가 없는 대신에 인스턴스에서 사용할 변수는 만들어줘야한다.
    
    System.out.println(Test.add(5));
    
    System.out.println(add(1, 2, 5));
    System.out.println(add(1, 2));
    System.out.println(add(2.5, 5.8));
    // 이렇게 같은 메소드여도 다르게 작용한다. 아니, 사실상 같은 메소드가 아닌 것이다.
    // 같은 이름을 가졌지만 다르게 생긴 것들이 왜 그런건지 이제 그 이유를 알게 되었다.
  }
  
  static void hello(String word) {
    System.out.println(word);
    // 기본적으로 메소드는 이렇게 선언한다. void의 자리에는 리턴되는 타입이 오게 된다.
    // 그런데, void의 경우엔 리턴값이 없는 메소드를 만들 때 쓴다.
    // 괄호에는 매개변수를 넣어서 메소드를 좀 더 의미 있게 만들 수 있다.
  }
  
  static int add(int a, int b) {
    return a + b;
  }
  
  static int add(int a, int b, int c) {
    return a + b + c;
  }
  
  // 이름이 같은 메소드라고 할 지라도 매개변수의 개수가 다르면 같은 것으로 치지 않는다.
  // 이를 오버로딩이라고 한다. 오버로딩은 경우에 따라서 사용하기 위해 존재한다.
  
  static double add(double a, double b) {
    return a + b;
  }
  
  // 리턴되는 타입이 달라도 된다. 하지만, 리턴되는 타입만 다르고 매개변수가 같다면
  // 그것은 오버로딩이 적용되지 않는다. 즉, 같은 메소드로 인식하게 되는 것이다.
  // 메소드의 아이덴티티는 결국 이름과 매개변수가 한 세트라고 할 수 있겠다.
}

class Test {
  int num;
  // 클래스 내에서 사용할 변수를 지정해준다.
  
  int number() {
    return this.num;
    // 리턴값을 이렇게도 줄 수 있다.
    // 이렇게 되면 매개변수는 필요없다.
  }
  
  static int add(int num) {
    return num + num;
  }
  // 이렇게 스태틱이 있는 메소드는 인스턴스로 쓸 필요가 없다.
  // 다만, 스태틱이 있는 메소드에서는 스태틱이 없는 변수 같은 것을 사용할 수 없다.
}