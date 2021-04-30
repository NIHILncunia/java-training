package main.nihilncunia.training.basic;

import java.util.Random;

public class tr10Random {
  public static void main(String[] args) {
    dice(6);
    dice(6);
    dice(6);
    dice(20);
    dice(20);
    dice(20);
    // 인스턴스 하나 하나 만드는게 번거로워서 함수로 만들었다.
  }
  
  static void dice(int number) {
    Random random = new Random();
    // 난수를 다루는 클래스이다.
    
    int dice = random.nextInt(number) + 1;
    
    String string = String.format("%d면체 주사위 >> %d", number, dice);
    System.out.println(string);
    // 이름을 주사위라고 지었는데 전혀 주사위스럽지 않다.
    // nextInt에 값을 부여하자. 6을 넣었다. 이제 0부터 5까지의 수를 출력한다.
    // 그렇다면 1부터 6까지 나오게 하려면? nextInt 로 나온 값에 1을 더하면 되겠다.
    
    // 문자열에서 포맷을 이용하면 번거롭게 +를 안쓰고 문자 표현이 가능하다. 근데 이것도 귀찮다.
    // 이 부분은 자바스크립트가 더 나은 것 같다.
  }
}