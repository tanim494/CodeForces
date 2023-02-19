import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int score = 0;
        for(int i = 1; i <= t; i++) {
            String s = sc.next();
            if (s.contains("+")) {
                score++;
            }
            if (s.contains("-")) {
                score--;
            }
        }
        System.out.println(score);
    }
}
