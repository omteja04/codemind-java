import java.util.*;

public class StudentRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int i=1;
        while (i<=tc) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            if ((m - k) >= n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            i++;
        }
        sc.close();
    }
}
