import java.util.*;
public class Character{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        sc.close();
        if(a>='A' && a<='Z'){
            System.out.println("uppercase alphabet");
        }
        else if(a>='a' && a<='z')
            System.out.println("lowercase alphabet");
        else
            System.out.println("not an alphabet");
    }
}