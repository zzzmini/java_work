package ex;

import java.util.Arrays;

public class Ex07 {
    static void main(String[] args) {
        // 순위 계산
        int[] scores = {85, 50, 90, 75, 85, 60, 89, 98, 83, 65};
        // 순위 결과 출력용 배열 선언 - 초기값 : 0
        int[] rank = new int[scores.length];
        // 등수 계산
        for (int i = 0; i < scores.length; i++) {
            rank[i] = 1;
            for (int j = 0; j < scores.length; j++) {
                if (scores[i] < scores[j]) {
                    rank[i]++;
                }
            }
        }
        // 결과 출력
        System.out.println(Arrays.toString(rank));
    }
}
