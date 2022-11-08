import java.util.*;
public class NegativeElements {
    public static void PrintArray(int arr[]){
        for( int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    public static void Rearrange(int arr[]){
        int n=0,p=arr.length-1;
        while(n<p){
            if (arr[n]<0)
                n++;
            else if (arr[p]>=0)
                p--;
            else{
                int temp=arr[n];
                arr[n]=arr[p];
                arr[p]=temp;
                n++;
                p--;
            }
        }
        PrintArray(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        sc.close();
        Rearrange(arr);
    }

}
