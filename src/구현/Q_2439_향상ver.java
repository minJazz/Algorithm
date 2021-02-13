package 구현;

import java.util.Scanner;

public class Q_2439_향상ver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++){
            for (int j = 1; j <= n; j++) {
                if(j<=n-i) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
    }
}
