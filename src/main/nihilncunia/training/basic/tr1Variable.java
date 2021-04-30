package main.nihilncunia.training.basic;

public class tr1Variable {
  public static void main(String[] args) {
    System.out.println("Hello World!!");
    System.out.println("I am NIHILncunia.");
    // 자바스크립트의 콘솔로그와 같은 기능이다.

    int x = 500;
    String name = "NIHIL";
    // 이것은 변수들인데, 다양한 변수 형식들 중 두가지에 불과하다.
    // 일단 자바스크립트와는 다르게 자바에는 숫자들의 범위가 존재한다.
    // 아래는 문자열을 지정하는 변수이다. 자바스크립트는 var 혹은 let, const 면 숫자든 뭐든 가능했는데 자바는 다르다.
    // 또한 이 변수들에는 용량이 존재한다. 상당히 복잡한 편이다.

    System.out.println(x + " is Number.");
    System.out.println(name);

    // 이 아래는 간단한 자료형들을 나열한 것이다.
    // ----------primitive----------
    System.out.println("---------- primitive DataType ----------");

    // 불리언
    boolean a = true; // 1 bit, true? false?

    System.out.println(a);

    // 숫자
    byte num = 0; // 1 byte, -128 ~ 127
    short num2 = 0; // 2 bytes -32,768 ~ 32,767
    int num3 = 0; // 4 bytes -20억 ~ 20억
    long num4 = 10000000000L; // 8 bytes -900경 ~ 900경
    // long 타입에는 L을 붙여주는 게 정신건강에 좋다.

    System.out.println(num);
    System.out.println(num2);
    System.out.println(num3);
    System.out.println(num4);

    // 소수점 있는 숫자들
    float num5 = 3.1415926f;
    // 4 bytes 소수점 6~7 자리까지 f를 붙여야한다.
    // 출력될 때에는 f가 사라진다. 아래랑 구분하기 위해 f를 붙이는 것이다.
    // 아무리 길게 넣어봤자 7자리까지만 출력된다.
    double num6 = 3.141592653589793;
    // 8bytes 소수점 15자리까지. f 안붙인다.
    // 역시나 마찬가지로 아무리 길게 넣어봤자 15자리의 수 까지만 출력된다.

    System.out.println(num5);
    System.out.println(num6);

    // 문자열
    char w = 'w'; // 2bytes 하나의 문자를 나타낸다. 작은따옴표로 감싼다.
    System.out.println(w);

    // ----------reference----------
    System.out.println("---------- reference DataType ----------");

    // 문자열
    String js = "JavaScript"; // varies 큰 따옴표로 감싼다.

    System.out.println(js);
    
    System.out.println("---------- 정리 ----------");
    System.out.println("String\ndeclaration = 선언한다.\n");
    System.out.println("String x\nassignment = 할당하다.\n");
    System.out.println("String x = \"string\"\ninitialization = 값 설정.\n");
    // declaration = 선언한다.
    // assignment = 할당하다.
    // initialization = 값 설정.
    
    // primitive DataType 은 기본형 타입이라고 부르고 값을 저장할 때 실제 값을 저장한다.
    // reference DataType 은 참조형 타입이라고 부르고 값을 저장할 때에 값의 참조값을 저장한다.
  }
}