import java.util.Scanner;
public class codeforces {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int n = sc.nextInt();
            int flag = 0, x = 0, y = 0;
            sc.nextLine();
            String str = sc.nextLine();
            for (int j = 0; j < n; j++) {
                char te = str.charAt(j);
                if (te == 'R') {
                    x++;
                } else if (te == 'L') {
                    x--;
                } else if (te == 'U') {
                    y++;
                } else if (te == 'D') {
                    y--;
                }
                if (x == 1 && y == 1) {
                    flag++;
                }
            }
            if (flag > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
