package Task1;

import java.util.Scanner;

/**
 * Created by koryak on 29.03.2016.
 */
public class Task1_6_2 {
    public static void main(String []args){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int n;
        Scanner scan= new Scanner(System.in);
        System.out.println("Введите n");
        n=scan.nextInt();
            int []nums=new int[n];
            for (int i=0;i<nums.length;i++){
                System.out.println("Введите "+(i+1)+"-ый элемент массива");
                nums[i]=scan.nextInt();
                if(max<nums[i])
                    max=nums[i];
                if (min>nums[i])
                    min=nums[i];
                }

        System.out.println("Max: "+max);
        System.out.println("Min: "+min);

        }}


