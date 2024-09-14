import java.util.*;
public class prg{
    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int[] arr = new int[n];
        int max=0;
        int maxi=0;
        int min=0;
        int mini=0;
        int maxm=0;
        int minm=0;
        int tm=0;
        for(int i =0 ; i < n ; i ++){
            arr[i] = in.nextInt();
            if(max<arr[i]){
                maxi=i;
                max=arr[i];
            }if(min>arr[i]){
                mini=i;
                min=arr[i];
            }
        }
        maxm=maxi;
        minm=n-1-mini;
        if(maxi>mini){
            tm=maxm+minm-1;
        }
        else{
            tm=maxm+minm;
        }
        System.out.println(tm-1);
    }
}