import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int x = 0, y = 0;
        if (c >= a && c <= b && b >= c && b <= d) {
            x = c;
            y = b;
        } else if (a >= c && a <= d && b >= c && b <= d) {
            x = a;
            y = b;
        } else if (c >= a && c <= b && d >= a && d <= b) {
            x = c;
            y = d;
        } else if (a >= c && a <= d && d >= a && d <= b) {
            x = a;
            y = d;
        }
        if (x > 0 && y > 0) {
            if (x < y) {
                System.out.printf("%d %d", x, y);
            } else {
                System.out.printf("%d %d", y, x);
            }
        } else {
            System.out.printf("-1");
        }
   }
}
