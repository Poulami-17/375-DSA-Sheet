// Time complexity is O(n^2)

public class DuplicateElement{
    public static boolean Duplicate_Element(int arr[]) {
        int count=1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j])
                    count++;
            }
        }
        if (count>1)
            return true;
        else    
            return false;
    }
    public static void main(String[] args){
        int arr[]={1,4,5,1,5,6};
        boolean b=Duplicate_Element(arr);
        System.out.println(b);
    }
}