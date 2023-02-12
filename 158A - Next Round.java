import java.util.Scanner;
public class codeforces {
    /*
    @author Ahsanul Karim Tanim
    @website tanim.codes
    @facebook fb.com/tanim494
    158A - Next Round 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k, scores[];
        n = sc.nextInt();
        k = sc.nextInt();
        scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        int count = 0;
        for (int j = 0; j < n; j++) {
            if (scores[j] >= scores[k-1] && scores[j] > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
