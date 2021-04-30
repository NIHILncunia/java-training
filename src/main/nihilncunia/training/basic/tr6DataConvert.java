package main.nihilncunia.training.basic;

public class tr6DataConvert {
  public static void main(String[] args) {
    // 데이터의 변환은 캐스팅이라고 부른다. 데이터의 변환을 다뤄야 하는 때가 반드시 오게된다.
    // 데이터들은 각 데이터타입에 맞게 사용되어야한다.
    
    int a = (int) 1.1;
    System.out.println(a);
    // 1.1은 정수가 아니다. 더블 타입의 데이터인데 (int) 라는 부분이 이 데이터를 정수로 바꿔준다.
    // 정수가 되기 때문에 소수점은 증발하게 된다. 이는 손실이 생긴다는 것을 의미한다.
    
    double b = 1;
    System.out.println(b);
    // 이 경우에는 손실이 없기 때문에 사실상 아래와 같은 의미이다.
    
    // double b2 = (double) 1;
    // 1이 더블 타입이 되면 1.0이 되기 때문에 1이나 1.0이나 결국 같다. (사실 이렇게는 안해도 된다.)
    // 하지만 위처럼 1.1이 1이 되는 경우엔 손실이 있기 때문에 자동으로 바꿔주지 않는다고 생각하면 된다.
    // 실제로 위처럼 하니 경고가 뜬다.
    
    String c = Integer.toString(100);
    // 정수를 문자열로 바꾸는 방법이다. 자바스크립트에서도 이런식으로 데이터 타입을 변환하는 경우가 종종 있었는데,
    // 자바에서도 그럴 순간이 올 것 같다.
  
    System.out.println(c.getClass());
    // 문자열이 맞는지 확인하는 방법이다. 분명히 100은 숫자인데 문자열이 된 것이다.
    
    String pi = "3.14"; // 이것은 문자열이다.
    double doublePi = Double.parseDouble(pi); // 이렇게 하면 문자열이 더블이 되어 변환된다.
    System.out.println(doublePi);
  }
}