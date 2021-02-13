package 구현;

import java.util.Scanner;

public class Q_10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            ar[i] = a+b;
        }
        for (int x : ar){
            System.out.println(x);
        }
    }
}
