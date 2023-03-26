import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        int max = num[0];
        for (int i = 1; i < n; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println(max);
   }
}
