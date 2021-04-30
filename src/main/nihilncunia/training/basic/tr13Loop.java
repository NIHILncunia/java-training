package main.nihilncunia.training.basic;

public class tr13Loop {
  public static void main(String[] args) {
    int number = 1;
    while (number <= 30) {
      System.out.println("while >> " + number + "번 째 반복입니다.");
      number++;
    }
    
    // 일단 변수로 값을 만들어놓고, 그 값을 이용해서 반복문을 돌린다.
    // 반복문은 두가지 정도가 있는데 하나가 while이다. true 일 때에 루프가 돌기 때문에 조건이 절대로 true이기만 해서는 안된다.
    // 계속 true가 되면 프로그램이 계에에에속 반복문을 돌린다. 고장날 수도 있다.
    // 그래서 변수의 값을 더해주는 것으로 반복을 끝낼 수 있다.
    
    for (int number2 = 1; number2 <= 30; number2++) {
      System.out.println("for >> " + number2 + "번 째 반복입니다.");
    }
    
    // 두번째 반복문은 for라는 것이다. 변수를 for 내부에서 지정하고, 조건을 제시한 후에, 반복문을 돌 때 처리하는 수치의 변동까지
    // 한 번에 처리할 수 있다. 코드의 수도 확실하게 줄어든다.
    // 이중 삼중 반복도 돌릴 수 있다.
    
    do {
      System.out.println("프로그램에 필요한 값을 찾는 중..");
      
      if (number <= 30) {
        System.out.println("값을 찾았습니다! " + number + "번 째 반복을 시작합니다!");
      } else {
        System.out.println("에러! 찾는 값이 없으므로 프로그램을 실행할 수 없습니다.");
      }
    } while (number <= 30);
    
    // do while 문은 일반적인 while 문과는 다르게 일단은 한 번 실행을 하고, 그 다음에 반복을 돌리는 시스템을 갖고 있다.
    // 한 번은 반드시 실행하기 때문에 그 안에 if 문 등으로 자연스러운 흐름을 만들어놓아야한다.
    
    String symbol = "%";
    int rows = 4;
    int cols = 5;
    
    for (int ii = 0; ii < rows; ii++) {
      System.out.println();
      for (int jj = 0; jj < cols; jj++) {
        System.out.print(symbol);
      }
    }
    
    // 특정 문자로 4각형을 만들어보았다.
  }
}