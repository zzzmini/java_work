package ex;

import java.util.Arrays;

public class Ex03 {
    static void main(String[] args) {
        // 주사위 2개 던져서 얻은 합의 확률-36,000번
        final int   TOTAL_COUNT = 36000;  // 상수
        // 주사위 합을 저장할 배열(2 ~ 12) : 11개
        // 합 2 -> 색인 0, 합 9 -> 색인 7....
        int[] count = new int[11];
        // 36000번 반복하면서 주사위 생성 후 누적
        for (int i = 1; i <= TOTAL_COUNT; i++) {
            // 1~6 사이의 난수 2개를 생성
            int diceOne = (int)(Math.random()*6) + 1;
            int diceTwo = (int)(Math.random()*6) + 1;
            // 합에 따른 누적할 배열의 색인값을 구한다.
            int location = diceOne + diceTwo - 2;
            count[location]  = count[location] + 1;
        }
        // 결과 배열 출력
        //System.out.println(Arrays.toString(count));
        // 결과 출력
        // 2  : 1026 (0.028500)
        for (int i=0; i < count.length; i++) {
            System.out.printf((i+2) + " : ");
            System.out.println(count[i]  + "(" + (double)count[i] / TOTAL_COUNT + ")");
        }
    }
}
