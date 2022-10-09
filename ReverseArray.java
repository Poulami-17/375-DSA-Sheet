import java.util.*;
public class ReverseArray {
    public static void Reverse_Array(int arr[]){
        for(int i=arr.length-1;i>=0;i--)
            System.out.print(arr[i]+" ");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for (int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        sc.close();
        Reverse_Array(arr);        
    }
}
