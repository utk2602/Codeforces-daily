import java.util.*;
public class prg{
    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c =  in.nextInt();
        int[] arr = new int[3];
        arr[0] = a; 
        arr[1] = b;
        arr[2] = c
        Arrays.sort(arr);
        System.out.println(arr[1]-arr[0]+arr[2]-arr[1]);
    }
}