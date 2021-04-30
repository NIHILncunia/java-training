package main.nihilncunia.training.basic;

public class tr4String {
  public static void main(String[] args) {
    System.out.println("기본적인 문자열은 큰따옴표로 감싼다.");
    System.out.println('S' + 't' + 'r' + 'i' + 'n' + 'g');
    System.out.println("작은 따옴표는 반드시 하나만의 글자를 나타낸다.");
    // 위의 내용은 데이터 타입에서 알아본 것이다.
  
    System.out.println("여러 줄에 걸쳐서\n입력 하려면 특수한 문자를 사용해야한다.");
    System.out.println('S');
    System.out.println('s');
    System.out.println("큰 따옴표 안에서 큰 따옴표를 사용하는 방법은 \"역슬래시\"를 이용하는 것이다.");
    // 이는 이스케이프라는 것이다. 자바스크립트에도 이런 기능이 있어서 그다지 새롭지는 않다.
  
    System.out.println("글자를 세는 방법은 메소드를 이용하는 것이다.".length());
    // 자바스크립트에도 있는 기능이다. 조금 모양이 다르긴 하지만 결국 기능은 같다.
  
    System.out.println("문자열의 일부분을 바꿀 수 있다.");
    System.out.println("문자열의 일부분을 바꿀 수 있다.".replace("문자열", "문자"));
    // 역시나 자바스크립트에도 있다.
    
    String name1 = "nihil";
    String name2 = "nihil";
    // 이 두 변수는 같은 방법으로 만들어졌다.
    
    String name3 = new String("nihil");
    String name4 = new String("nihil");
    // 이 두 변수도 같은 방법으로 만들어졌다.
    
    System.out.println(name1 == name2);
    System.out.println(name2 == name3);
    System.out.println(name3 == name4);
    // 전자는 true인데 후자는 false이다. 그 이유는 앞서 만들어진 두 변수들은 하나의 데이터를 가리키고 있다.
    // 하지만 나중에 만들어진 두 변수들은 클래스를 이용해 인스턴스를 형성했기 때문에 같은 문자열이어도 다른 데이터임을 의미한다.
    // 따라서 비교를 해도 같다고 나오지 않는다. 결론적으로 변수들의 주소를 비교했기 때문에 저렇게 나오는 것이다.
    
    boolean result1 = name1.equals(name2);
    boolean result2 = name1.equals(name3);
    System.out.println(result1);
    System.out.println(result2);
    // 하지만 이렇게 한다면 선언 방식이 다르건 뭐건 실제 데이터만을 비교하기 때문에 원하는 답을 얻을 수가 있다.
  }
}