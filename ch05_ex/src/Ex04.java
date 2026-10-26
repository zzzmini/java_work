import java.util.Scanner;

// 시간과 분이 주어지면 45분 전 시간 구하는 문제
// 24시간제 기준
public class Ex04 {
    static void main(String[] args) {
        // 1. 시간 == 0 시간대이고, 분이 45 작으면 : 전날 23시, 분+15
        // 2. 분 < 45 : 시간--, 분+15
        // 3. 분 - 45
        Scanner scanner = new Scanner(System.in);
        System.out.println("시간과 분을 순서대로 입력받아 45분 전 시각을 알려드려요");
        int hour = scanner.nextInt();  // 시간
        int minute = scanner.nextInt(); // 분
        // 조건에 따른 계산하기
        if (hour == 0 && minute < 45) {
            // 1번 조건.
            hour = 23;
            minute = minute + 15;  // minute += 15;
        } else if (minute < 45) {
            // 2번 조건
            hour = hour - 1; // hour--;
            minute += 15;
        } else {
            // 3번 조건.
            minute = minute - 45;
        }
        // 출력
        System.out.println(hour + " " + minute);
    }
}
