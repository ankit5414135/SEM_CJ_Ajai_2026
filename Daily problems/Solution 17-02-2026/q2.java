import java.util.*;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;

        while (n != 0) {
            int rem = n % 10;
            n = n / 10;
            if (rev > Integer.MAX_VALUE / 10 || 
               (rev == Integer.MAX_VALUE / 10 && rem > 7)) {
                System.out.println(0);
                return;
            }

            if (rev < Integer.MIN_VALUE / 10 || 
               (rev == Integer.MIN_VALUE / 10 && rem < -8)) {
                System.out.println(0);
                return;
            }
             sc.close();

            rev = rev * 10 + rem;
        }

        System.out.println(rev);
    }
}
