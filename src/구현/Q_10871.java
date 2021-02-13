package 구현;

import java.util.Scanner;

public class Q_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   // 정수 갯수
        int X = sc.nextInt();   // 기준점 정수

        int ar[] = new int[N];

        for (int i = 0; i <N; i++){
            ar[i] = sc.nextInt();
        }
        sc.close();
        for(int i = 0; i<ar.length; i++){
            if(ar[i] < X) System.out.print(ar[i] + " ");
        }

    }
}
