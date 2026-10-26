package switchCondition;

import java.util.Scanner;

public class VendingSwitch {
    static void main(String[] args) {
        // 1. 스캐너 생성
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // 2. 화면에 메뉴 출력
            System.out.println("===================");
            System.out.println("메뉴번호를 선택하세요.");
            System.out.println("1. 커피(1,500원)");
            System.out.println("2. 주스(1,000원)");
            System.out.println("3. 물(500원)");
            System.out.println("4. 종료");
            System.out.println("===================");
            System.out.println("번호 입력 : ");
            // 3. 메뉴 번호 입력받기
            int menu = scanner.nextInt();
            // 4. 메뉴별로 처리하기
            switch (menu) {
                case 1:
                    System.out.println("커피 나옴");
                    break;
                case 2:
                    System.out.println("주스 나옴");
                    break;
                case 3:
                    System.out.println("물 나옴");
                    break;
                case 4:
                    System.out.println("종료합니다.");
                    return;
                default:
                    System.out.println("잘 못 선택했어요");
            }
        }
    }
}
