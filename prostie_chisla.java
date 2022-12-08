//Вывести все простые числа от 1 до 1000

package DZ1;

public class prostie_chisla {
    public static void main(String[] args) {
            int number = 1000;
            int i, count;
            for (i = 1; i <= number; i++) {
                count = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0)
                        count++;
                }
                if (count <= 2)
                    System.out.printf("%s, ", i);
            }
        }
    }
