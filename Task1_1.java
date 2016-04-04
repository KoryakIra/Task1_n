package Task1;

import java.util.Scanner;

/**
 * Created by koryak on 22.03.2016.
 */
public class Task1_1 {
    public static void main(String args[]){
        System.out.println("Введите ваше имя и нажмите <Enter>:");
        Scanner scan = new Scanner(System.in);//выделяем память для ввода имени
        String name = scan.next();
        System.out.println("Приветствую тебя," + name+"!");
        scan.close();
    }

}
