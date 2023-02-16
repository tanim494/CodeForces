import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        int round = (int)n;
        float extra = n - round;
        if(extra > 0) {
            System.out.printf("float %d %3f", round, extra);
        } else {
            System.out.printf("int %d", round);
        }
    }
}
