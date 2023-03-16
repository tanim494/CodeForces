import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = x / 10;
        int b = x % 10;
        if (a == 0 || b == 0) {
            System.out.println("NO");
            return;
        }
        if (a % b == 0 || b % a == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
   }
}
