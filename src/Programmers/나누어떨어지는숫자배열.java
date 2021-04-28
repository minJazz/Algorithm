package Programmers;
import java.util.*;
public class 나누어떨어지는숫자배열 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        answer = new int[list.size()];
        if (list.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
        }
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }


        int temp = 0;

        for (int i = answer.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (answer[j] > answer[j + 1]) {
                    temp = answer[j];
                    answer[j] = answer[j + 1];
                    answer[j + 1] = temp;
                }
            }
        }

        return answer;
    }
}