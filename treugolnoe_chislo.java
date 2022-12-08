//Вычислить n-ое треугольное число(сумма чисел от 1 до n)

package DZ1;
import java.util.Scanner;

public class treugolnoe_chislo {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in); //iScanner - переменная
        System.out.printf("Введите число: ");
        int number = iScanner.nextInt(); //считывает введенное число int
        int result = 0;
        for (int i = 1; i <= number; i ++){
            result += i;
        }
        System.out.println(result);
        iScanner.close();
    }   
}

