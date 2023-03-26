import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n < 2) {
                System.out.println("-1");
            } else if (i % 2 == 0) {
                System.out.println(i);
            }
        }
   }
}
