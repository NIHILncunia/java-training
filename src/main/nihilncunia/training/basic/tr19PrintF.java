package main.nihilncunia.training.basic;

import java.util.Date;

public class tr19PrintF {
  public static void main(String[] args) {
    // printf에 대해서 알아보자.
    
    // printf는 println과 같은 출력을 위해 사용하는 메소드이다. 그런데 무언가 다르다.
    
    String name = "니힐";
    int age = 29;
    int minus = -28;
    int bigNumber = 1000000;
    String[] food = {"치킨", "피자", "핫도그"};
    double pi = 3.1674653414;
    boolean Bool = true;
    char c = 'N';
    
    System.out.printf("저는 %d세 입니다.%n", age);
    // String.format과 비슷한 기능을 가진다.
    // 이 포맷에 대한 것들은 알아두면 용이할 것으로 보인다. %d는 숫자를 의미한다.
    // 문자열을 형식에 맞게 만들어두고 뒤에 인자들을 넣으면 된다. 형식이 5개가 사용되었다면 순차적으로 5개의 인자를 넣어줘야한다.
    
    System.out.printf("저의 이름은 %S 입니다.%n", name);
    // 주의해야 할 점은 이것들은 줄바꿈이 안된다는 것이다. 그래서 직접 줄바꿈을 넣어줘야한다.
    // 줄바꿈을 명령하는 건 %n이다.
    // %s은 문자열이다. %s는 문자를 대문자로 바꿔서 출력하는 것이다. 한글에는 의미가 없다.
    
    System.out.printf("제가 좋아하는 음식은 %s과 %s 그리고 %s 입니다.%n", food[0], food[1], food[2]);
    
    // 단순히 출력하는 것 외에도 다른 기능을 넣을 수도 있다.
    System.out.printf("[%15s]%n", name);
    System.out.printf("[%-15s]%n", name);
    // %와 형식의 축약어 사이엔 숫자가 들어갈 수 있다. 이는 범위를 나타낸다.
    // 음수가 되면 왼쪽에 정렬된다.
    
    System.out.printf("이것은 숫자입니다. >> %7.2f%n", pi);
    System.out.printf("제 이름은.. %.1s.. 앗 끊겼습니다!%n", name);
    // .1 과 같은 소수점이 들어가면 글자의 개수를 의미한다. .1 이기 때문에 범위와 상관 없이 잘리는 것이다.
    // 범위는 출력되는 값보다 적으면 적용이 안된다.
    
    Date date = new Date();
    
    System.out.printf("현재는 %tH시 %tM분 %tS초 입니다.%n", date, date, date);
    System.out.printf("오늘은 %tY년 %tm월 %td일 입니다.%n", date, date, date);
    System.out.printf("오늘은 %tY년 %tB %tA 입니다.%n", date, date, date);
    // 이렇게 시간을 출력할 수도 있다.
  
    System.out.printf("%b 입니다.%n", Bool);
    System.out.printf("%B 입니다.%n", Bool);
    // 대문자 b는 불리언을 대문자로 변환해서 보여준다.
  
    System.out.printf("%c는 문자입니다.%n", c);
    // 문자열이 아닌 문자형식도 이렇게 표현할 수 있다.
  
    System.out.printf("양수: %+d와 음수: %d를 표현할 수 있습니다.%n", age, minus);
    System.out.printf("숫자의 빈칸을 0으로 채울 수 있습니다. >> %010d %n", age);
    System.out.printf("숫자에 쉼표를 넣어줄 수 있습니다. >> %,d %n", bigNumber);
    // 경우에 따라서 사용하면 효과적일 것 같은 기능들을 알아보았다.
  }
}