package Task1;

import java.util.Scanner;

/**
 * Created by koryak on 28.03.2016.
 */
public class Task1_6_4 {
    public static void main(String[] args) {
        System.out.println("Введите целые числа и нажмите <Enter>");
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            int i = scan.nextInt();
            if (i % 5 == 0&&i % 7 == 0) {
                System.out.print( " "+i );

            }
        }
    }
}
