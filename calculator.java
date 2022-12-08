package DZ1;
import java.util.Scanner;

public class calculator {  
    public static void main(String[] args) {
        double num1;
        double num2;
        double result;
        char symbol;
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите 2 числа через пробел: ");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        System.out.print("\nВведите знак операции (+, -, *, /): ");
        symbol = reader.next().charAt(0);
        reader.close(); // - закрытие сканера
        switch(symbol) {
           case '+': result = num1 + num2;
              break;
           case '-': result = num1 - num2;
              break;
           case '*': result = num1 * num2;
              break;
           case '/': result = num1 / num2;
              break;
           default:  System.out.printf("Вы допустили ошибку при вводе операции.");
                return;
        }
        System.out.printf(num1 + " " + symbol + " " + num2 + " = " + result);
     }
  }
  
