package main.nihilncunia.training.basic;

public class tr16WrapperClass {
  public static void main(String[] args) {
    // 래퍼 클래스에 대해서 알아본다.
    
    // 프로그래밍을 하면서 기본 타입을 자주 사용하는데, 이 기본 타입들을 객체로 만들어서 사용해야 할 때가 있다.
    // 그럴 때를 위해서 래퍼 클래스가 존재한다. 래퍼 클래스는 총 8개가 존재한다.
    // primitive 데이터 타입들이 총 8개라는 점을 다시 생각해보자.
    
    // 래퍼 클래스라는 개념과 함께 박싱과 언박싱이라는 개념도 함께 알아보도록 하자.
    
    Integer N = 7556; // int 타입의 래퍼 클래스이다.
    Character C = 'N'; // char 타입의 래퍼 클래스이다.
    
    System.out.println("N >> " + N);
    System.out.println("C >> " + C);
    
    // 위 두 래퍼 클래스의 이름은 자신들의 본래 타입과 이름이 다르다는 점을 주의해야한다.
    
    // Double D = new Double(0.5);
    // 이런 식의 변수 선언을 박싱이라고 한다. 하지만 이제는 이렇게 박싱을 하지 않아도 위처럼 오토박싱이 된다.
    // 박싱을 하게 되면 값에 null을 넣을 수가 있다. 또한, 몇몇의 메소드에서 사용할 수 없는 한계점을 해결할 수 있게된다.
    
    // double d = D.doubleValue();
    // 이런식의 선언을 언박싱이라고 하는데, 언박싱도 자동으로 오토언박싱이 된다.
    
    // 박싱과 언박싱은 결국 아래처럼 하면 된다.
    
    Double D = 7.556; // double 타입의 래퍼 클래스이다.
    double d = D; // 오토언박싱이다. 이하의 오토언박싱은 생략하도록한다.
    
    Float F = 7.556f; // float 타입의 래퍼 클래스이다.
    Boolean Bool = false; // boolean 타입의 래퍼 클래스이다.
    Byte B = 75; // byte 타입의 래퍼 클래스이다.
    Long L = 45L; // long 타입의 래퍼 클래스이다.
    Short S = 45; // short 타입의 래퍼 클래스이다.
    
    System.out.println("D >> " + D);
    System.out.println("d >> " + d);
    System.out.println("F >> " + F);
    System.out.println("Bool >> " + Bool);
    System.out.println("B >> " + B);
    System.out.println("L >> " + L);
    System.out.println("S >> " + S);
    
    Integer Number = 7556;
    int number = 7556;
    
    // 위의 두 변수는 같은 값을 저장하고 있으나 래퍼클래스로 박싱을 한 전자가 용량이 더 크다.
  }
}