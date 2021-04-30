package main.nihilncunia.training.basic;

import java.util.Scanner;
// 임포트를 할 수 있다.

public class tr3useScanner {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 사용자에게 입력을 받을 수 있는 클래스.
    
    System.out.println("당신의 이름은 무엇입니까?");
    String name = scanner.nextLine();
    // 변수를 지정하고, 이 변수를 사용자에게 입력받게 한다.

    System.out.println("당신의 나이는 얼마입니까?");
    int age = scanner.nextInt();
    // 다양한 타입을 이렇게 받을 수 있다.
    // 정작 실행을 해보면 음식에 대한 값을 받지 않고 그냥 끝나버린다.
    // 이 경우에는 아래에 넥스트 라인을 추가하는 것으로 해결이 가능하다.

    scanner.nextLine();
    // 다른 타입의 경우 이렇게 해주지 않으면 다음 값을 받지 못하는 것 같다.

    System.out.println("당신은 어떤 음식을 좋아합니까?");
    String food = scanner.nextLine();

    scanner.close(); // 닫아줘야 경고가 사라진다.

    System.out.println("반갑습니다! " + name + "님!");
    System.out.println(name + "님은 " + age + "세입니다.");
    System.out.println(name + "님이 좋아하는 음식은 " + food + "(이)군요!");
    // vscode에서는 안나왔던 한글이 인텔리제이에선 잘 나온다.
  }
}