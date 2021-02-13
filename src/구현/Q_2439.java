package 구현;

import java.util.Scanner;

public class Q_2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++){
            if(i != 1 )System.out.println();
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int z = 0; z < i; z++){
                System.out.print("*");
            }
        }
    }
}
