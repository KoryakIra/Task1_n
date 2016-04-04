package Task1;

import java.util.Scanner;

/**
 * Created by koryak on 25.03.2016.
 */
public class Task1_6_1 {
    public static void main(String []args){
        System.out.println("Введите через пробел целые числа и нажмите <Enter>");
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            int i = scan.nextInt();
            if(i%2==0)
            { System.out.println("Четное число "+i);}
            else {
            System.out.println("Нечетное число "+i);
                }
            }
        }}


