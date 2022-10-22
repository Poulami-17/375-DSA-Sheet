import java.util.*;
public class Reverse_String_M3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    sc.close();
    char ch[]=s.toCharArray();
    for(int i=ch.length-1;i>=0;i--)
        System.out.print(ch[i]);
    }
    
}
