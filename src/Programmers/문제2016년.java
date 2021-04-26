package Programmers;

class 문제2016년 {
    public String solution(int a, int b) {
        String answer = "";
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int totalDays = 0;

        for (int i = 0; i < a - 1; i++) {
            totalDays += month[i];
        }
        totalDays += b;
        System.out.println(totalDays % 7);
        switch (totalDays % 7) {
            case 0:
                answer = days[4];
                break;
            case 1:
                answer = days[5];
                break;
            case 2:
                answer = days[6];
                break;
            case 3:
                answer = days[0];
                break;
            case 4:
                answer = days[1];
                break;
            case 5:
                answer = days[2];
                break;
            case 6:
                answer = days[3];
                break;
            default:
                System.out.println("err");
                break;

        }


        return answer;
    }
}
