import java.util.Scanner;
public class codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        float c = (float) a / b;
        int floor = (int) Math.floor(c);
        int cell = (int) Math.ceil(c);
        int round = (int) Math.round(c);
    System.out.printf("floor %d / %d = %d\n",a,b,floor);
    System.out.printf("ceil %d / %d = %d\n",a,b,cell);
    System.out.printf("round %d / %d = %d\n",a,b,round);
    }
}
