import java.util.*;
public class Sort012 {
    public static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }
    public static void Sorting(int arr[]){
        int low=0,mid=0,high=arr.length-1;
        while(mid<=high){
            if (arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1)
                mid++;
            else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
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
        Sorting(arr);
    }
}
