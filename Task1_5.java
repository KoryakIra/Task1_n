package Task1; /**
 * Created by koryak on 25.03.2016.
 */

public class Task1_5 {
    public static void main(String[]args){
        int s=0,p=1;
        for(int i=0;i<args.length;i++)
        { System.out.print(args[i]+" ");
            int typ=Integer.parseInt(args[i]);
            s=s+typ;
            p=p*typ;
        }
        System.out.println("\nСумма чисел: "+s);
        System.out.println("Произведение чисел: "+p);
    }
}
