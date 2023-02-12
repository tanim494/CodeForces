import java.util.Scanner;

class codeforce {
        public static void main(String [] args) {
            Scanner sc = new Scanner(System.in);
            int a = 0, b = 0, c = 0;
            int sum = 0;
            int solves = 0;
            int n = sc.nextInt();         // test time
            for(int i=0;i<n;i++) {
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();
                sum = a+b+c;
                if(sum>1){
                    solves++;
                }
            }
            System.out.println(solves);
        }
}

