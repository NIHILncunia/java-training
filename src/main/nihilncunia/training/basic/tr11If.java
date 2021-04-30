package main.nihilncunia.training.basic;

public class tr11If {
  public static void main(String[] args) {
    // 조건문에 대해서 알아보자. 조건문은 어떠한 조건에 따라 프로그램의 분기를 설정할 수 있는 문법이다.
    // 자바스크립트에도 있는 부분이니 만큼 이해는 어렵지 않을 것이다.
    
    int age = 18;
    
    if (age >= 20) {
      System.out.println("참에 해당하면 여기가 실행된다.");
    } else if (age <= 20) {
      System.out.println("또 다른 조건에 충족되면 여기가 실행된다.");
    } else {
      System.out.println("거짓에 해당하면 여기가 실행된다.");
    }
    // 생긴 것도 자바스크립트랑 똑같은 것 같다.
    // if 와 else 뿐 아니라 else if 도 이용할 수 있다.
    
    String Tier = "normal";
    
    switch (Tier) {
      case "normal":
        System.out.println("당신은 등급이 없습니다!");
        break;
      case "bronze":
        System.out.println("당신의 등급은 브론즈입니다!");
        break;
    }
    // 스위치문이다. 특정 값의 변화에 따라서 프로그램의 흐름이 결정된다.
    // if문과의 차이점은 두세가지 이상의 조건도 하나의 경우도 묶어낼 수 있다는 것에 있다.
  }
}