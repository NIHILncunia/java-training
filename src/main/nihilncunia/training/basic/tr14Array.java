package main.nihilncunia.training.basic;

import java.util.Arrays;

public class tr14Array {
  public static void main(String[] args) {
    // 배열에 대해서 알아보자.
    
    String[] names = {"NIHIL", "IU" ,"LIHIN"};
    System.out.println(names[0]);
    // String[] args 에서도 보았듯이 이는 문자열로 이루어진 배열을 의미한다.
    // 자바스크립트와는 다르게 자바에서의 배열은 중괄호를 이용해 만들 수 있다.
    // 배열의 항목을 출력하는 방법은 자바스크립트와 같다. 인덱스는 0부터 시작된다.
    // 없는 인덱스를 출력하려고 하면 에러가 난다.
    
    String[] zodiac = new String[12];
    String[] animals = {
      "양자리", "황소자리", "쌍둥이자리", "게자리", "사자자리", "처녀자리",
      "천칭자리", "전갈자리", "궁수자리", "염소자리", "물병자리", "물고기자리"
    };
    // 개수를 미리 지정해두고 후에 값을 넣을 수도 있다.
    
    zodiac[0] = "백양궁";
    zodiac[1] = "금우궁";
    zodiac[2] = "쌍아궁";
    zodiac[3] = "거해궁";
    zodiac[4] = "사자궁";
    zodiac[5] = "처녀궁";
    zodiac[6] = "천칭궁";
    zodiac[7] = "천갈궁";
    zodiac[8] = "인마궁";
    zodiac[9] = "마갈궁";
    zodiac[10] = "보병궁";
    zodiac[11] = "쌍어궁";
  
    System.out.println(Arrays.toString(zodiac));
    System.out.println(Arrays.toString(animals));
    
    for (int i = 0; i < zodiac.length; i++) {
      System.out.println("황도 12궁의 " + (i + 1) + "번째는 " + zodiac[i] + "(" + animals[i] + ")이다.");
    }
    // 이렇게 배열을 이용해서 반복을 하는 방법도 존재한다.
  
    // 2차원 배열
    String[][] Apink = {
      {"박초롱", "정은지", "윤보미"},
      {"손나은", "김남주", "오하영"},
    };
    // 2차원 배열은 배열의 안에 배열이 있는 것이다. 경우에 따라서는 10차원 배열도 얼마든지 가능하다.
  
    for (int ii = 0; ii < Apink.length; ii++) {
      System.out.println();
      for (int jj = 0; jj < Apink[ii].length; jj++) {
        System.out.print(Apink[ii][jj] + " ");
      }
    }
    // 2차원 배열을 이용해 반복문을 돌릴 수 있다.
  }
}