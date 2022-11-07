import java.util.*;
public class Sort01{
    public static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    public static void Sort(int arr[]){
        int start=0, end=arr.length-1;
        while(start<end){
            if (arr[start]==0 && start<end)
                start++;
            else if (arr[end]==1 && start<end)
                end--;
            else{ // arr[start]==0 && arr[end]==1 && start < end
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            } 
        }
        PrintArray(arr);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];

        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        sc.close();

        Sort(arr);
    }
}