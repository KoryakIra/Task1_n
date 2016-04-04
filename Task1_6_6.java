package Task1;

/**
 * Created by koryak on 29.03.2016.
 */
public class Task1_6_6 {
    public static void main(String[]args){
        int i,j,k,l,m,n,q=0;
        for (i=1;i<10;i++){
            for (j=0;j<10;j++){
                for(k=0;k<10;k++){
                    for (l=0;l<10;l++){
                        for(m=0;m<10;m++){
                            for (n=0;n<10;n++){
                                if ((i + j + k) == (l + m + n)){
                                    System.out.println(i*100000+j*10000+k*1000+l*100+m*10+n);
                                    q=q+1;
                            }
                        }
                    }
                }

            }
        }
    }System.out.println("Всего " + q+" шестизначных счастливых чисел.");
}}
