import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int step = 0;
        int temp = 0;
        if (n / 5 >= 1) {
            temp = n / 5;
            step += temp;
            n -= step * 5;
        }
        if (n / 4 >= 1) {
            temp = n / 4;
            step += temp;
            n -= step * 4;
        }
        if (n / 3 >= 1) {
            temp = n / 3;
            step += temp;
            n -= step * 3;
        }
        if (n / 2 >= 1) {
            temp = n / 2;
            step += temp;
            n -= step * 2;
        }
        if (n / 1 >= 1) {
            
            temp = n / 1;
            step += temp;
            //n -= step * 1;
        }
        System.out.println(step);
 }
}
