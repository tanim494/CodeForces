import java.util.Scanner;
public class codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        float c = (float) a / b;
        float extra = c - (int)c;
        int floor = (int)c, cell = (int)c, round = (int)c;
        if(extra >= 0.5) {
            round += 1;
        }
        if(extra >= 0.1){
            cell += 1;
        }
    System.out.printf("floor %d / %d = %d\n",a,b,floor);
    System.out.printf("ceil %d / %d = %d\n",a,b,cell);
    System.out.printf("round %d / %d = %d\n",a,b,round);
    }
}
