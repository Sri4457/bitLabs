import java.util.*;

class InvalidExpressionException extends Exception {
  public InvalidExpressionException(String e) {
    super(e);
  }
}

class CalculatorEpt {
  public static void main(String[] args) throws InvalidExpressionException {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first operand ");
    int a = sc.nextInt();
    System.out.println("Enter Second operand ");
    int b = sc.nextInt();
    System.out.println("Enter the Operation you want do +,-,/,%,*");
    String s = sc.next();
    switch (s) {
      case "+":
        System.out.println("The sum is : " + (a + b));
        break;
      case "-":
        System.out.println("The Substraction is : " + (a - b));
        break;
      case "/":
        System.out.println("The division is : " + (a / b));
        break;
      case "%":
        System.out.println("The Modulo is : " + (a % b));
        break;
      case "*":
        System.out.println("The Multiplication is : " + (a * b));
        break;
      default:
        try {
          throw new InvalidExpressionException("Please Enter valid operation like +,-,/,%,*");
        } catch (InvalidExpressionException e) {
          System.out.println(e);
        }
    }
  }
}
