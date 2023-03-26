import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            factorial(num);
        }
   }
   public static void factorial(int x) {
       long fact = 1;
       for (int i = 1; i <= x; i++) {
           fact *= i;
       }
       System.out.println(fact);
   }
}
