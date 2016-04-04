package Task1;

/**
 * Created by koryak on 29.03.2016.
 */
public class Task1_6_5 {
    public static void main(String[] args) {
        int i, j, k, n=0;
        for (i = 1; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                for (k = 0; k < 10; k++) {
                    if (i != j && i != k && j != k) {
                        System.out.println(i * 100 + j * 10 + k);
                        n = n+1;
                    }
                }
            }

        }System.out.println("Всего " + n+" трехзначных чисел,в десятичной записи которых нет одинаковых цифр. ");


    }
}