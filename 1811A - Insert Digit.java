import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int d = sc.nextInt();
            String num = sc.next();
            StringBuilder maxNum = new StringBuilder();
            boolean added = false;
            for (int j = 0; j < n; j++) {
                char c = num.charAt(j);
                if (!added && c < d + '0') {
                    maxNum.append((char) (d + '0'));
                    added = true;
                }
                maxNum.append(c);
            }
            if (!added) {
                maxNum.append((char) (d + '0'));
            }
            System.out.println(maxNum);
        }
    }
}
