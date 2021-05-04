package main.nihilncunia.training.basic;

import java.io.FileWriter;
import java.io.IOException;

public class tr22Exeption {
  public static void main(String[] args) {
    // 예외처리에 대해서 알아본다.
  
    System.out.println(1);
    try {
      System.out.println(2/0);
    } catch (ArithmeticException e) {
      System.out.println("숫자를 0으로 나누는 것은 위험합니다!");
    } // 예외 처리를 하지 않으면 프로그램이 여기서 뻗어버린다.
    // catch 는 여러번 사용할 수 있다. 하지만 try 가 여러개인 것과는 다른 상황을 가지고 온다.
    // try 를 여러번 사용하면 각각의 코드를 예외적으로 처리할 수 있지만, 하나의 try로 여러개의 catch 를 사용하게 되면
    // 예외를 잡았을 때에 나머지 예외들은 실행될 여지조차 없이 넘어가게 된다.
    
    // 예외에 대한 클래스들의 상위 클래스인 Exception 을 이용하면 모든 에러를 잡을 수 있지만, 추천되는 방법은 아니다.
    // ArithmeticException 은 클래스의 이름이고 그와 동시에 데이터 타입이 된다.
    // e 는 그것을 데이터 타입으로 하는 변수의 이름이다.
    // 디버거를 통하면 해당 예외의 정보를 상세히 알 수 있다.
    
    // try catch 의 다음에는 finally 가 올 수 있다. finally 는 반드시 실행되는 부분이다.
    
    System.out.println(3);
    // 숫자를 0으로 나누는 것은 프로그램을 멈추게한다. 이는 수학적으로 아무런 의미가 없기 때문이다.
    // 이러한 것을 방지하기 위해 예외처리를 해야한다.
    
    // 예외는 에러와는 다른 것이다.
    // 에러는 시스템적인 레벨에서 문제가 생겨 프로그램에 하자가 생기는 것이고,
    // 예외는 프로그램의 내부적인 문제로 인해 프로그램 자신이 이거 이상해 라고 알려주는 것이다.
    
    // 예외 처리를 하는 방법은 try catch 문을 사용하는 것이다.
    // 이를 통해서 우리는 사전에 예외를 방지하고 프로그램이 멈추는 것을 예방할 수 있다.
    // 프로그램은 어떤 예외 구문이 있는지 상세히 알려준다. 이를 통해서 예외 처리를 하면 된다.
    // 예외 처리를 자신이 하지 않고 코드를 사용하는 쪽에서 하게끔 할 수 있다.
    // 이를 throws 라고 부른다. 메소드 뒤에 붙인다.
    // ex) throws IOException
    
    // 컴파일러가 체크를 하는 익센션과 그렇지 않은 익셉션이 있다.
    // Exception 의 직계 자손 클래스들이 체크를 하는 익셉션이고, RuntimeException 을 거친 자손들이 체크를 하지 않은 익셉션이다.
    // 즉, 반드시 예외 처리를 해야만 하는 익셉션들이 있다. 이 경우에는 반드시 익셉션을 처리해야한다.
    // Checked Exception - 체크를 하고 넘어가는 익셉션
    // Unchecked Exception - 체크를 안하고 나중에 알려주는 익셉션
  
    try (FileWriter f = new FileWriter("test.txt")) {
      f.write("흐하하하하하 새로운 파일을 만들었다!");
      // FileWriter 는 반드시 예외 처리를 해줘야 하는 익셉션을 유발한다.
      // 간단하게 처리가 가능하다.
      // 이렇게 할 경우 클로즈가 필요 없다. 자동으로 해준다.
    } catch (IOException e) {
      // 파일과 관련된 익셉션이 바로 IOException 이다.
      e.printStackTrace();
    }
    // 이러한 문법을 try-with-resources 문법이라고 부른다.
  }
}