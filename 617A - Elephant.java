import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int step = 0;
        if (n / 5 >= 1) {
            int step5 = n / 5;
            step += step5;
            n -= step * 5;
        }
        if (n / 4 >= 1) {
            int step4 = n / 4;
            step += step4;
            n -= step * 4;
        }
        if (n / 3 >= 1) {
            int step3 = n / 3;
            step += step3;
            n -= step * 3;
        }
        if (n / 2 >= 1) {
            int step2 = n / 2;
            step += step2;
            n -= step * 2;
        }
        if (n / 1 >= 1) {
            int step1 = n / 1;
            step += step1;
            //n -= step * 1;
        }
        System.out.println(step);
 }
}
