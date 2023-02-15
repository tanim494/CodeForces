import java.util.Scanner;
public class codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int maximum = 0, minimum = 0;
        if(a > b && a > c){
            maximum = a;
        } else if(b > c){
            maximum = b;
        } else {
            maximum = c;
        }
        if (a < b && a < c){
            minimum = a;
        } else if (b < c) {
            minimum = b;
        } else {
            minimum = c;
        }
        System.out.printf("%d %d", minimum, maximum);
    }
}
