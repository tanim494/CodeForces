import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        int n = sc.nextInt();
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag++;
                break;
            }
        }
        if (n == 0 || n == 1 || flag == 1) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
   }
}

/*
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 2) {
            System.out.println("YES");
            return;
        }
        if (n == 0 || n == 1 || n % 2 == 0) {
            System.out.println("NO");
            return;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
   }
}
*/
