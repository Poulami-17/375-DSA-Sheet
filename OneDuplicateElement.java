import java.util.*;
public class OneDuplicateElement {
    public static int DuplicateElement(int arr[]){
        int ans=0;
        for(int i=0;i<arr.length;i++)
            ans=ans^arr[i];
        for(int i=1;i<=arr.length-1;i++)
            ans=ans^i;
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        sc.close();
    int result=DuplicateElement(arr);
    System.out.println(result);
    }
}
