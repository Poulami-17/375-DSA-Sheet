import java.util.*;
    /* Kadane's Algo */
public class Maximum_Sum_Subarray {
    public static void MaximumSumSubarray(int nums[]){
        int sum=0;
        int maxi=nums[0];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            maxi=Math.max(maxi, sum);

            if (sum<0)
                sum=0;
        }
        System.out.println(maxi);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int nums[]=new int[size];
        /* Taking input of array elements */
        for(int i=0;i<size;i++)
            nums[i]=sc.nextInt();
        sc.close();
        MaximumSumSubarray(nums);
    }
}
