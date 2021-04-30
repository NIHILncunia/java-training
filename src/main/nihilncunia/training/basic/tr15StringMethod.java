package main.nihilncunia.training.basic;

public class tr15StringMethod {
  public static void main(String[] args) {
    // 스트링 메소드에 대해서 알아본다. 전부 알아볼 수는 없다. 자주 사용하는 것들만 우선적으로 알아본다.
    
    String name = "Nihil";
    
    System.out.println(name.length());
    // 문자열의 길이를 알려주는 메소드이다.
    // >> 5
    
    System.out.println(name.equals("nihil"));
    System.out.println(name.equalsIgnoreCase("nihil"));
    // 전자는 해당 변수와 문자열이 확실하게 같은지 아닌지를 검사하는 메소드. 불리언이다.
    // 후자는 대소문자가 달라도 글자가 같으면 트루를 가져온다. 경우에 따라서 잘 이용하면 되겠다.
    // >> false
    // >> true
    
    System.out.println(name.charAt(0));
    // char 타입은 하나의 글자를 담는 데이터 타입이다. 이 메소드는 문자열에서 원하는 인덱스를 가져오는 메소드이다.
    // >> N
    
    System.out.println(name.indexOf('N'));
    // 이 메소드는 문자열에서 어떤 문자가 몇번 인덱스인지 알아내는 메소드이다. 위에 있는 메소드와는 반대라고 보면 된다.
    // 값이 없으면 -1을 뱉는다.
    // >> 0
    
    System.out.println(name.isEmpty());
    // 이 메소드는 값이 비어있는지 아닌지를 알려준다. 비어있으면 트루가 나온다.
    // >> false
    
    System.out.println(name.toUpperCase());
    System.out.println(name.toLowerCase());
    // 문자열을 대문자로 만드는 메소드와 소문자로 만드는 메소드다.
    // >> NIHIL
    // >> nihil
    
    System.out.println(name.replace("N", "B"));
    // 문자열에서 특정 문자를 바꿀 수 있는 메소드이다.
    // >> Nihil => Bihil
  }
}