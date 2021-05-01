package main.nihilncunia.training.basic;

public class tr20FinalKeyword {
  public static void main(String[] args) {
    // final 키워드에 대해서 알아본다.
    // final 키워드는 한 번 선언하면 값을 변화시킬 수 없는 상태로 만드는 키워드이다.
    
    String name = "NIHILncunia";
    final String name2 = "니힐";
  
    System.out.println(name);
    name = "NIHILncunia2";
    System.out.println(name);
    // 일반적인 변수들은 재할당이 가능하다.
  
    System.out.println(name2);
    // name2 = "니힐2";
    // final이 붙은 변수는 변동이 불가능하다. 최종값으로 선언이 되었기 때문이다.
    // 그래서 변하면 안되는 값에 final을 붙이면 좋을 것 같다.
    
    // final 키워드는 클래스나 메소드에도 그대로 적용된다.
  }
}

final class FinalTest {
  public static void main(String[] args) {
    // 이 클래스는 다른 어떤 클래스에게 상속을 제공하지 않는다.
    // 자체적으로 final 키워드가 붙어서 변동이 불가능하기 때문이다.
  }
}

// class FinalTest2 extends FinalTest {}
// 이렇게 하면 오류가 나게 된다.

class FinalTest2 {
  static final int number(int num) {
    return num;
  }
  
  static final int number(int num1, int num2) {
    return num1 + num2;
  }
  // 클래스의 안에다가 메소드를 하나 만들었다.
  // 이 메소드는 final이 붙어있다. final이 붙어있는 메소드는 상속을 받은 클래스에서 오버라이딩. 즉, 재정의가 불가능하다.
  // 오버로딩은 여전히 가능하다.
}

class FinalTest3 extends FinalTest2 {
  public static void main(String[] args) {
    System.out.println(number(10));
    // 이렇게 사용하는 것은 아무런 문제가 없다.
    // 하지만 아래에서처럼 재정의를 시도하려고 하면 오류가 나게 된다.
  }
  
  // static int number(int number) {}
  // 상속받은 클래스에 이미 존재하는 메소드를 다시 정의하는 것을 오버라이딩이라고 한다.
  // 재정의라고도 한다. final이 붙으면 재정의가 불가능해진다.
}

// 같은 파일 안에 여러개의 클래스를 만들면, 자바는 각각의 클래스를 파일로 쪼개서 만들어낸다.