package Programmers;

import java.util.Arrays;

public class Lv1_비밀지도 {

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            StringBuffer sb = new StringBuffer();
            int first = arr1[i];
            int second = arr2[i];
            for (int j = 0; j < n; j++) {
                if (first % 2 == 1 || second % 2 == 1) {
                    sb.insert(0, '#');
                } else {
                    sb.insert(0, ' ');
                }
                first /= 2;
                second /= 2;
            }
            answer[i] = sb.toString();
        }

        return answer;
    }

    public static void main(String[] args) {
        Lv1_비밀지도 pm = new Lv1_비밀지도();
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        System.out.println(Arrays.toString(pm.solution(n, arr1, arr2)));
    }

}