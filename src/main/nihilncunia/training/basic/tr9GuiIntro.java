package main.nihilncunia.training.basic;

import javax.swing.*;

public class tr9GuiIntro {
  public static void main(String[] args) {
    String name = JOptionPane.showInputDialog("이름을 입력하세요.");
    JOptionPane.showMessageDialog(null, "안녕하세요. " + name + "님.");
    // 사용자에게서 입력을 받고, 받은 입력을 띄울 수 있다. 가장 기초적인 gui라고 할 수 있겠다.
    
    int age = Integer.parseInt(JOptionPane.showInputDialog("나이를 입력하세요"));
    // showInputDialog 에는 문자열이 들어간다. 이를 int로 받기 위해서는 형변환을 해야한다.
    // Integer 클래스의 parseInt 메소드를 이용하면 된다. 이렇게 하면 int로 변환되어 잘 들어갈 것이다.
    JOptionPane.showMessageDialog(null, age + "세라고 답하셨습니다.");
  }
}