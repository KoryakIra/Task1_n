package Task1;

import java.util.Scanner;

/**
 * Created by koryak on 29.03.2016.
 */
public class Task1_6_7 {
    public static void main(String []args){
        int n;
        Scanner scan= new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве");
        n=scan.nextInt();
        if (n<3) {
            System.out.println("Программа завершена");
            System.exit(0);
        }
        double []nums=new double[n];
        for (int i=0;i<n;i++){
            System.out.println("Введите "+(i+1)+"-ый элемент массива");
            nums[i]=scan.nextDouble();}
        int []num=new int[n];
        for (int i=1;i<n-1;i++){
            if (nums[i] == ((nums[i - 1] + nums[i + 1]) / 2)){
            num[i] =(int)(nums[i]);
                System.out.println("Элемент массива, равный полусумме соседних: "+num[i]);
            }}}}
