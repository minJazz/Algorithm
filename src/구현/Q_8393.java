package 구현;

import java.util.Scanner;

public class Q_8393 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        int total = 0;
        for (int i = 1; i <= n; i++){
            total+=i;
        }
        System.out.print(total);
    }
}
