package main.nihilncunia.training.basic;

import java.lang.Math;

public class tr5Number {
  public static void main(String[] args) {
    System.out.println(1 + 2);
    System.out.println(4 - 2);
    System.out.println(2 * 2);
    System.out.println(6 / 3);
    // 기본적인 사칙연산은 이렇게 한다. 아지까지는 매우 간단하게 흡수 가능한 것들이다.
    // 이것들은 연산자라고 부른다. 이미 자바스크립트를 통해 익숙해졌기 때문이다.
    // 중요한 것은 변수에 담아서 계산을 할 경우 나눗셈의 값은 정확하지 않을 수도 있다.
    // 나눗셈을 할 때에는 값을 변수에 넣더라도 double 로 만들어서 넣는 게 좋다.
    // 혹은 int로 선언하되, 원하는 값을 받기 위해 double로 형변환을 해주어야 할 것이다.
  
    System.out.println(6 % 2);
    // 나머지값을 구하는 수식이다. 퍼센트 기호를 사용한다. 딱 맞아떨어지면? 당연히 0이 출력될 것이다.
  
    System.out.println(2 + "번째");
    // 문자열과 숫자는 더하게 되면 문자열이 된다.
    
    int number = 10;
    number++;
    // 숫자 데이터의 뒤에 ++를 붙이면 하나를 더하는 것이다. 이는 아래와 완전히 같은 의미이다.
    // number = number + 1; 이것을 줄인 것이 위의 코드이다.
  
    System.out.println(number); // number 변수에는 10이 들어있었다. 실행하면 11이 되어있다.
    // 마찬가지로 --도 가능하다.
    // ++나 --가 위치하는 곳에 따라 값의 변화도 존재한다.
    // 미리 계산을 하고 다시 선언하는 것과 선언하고 계산하는 것의 차이다.
    // 또한 이를 증감연산자라고 부른다.
  
    System.out.println(Math.PI);
    // 숫자와 관련된 메소드와 변수를 모아놓은 클래스가 있다. 이를 이용하면 숫자를 더 체계적으로 관리할 수 있다.
    // 원주율의 값을 담고 있는 메소드가 존재한다. 임포트를 해야한다.
    // 출력되는 값은 double 데이터로 나타난다.
    
    double x = 3.14;
    double y = -10.0;
    
    double z = Math.min(x, y); // 두개의 값중에 작은 것을 출력한다. 반대로 max는 큰 것을 출력한다. 비교할 때에 좋다.
    System.out.println(z);
    
    System.out.println("abs >> " + Math.abs(z)); // 절댓값을 출력하는 메소드. abs는 앱솔루트의 약자이다.
    System.out.println("sqrt >> " + Math.sqrt(12.5)); // 제곱근을 출력하는 메소드.
  
    System.out.println("round >> " + Math.round(x)); // 소수점을 원하는 부분까지 반올림하는 메소드.
    System.out.println("ceil >> " + Math.ceil(x)); // 소수점을 위로 쳐올리는 메소드.
    System.out.println("floor >> " + Math.floor(x)); // 소수점을 아래로 쳐내리는 메소드.
    // 이 외에도 Math 클래스에 들어있는 메소드는 많다.
  }
}