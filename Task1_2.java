package Task1;

/**
 * Created by koryak on 23.03.2016.
 */
//Пример вывода аргументов командной строки в обратном порядке
public class Task1_2 {
    public static void main(String args[]){
        for( int i= args.length-1;i>=0;i--)//элементы массива нумеруются с 0!
            System.out.print(args[i]+" ");
    }
}
