import java.util.*;
/* arr1= */
public class Intersection_of_Two_Sorted_Arrays {
    public static void Intersection(int arr1[],int arr2[],int n,int m){
        ArrayList<Integer> a=new ArrayList<Integer>();
        int i=0,j=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j])
                i++;
            else if (arr1[i]==arr2[j]){
                a.add(arr1[i]);
                i++;
                j++;
            }
            else
                j++;
        }
        PrintArrayList(a);
    }
    public static void PrintArrayList(ArrayList<Integer> a){
        for(int i=0;i<a.size();i++)
            System.out.print(a.get(i)+" ");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Array 1 : Size n
        int n=sc.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++)
            arr1[i]=sc.nextInt();
        // Array 2 : size m
        int m=sc.nextInt();
        int arr2[]=new int[m];
        for(int i=0;i<m;i++)
            arr2[i]=sc.nextInt();
        sc.close();

        Intersection(arr1, arr2, n, m);
    }
}
