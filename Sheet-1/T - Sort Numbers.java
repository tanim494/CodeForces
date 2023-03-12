import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int [] n = new int[3];
        for(int i = 0; i < 3; i++) {
            n[i] = sc.nextInt();
        }
        int [] sorted = n.clone();
        Arrays.sort(sorted);
        for(int i: sorted) {
            System.out.println(i);
        }
        System.out.println();
        for(int i: n) {
            System.out.println(i);
        }
   }
}
