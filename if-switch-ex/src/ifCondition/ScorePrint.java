package ifCondition;

import java.util.Scanner;

public class ScorePrint {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 성적을 입력받는다.
        System.out.println("성적입력(0~100)");
        int score = scanner.nextInt();
        // 비교(수, 우, 미, 양, 가)
        // 결과 담을 변수 선언
        String result;
        if (score >= 90) {
            result = "수";
        } else if (score >= 80) {
            result = "우";
        } else if (score >= 70) {
            result = "미";
        } else if (score >= 60) {
            result = "양";
        } else {
            result = "가";
        }
        System.out.println(result);
    }
}
