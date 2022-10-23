import java.util.*;
public class UniqueElement {
    public static int Unique_Element(int arr[]){
        int ans=0;
        for(int i=0;i<arr.length;i++)
            ans=ans^arr[i];
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        sc.close();
        int result=Unique_Element(arr);
        System.out.println(result);
    }
    
}
