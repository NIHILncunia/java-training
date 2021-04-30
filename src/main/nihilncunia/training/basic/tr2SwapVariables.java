package main.nihilncunia.training.basic;

public class tr2SwapVariables {
  public static void main(String[] args) {
    String x = "NIHIL";
    String y = "LIHIN";

    System.out.println("x: " + x);
    System.out.println("y: " + y);

    String temp; // 비어있는 변수
    temp = x;
    x = y;
    y = temp;
    
    System.out.println("x: " + x);
    System.out.println("y: " + y);
    // 비어있는 변수를 이용해서 두개 이상의 변수의 값을 스위칭 할 수 있다.
  }
}