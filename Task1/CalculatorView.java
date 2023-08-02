
import java.util.Scanner;

public class CalculatorView {
  public Scanner scanner;

  public CalculatorView () {
    scanner = new Scanner(System.in);
  }

  public void displayResult(int result) {
    System.out.println("Результат " + result + ". ");
  }

  public String getOperation() {
    System.out.println("Введите операцию: ( +, -, *, /. )");
    return scanner.nextLine();
  }

  public int getOperand () {
    System.out.println("Введите число: ");
    return Integer.parseInt(scanner.nextLine());
  }
}
