/**
 * CalculatorModel
 */
public class CalculatorModel {

  private int result;

  public void add(int num1, int num2) {
   result = num1 + num2;
  }

  public void subtrackt (int num1, int num2) {
    result = num1 - num2;
  }

  public void multiply (int num1, int num2) {
    result = num1 * num2;
  }

  public void divide(int num1, int num2) {
    if (num2 != 0) {
        result = num1 / num2;
    } else {
        // Обработка деления на ноль
        throw new IllegalArgumentException("На ноль делить нельзя!");
      }
    }
  
  public int getResult() {
    return result;
  }


}