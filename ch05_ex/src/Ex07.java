import java.util.Scanner;

public class Ex07 {
    static void main(String[] args) {
        // 1. 금액 추가 2. 음료선택 3. 잔액출력 4. 잔돈반환(종료)
        // 메뉴: 1.커피(1500원) 2.주스(1000원) 3.물(500원) 4.종료
        // 초기 잔액: 0원
        // 1번 선택 시: 투입 금액 입력 → 잔액에 추가
        // 2번 선택 시: 메뉴 출력 후 음료 선택 후 잔액 차감 (잔액 부족 시 안내)
        // 3번 선택 시: 현재 잔액 출력
        // 4번 선택 시: 잔돈 반환 후 종료
        Scanner scanner = new Scanner(System.in);
        // 투입 금액 관리 변수
        int money = 0;

        // 무한 반복
        while (true) {
            // 메인 메뉴 출력하기
            System.out.println("=====================================");
            System.out.println("1. 금액 추가 2. 음료선택 3. 잔액출력 4. 잔돈반환(종료)");
            System.out.println("=====================================");
            System.out.println("메뉴 번호를 선택하세요.");
            int menu = scanner.nextInt();

            // 메뉴에 따른 실행을 swtich - case로 먼저 윤곽을 잡는다.
            switch (menu) {
                case 1:
                    System.out.println("금액을 입력하세요.");
                    money = money + scanner.nextInt();
                    System.out.println("현재 잔액은 : " + money + "원입니다.");
                    break;
                case 2:
                    // 메뉴 표시를 종료할 수 있는 상태변수를 선언
                    boolean status = true;
                    while (status) {
                        // 1. 음료 메뉴가 나온다.
                        System.out.println("메뉴: 1.커피(1500원) 2.주스(1000원) 3.물(500원) 4.종료");
                        // 2. 음료 중 1개를 선택한다.
                        System.out.println("번호를 입력하세요.(1~4) : ");
                        int choice = scanner.nextInt();
                        switch (choice) {
                            case 1:
                                // 잔액과 음료 가격을 비교
                                if (money >= 1500) {
                                    // 잔돈 넉넉
                                    // 1. 음료 출력
                                    System.out.println("커피가 나왔습니다.");
                                    // 2. 잔액 - 음료수
                                    money = money - 1500;
                                    System.out.println("현재 잔액은 : " + money + "원입니다.");
                                } else {
                                    // 모자란 경우
                                    System.out.println("금액이 부족합니다. 다시 선택해 주세요.");
                                }
                                break;
                            case 2:
                                // 잔액과 음료 가격을 비교
                                if (money >= 1000) {
                                    // 잔돈 넉넉
                                    // 1. 음료 출력
                                    System.out.println("주스가 나왔습니다.");
                                    // 2. 잔액 - 음료수
                                    money = money - 1000;
                                    System.out.println("현재 잔액은 : " + money + "원입니다.");
                                } else {
                                    // 모자란 경우
                                    System.out.println("금액이 부족합니다. 다시 선택해 주세요.");
                                }
                                break;
                            case 3:
                                // 잔액과 음료 가격을 비교
                                if (money >= 500) {
                                    // 잔돈 넉넉
                                    // 1. 음료 출력
                                    System.out.println("물이 나왔습니다.");
                                    // 2. 잔액 - 음료수
                                    money = money - 500;
                                    System.out.println("현재 잔액은 : " + money + "원입니다.");
                                } else {
                                    // 모자란 경우
                                    System.out.println("금액이 부족합니다. 다시 선택해 주세요.");
                                }
                                break;
                            case 4:
                                System.out.println("음료 선택을 종료합니다.");
                                // 상태 값을 false로 변경한다.
                                status = false;
                                break;
                            // 2-1. 음료가격과 잔돈을 비교(음료 내주고 잔액- , 돈 모자름 출력)
                            default:
                                // 3. 잘 못 선택한 경우 처리
                                System.out.println("다시 선택하세요.");
                                break;
                        }
                    }

                case 3:
                    System.out.println("현재 잔액은 : " + money + "원입니다.");
                    break;
                case 4:
                    System.out.println("잔돈 반환 : " + money);
                    money = 0;
                    return;
                default:
                    System.out.println("다시 선택해 주세요.");
            }
        }
    }
}
