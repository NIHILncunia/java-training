package main.nihilncunia.training.basic;

import java.util.ArrayList;
import java.util.Arrays;
// 어레이리스트를 사용하려면 임포트해야한다.

public class tr17ArrayList {
  public static void main(String[] args) {
    // 어레이리스트에 대해서 알아보자.
    // 어레이리스트는 길이의 변화가 가능한 배열이다. 그렇기 떄문에 배열과는 다르다.
    
    // ArrayList names = new ArrayList<>();
    // 어레이리스트를 선언한다. 보통은 특정 타입을 모아놓은 어레이리스트를 사용한다.
    // 결국 아래와 같이 만들어주는 게 좋다.
    
    ArrayList<String> names = new ArrayList<>(10);
    // 스트링 타입에 한정된 어레이리스트를 만들었다. new ArrayList<>() 에서 괄호에는 용량의 수가 들어간다.
    // 용량은 데이터의 개수라고 보면 된다.
    
    names.add("아이유");
    names.add(0, "정은지");
    // 값을 추가하는 방법이다. add 메소드는 리스트에 가장 끝에 값을 추가한다.
    // 물론 어디에 추가할지 지정해줄 수 있다.
    // 이렇게 하면 아이유가 먼저 추가되었지만 정은지의 인덱스를 0으로 만들었기 때문에 아이유의 인덱스가 1로 밀려나게 된다.
    
    System.out.println(names);
    
    names.set(0, "조보아");
    names.add("정은지");
    
    System.out.println(names);
    // set 메소드는 리스트의 값을 바꾸는 기능을 한다. 인덱스 0은 정은지였는데 이제는 조보아가 될 것이다. 교체가 되었기 때문이다.
    // 정은지를 다시 끝에 추가해준다.
    
    System.out.println(names.get(0));
    // get 메소드는 인덱스값을 넣으면 해당 항목을 가져올 수 있다.
    
    System.out.println(names.contains("아이유"));
    System.out.println(names.indexOf("아이유"));
    // 위의 메소드는 리스트에 값이 존재하는지를 확인하는 것이다. 존재한다면 트루를 던진다.
    // 아래의 메소드는 리스트에 값이 있고, 그 값이 어디에 있는지 확인하는 것이다. 없으면 -1을 던진다.
    
    // 리스트에서 데이터를 지우는 방법은 remove 메소드를 사용하는 것이다.
    names.remove(0);
    // 인덱스 0을 지워버린다. 조보아가 사라질 것이다.
    
    System.out.println(names);
    
    names.clear();
    // 리스트 안의 모든 값을 지워버리는 메소드는 clear 메소드이다.
    
    System.out.println(names);
    
    ArrayList<Integer> number = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println(number); // 리스트를 생성할 때에 기본값을 설정해줄 수도 있다. 위처럼 하면 된다.
    System.out.println(number.size()); // 리스트의 현재 크기를 구하는 메소드이다.
    
    ArrayList<ArrayList<String>> IUSongs = new ArrayList<>();
    ArrayList<String> LostAndFound = new ArrayList<>(Arrays.asList("미운 오리", "미아", "있잖아", "Feel So Good", "Every Sweet Day"));
    ArrayList<String> GrowingUp = new ArrayList<>(Arrays.asList("바라보기", "Boo", "가여워", "A Dreamer", "Every Sweet Day", "미아", "나 말고 넷", "있잖아", "졸업 하는 날", "Feel So Good", "미운 오리", "마주보기(바라보기 그 후)"));
    
    IUSongs.add(LostAndFound);
    IUSongs.add(GrowingUp);
    System.out.println(IUSongs);
    // 이렇게 리스트 안에 리스트를 넣을 수도 있다. 이 경우엔 2차원 어레이리스트라고 한다.
    
    System.out.println(IUSongs.get(0).get(1)); // 2차원 리스트에서 값을 가져오려면 get 메소드를 두번 사용하면 된다. 0의 1이니까 미아가 출력된다.
    
    for (ArrayList<String> i: IUSongs) {
      System.out.println();
      for (String j: i) {
        System.out.println(j);
      }
    }
    // 이렇게 반복문 돌리는 것도 가능하다.
    // 위의 반복문은 배열이나 리스트를 반복할 때를 위해 사용되는 forEach 구조이다. 좀 더 간략하게 반복문을 돌릴 수 있다.
  }
}