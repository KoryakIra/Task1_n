package Task1;

import java.util.Scanner;

/**
 * Created by koryak on 28.03.2016.
 */
public class Task1_4_1 {
    public static void main(String[]args){

    System.out.println("Введите пароль и нажмите <Enter>.");
    Scanner scan = new Scanner(System.in);
    String parol = scan.next();
        for (int i = 0; i < args.length; i++)
    if(parol.equals(args[i]))
        System.out.println("Вы ввели верный пароль.");
    else System.out.println("Вы ввели неверный пароль.");
}
}
