package main.nihilncunia.firstprogram;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
  
    System.out.println("가격을 입력하세요.");
    double valueOfSupply = scanner.nextDouble();
    scanner.nextLine();
    double VatRate = 0.1;
    double ExpenseRate = 0.3;
    double Vat = valueOfSupply * VatRate;
    double Total = valueOfSupply + Vat;
    double Expense = valueOfSupply * ExpenseRate;
    double Income = valueOfSupply - Expense;
    // 변수로 다 빼면 코드가 보기 좋아진다.
    
    System.out.println("Value of supply: " + valueOfSupply);
    System.out.println("VAT: " + Vat);
    System.out.println("Total: " + Total);
    System.out.println("Expense: " + Expense);
    System.out.println("Income: " + Income);
    System.out.println("Dividend 1: " + Income * 0.5);
    System.out.println("Dividend 2: " + Income * 0.3);
    System.out.println("Dividend 3: " + Income * 0.2);
    // 일단 만들어두면 어떤 값이든 자동으로 계산을 해준다. 나중에 GUI를 만들던 어떻게 해서 개선하면 좋겠다.
  }
}