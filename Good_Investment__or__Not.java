import java.util.*;

public class GoodInvestment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y=sc.nextInt();
        sc.close();
        if(2*y<=x){
            System.out.println("YES");
        }else
            System.out.println("NO");
    }
}
