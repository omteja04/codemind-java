import java.util.*;
public class Greatest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        sc.close();
        if(a>b  && a>c){
            System.out.println(a);
        }
        if(b>c && b>a){
            System.out.println(b);
        }
        if(c>a && c>b){
            System.out.println(c);
        }
            
        
    }
}