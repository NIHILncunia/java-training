package main.nihilncunia.training.basic;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class tr8ClassApp {
  public static void main(String[] args) throws FileNotFoundException {
    System.out.println(Math.PI); // 얘는 변수다. 원주율을 담고 있다.
    System.out.println("floor >> " + Math.floor(1.6)); // 소수점을 내려버리는 메소드. 자바스크립트에도 있다!
    System.out.println("ceil >> " + Math.ceil(1.6)); // 반대로 소수점을 올려버리는 메소드.
    
    // 이렇게 Math의 안에는 숫자와 관련된 메소드들이 들어있다.
    // 이번에는 인스턴스에 대해서 알아보자.
    
    PrintWriter name = new PrintWriter("name.txt");
    name.write("NIHILncunia?");
    name.close();
    
    // 예외 처리를 해줘야하는데 할 줄 모른다. 일단은 에디터의 기능을 이용해 방지하자.
    // 아무튼 인스턴스는 클래스를 이용해서 경우에 따라 다르게 동작할 수 있는 클래스의 사본을 만든 것이다.
    // 쉽게 말하면 클래스는 설계도라고 생각하면 되고, 인스턴스는 그 설계도를 바탕으로 만들어낸 것으로,
    // 실질적으로 사용하기 위한 것이라고 생각하면 된다. 재사용성을 갖고 있는 셈이다.
    // 클래스는 확장을 할 수 있다. 다른 클래스에게서 상속을 받으면 된다.
    // 또한, 상속받은 클래스의 메소드를 개조할 수도 있다.
  }
}