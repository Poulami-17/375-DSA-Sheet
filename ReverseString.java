import java.util.*;
public class ReverseString {
    public static void Reverse_String(String s){
        System.out.println("\nReversed String: ");
        for(int i=s.length()-1;i>=0;i--)
            System.out.print(s.charAt(i));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        System.out.println("Previous String: ");
        for(int i=0;i<s.length();i++)
            System.out.print(s.charAt(i));
        Reverse_String(s);
    }
}
