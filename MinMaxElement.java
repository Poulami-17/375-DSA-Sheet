import java.util.*;
class MinMaxElement{
    public static void MinMax(int arr[]){
        int min=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if (min>arr[i])
                min=arr[i];
            if(max<arr[i])
                max=arr[i];
        }
        int a[]=new int[2];
        a[0]=min;
        a[1]=max;
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];

        for (int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        sc.close();
        MinMax(arr);
    }
}