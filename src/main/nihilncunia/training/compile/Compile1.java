package main.nihilncunia.training.compile;

public class Compile1 {
  public static void main(String[] args) {
    /*
    * 이번에는 편집기 없이 컴파일을 하는 방법에 대해서 알아본다.
    * 간단하게 클래스를 만들고 컴파일을 진행해볼 것이다.
    * 컴파일을 하기 위해서는 cmd와 같은 프롬프트가 필요하다.
    * 컴파일을 할 때에 필요한 것은 javac 이다.
    *
    * 컴파일은 확장자가 java인 파일을 class 파일로 만드는 것이다.
    * 일단은 프롬프트에서 java 파일이 있는 곳으로 이동한다.
    * javac Compile1.java 라고 치면 class 파일이 생성된다.
    *
    * 한글이 포함되어있는 경우에는 오류가 날 수도 있다. 이 경우엔 -encoding utf-8 옵션을 붙이면 해결된다.
    *
    * 클래스 파일을 실행할 때에는 java 명령어가 필요하다.
    *
    * java <파일 이름>
    *
    * 이렇게 하면 실행된다. 하지만 문제가 있었다!
    * 중요한 것이 있었다. 실행을 할 때에 주의해야 할 점은 지금 이 파일은 패키지에 속한 파일이다.
    * 그렇기 때문에 상위 폴더로 이동해서 실행해야한다!
    *
    * 실행되는 과정은 다음과 같다. 첫번째로 우리가 타이핑을 하면 자바는 파일 이름과 동일한 class 파일이 있는지 찾는다.
    * 찾는데에 성공하면 해당 파일에서 main 메소드를 찾아 순차적으로 실행하는 것이다.
    * */
    
    String nickname = "니힐 NIHIL";
  
    System.out.println("어서오세요. " + nickname + "님.");
  }
}