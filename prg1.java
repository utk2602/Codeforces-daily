package utkdsa;
import java.util.Scanner;
public class prg1 {
    public static void main(String[] args) {
         int a,b, c, m, n = 0;
        Scanner s = new Scanner(System.in);
        m= s.nextInt();
         for(int i=0;i<m;i++){
             a= s.nextInt();
             b= s.nextInt();
             c= s.nextInt();
             if(a==1&&b==1||a==1&&c==1||b==1&&c==1){
                 n++;
         }
    }
         System.out.println(n);
    }
}