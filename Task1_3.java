package Task1;

import java.util.Scanner;

/**
 * Created by koryak on 23.03.2016.
 */
public class Task1_3 {
    public static void main(String[]args){
        int n,arr[];
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        n = in.nextInt();
        arr = new int [n];
        for(int i=0;i<arr.length;i++)
            arr[i]=(int)(Math.random()*n);
        for(int i:arr)
            System.out.println(i+ " ");
    }
}
