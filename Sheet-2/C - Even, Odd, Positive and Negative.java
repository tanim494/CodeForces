import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int e = 0, o = 0, neg = 0, p = 0;
        int n = sc.nextInt();
        int [] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
            if (num[i] % 2 == 0) {
                e++;
            } else {
                o++;
            }
            if (num[i] > 0) {
                p++;
            } else if (num[i] < 0) {
                neg++;
            }
        }
        System.out.printf("Even: %d\nOdd: %d\nPositive: %d\nNegative: %d",e,o,p,neg);
   }
}
