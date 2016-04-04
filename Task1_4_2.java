package Task1;

import java.util.Scanner;

/**
 * Created by koryak on 28.03.2016.
 */
public class Task1_4_2 {
    public static void main(String[]args){
        System.out.println("Введите пароль с консоли и нажмите <Enter>");
        Scanner scan = new Scanner(System.in);
        String parol = scan.next();
        String parol1 ="1234";
        if(parol.equals(parol1))
        System.out.println("Вы ввели верный пароль.");
        else System.out.println("Вы ввели неверный пароль.");
    }
}
