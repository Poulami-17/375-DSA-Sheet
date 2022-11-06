import java.util.*;
class ReverseAfterGivenIndex{
    public static void PrintArray(int arr[]){
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
    } 
    public static void ReverseArray(int arr[],int m){
        int start = m + 1;
        int end = arr.length-1;
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        PrintArray(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++)
            arr[i] = sc.nextInt();
        int m = sc.nextInt();
        ReverseArray(arr, m);
        sc.close();
    }
}