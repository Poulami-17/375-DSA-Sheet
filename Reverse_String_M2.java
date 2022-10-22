import java.util.*;
public class Reverse_String_M2 {
    public static void Reverse_String(String s){
        String nstr="";
        char ch;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            nstr=ch+nstr;
        }
        System.out.println("New String: "+nstr);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        System.out.println("Old String: ");
        System.out.println(s);
        Reverse_String(s);
    }
}
