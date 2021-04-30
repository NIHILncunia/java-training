package main.nihilncunia.training.basic;

public class tr12Logical {
  public static void main(String[] args) {
    // 논리 연산자에 대해서 알아보자. 논리 연산자는 세가지가 있다.
    // !
    // ||
    // &&
    
    // !는 반대를 의미한다. NOT이라고 부른다. true면 false가 되고, false면 true가 된다. !false는 true와 같다.
    // || 는 OR를 의미한다. 이것 혹은 저것 중에서 둘 중 하나만 충족되어도 true가 되는 연산이다.
    //  && 는 AND를 의미한다. 이것 혹은 저것 중에서 둘 다 충족되어야지만 true가 되는 연산이다.
    
    int number = 30;
    
    if (number > 20 || number >= 45) {
      System.out.println("하나만 충족되어도 참입니다.");
    }
  
    if (number > 20 && number >= 45) {
      System.out.println("하나라도 거짓이면 거짓입니다.");
    }
    
    // 두번째는 어떻게 해도 거짓이기 때문에 출력되지 않았다. 이러한 논리 연산자들을 잘 이용하는 것이 프로그래밍을 잘하는 길이다.
  }
}