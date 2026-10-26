package ifCondition;

import java.util.Scanner;

public class IfTest01 {
    static void main(String[] args) {
        // 나이를 입력받아서 20세 이상이면, 성인,
        // 그렇지 않으면 미성년을 출력하도록...
        // 1. 스캐너 생성
        Scanner scanner = new Scanner(System.in);
        // 2. 나이를 저장할 변수 선언
        int age;
        // 3. 스캐너로 나이 입력 받기
        System.out.println("나이 입력 :");
        age = scanner.nextInt();
        // 4. 비교하기
        if (age >= 20) {
            System.out.println("성인");
        } else {
            System.out.println("미성년");
        }
        System.out.println("처리 끝");
    }
}
