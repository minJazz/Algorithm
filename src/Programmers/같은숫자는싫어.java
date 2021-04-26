package Programmers;

import java.util.*;

public class 같은숫자는싫어 {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(i+1 == arr.length){
                list.add(arr[i]);
                break;
            }

            if(arr[i] != arr[i+1]){
                list.add(arr[i]);
            }
        }

        answer = new int[list.size()];

        for(int i = 0; i < list.size(); i ++){
            answer[i] = list.get(i);
        }


        return answer;
    }
}