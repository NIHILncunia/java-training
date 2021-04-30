package main.nihilncunia.training.basic;
// 패키지는 서로 연관된 클래스들을 모아놓은 일종의 상자라고 보면 된다.
// 클래스는 마찬가지로 서로 연관이 되어있는 변수와 메소드를 모아놓은 작은 상자일 것이다.

import org.opentutorials.iot.*;
//import javax.swing.*;
// 패키지를 불러올 때 이렇게 하면 하위의 모든 클래스를 사용할 수 있다.
// 하나 하나 불러도 되지만 귀찮다.

public class tr7Program {
  public static void main(String[] args) {
    // String[] args
    // 이 부분도 결국엔 변수이다. 스트링으로 이루어진 배열을 의미한다.
    // args라는 이름을 가진 스트링 배열을 정의한 것이다. 이 안에는 인자를 넣어줄 수가 있다.
    
    // 매개변수는 파라미터라고 하고 전달인자는 아규먼트라고 한다.
    // 매개변수는 메소드를 정의할 때에 괄호 안에 넣는 변수이고 전달인자는 호출할 때에 매개변수에 전달할 값을 의미한다.
    // 이 부분은 js랑 마찬가지이다.
    
//    String Home = "402동 1406호";
//    String Home = JOptionPane.showInputDialog("주소를 입력하세요");
    String Home = args[0];
    // swing을 임포트하면 쓸 수 있는 클래스인 JOptionPane의 메소드로, 사용자에게 값을 입력받는 기능을 한다.
    // 이렇게 하면 주소가 바뀌어도 우리는 문제없이 프로그램을 실행시킬 수 있다.
    
    Elevator myElevator = new Elevator(Home);
    // 엘리베이터 부르기
    // 다른 사람의 패키지를 부르는 것은 이렇게 한다. 이미 스캐너를 다룰 때에 사용해봤다.
    // 아직은 모르는 부분이지만 클래스를 이용해서 새로운 인스턴스를 만드는 것 같다.
    // 파이썬에서도 이런 기능이 있고 자바스크립트에도 있는 것 같다. 클래스는 잘 안써서 모르겠다.
    
    myElevator.callForUp(1);
    
    Security mySecurity = new Security(Home);
    mySecurity.off();
    
    Lighting hallLamp = new Lighting(Home + " / Hall Lamp");
    hallLamp.on();
    
    Lighting floorLamp = new Lighting(Home + " / Floor Lamp");
    floorLamp.on();
    
    // 이게 뭐하는 것들인지 지금은 전혀 몰라도 된다. 그냥 이렇게 하라고 하니 이렇게 한다.
    // 잘 실행된다.
    
    // 중복을 제거하는 것은 프로그래머의 숙명이다. 중복되는 값인 [402동 1406호]를 변수로 빼준다.
    // 이렇게 하면 나중에 집이 바뀔 때에도 문제없이 변화를 적용할 수 있을 것이다.
  }
}