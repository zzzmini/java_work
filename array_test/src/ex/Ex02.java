package ex;

import java.util.Arrays;

public class Ex02 {
    static void main(String[] args) {
        int[] nums = {3, 29, 38, 12, 57, 74, 40, 85, 61};
        // 1. 최대값
        int intMax = Arrays.stream(nums).max().orElse(0);

        // 최대값의 색인 찾기
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (intMax == nums[i]) {
                maxIndex = i;
            }
        }
        System.out.println("최댓값 : " + intMax + ", 인덱스 : " + maxIndex);
            // 2. 최솟값
//        int intMin = Arrays.stream(nums).min().orElse(0);
            // 최솟값을 구할 때는 정수변수 일 때 정수의 가장큰값을 할당
            int intMin = Integer.MAX_VALUE;

        int minIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < intMin) {
                intMin = nums[i];
                minIndex = i;
            }
        }
        System.out.println("최소값 : " + intMin + ", 인덱스 : " + minIndex);
    }
}
