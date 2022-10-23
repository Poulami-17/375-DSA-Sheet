import java.util.*;
class SwapAlternates{
    public static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    public static void SwapAlternate(int arr[]){
        for(int i=0;i<arr.length;i+=2){
            if((i+1)<arr.length){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
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
    SwapAlternate(arr);    
    }
}