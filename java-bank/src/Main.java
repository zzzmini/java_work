import bank.Bank;

public class Main {
    static void main(String[] args) {
        System.out.println("===== 자바은행 =====");
        // 운영에 필요한 변수 선언하기
        int number; // 고객번호
        String name; // 고객이름
        int age; // 고객나이
        boolean isVip; // VIP 여부
        String grade; // 등급
        int money; // 잔액
        int pay; // 급여


        //  Step 3. 첫손님 등장
        // 이름 "홍길동", 나이 25, VIP 여부 false, 등급 'B', 잔액 0, 월급 0
        // 오늘 고객 수 1 증가 시키기
        Bank.guestCount++;
        // 홍길동 정보 생성하기
        number = Bank.guestCount;
        name = "홍길동";
        age = 25;
        isVip = false;
        grade = "B";
        money = 0;
        pay = 0;
        // 고객정보 출력하기
        System.out.println("고객번호: " + number + "/ 이름: " + name + "/ 나이: " + age + "/ 등급: " + grade);

        // STEP 4. 번호표 뽑기
        // 현재번호 : 100, 현재 고객이 뽑으면 1 증가.
        // 고객 번호표와 다음 대기 번호
        // 고객 번호표 변수 생성하기
        // 출력 : 내 번호표: 100, 다음 대기 번호: 101
        // 현재 번호표
        int ticketNumber = 100;
        int nextTicketNumber = ticketNumber + 1;
        System.out.println("출력 : 내 번호표: " + ticketNumber + ", 다음 대기 번호: " + nextTicketNumber);
        // 안내: 1번 창구로 오세요(짝수 : 1, 홀수 : 2)
        // 삼항연산으로 안내 문구를 생성
        String desk = (ticketNumber % 2) ==0 ? "1번 창구로 오세요" : "2번 창구로 오세요";
        System.out.println("안내 : " + desk);

        // STEP 5. 입금과 출금
        // 50,000원을 입금하세요.
        // 12,500원을 출금하세요. 수수료는 **VIP면 0원, 아니면 은행 수수료**입니다.
        // 출금액과 수수료를 함께 잔액에서 빼세요.
        // 거래가 일어날 때마다 거래 건수를 1 늘리세요.
        // 입금 후 잔액: 50000
        money = money + 50000;
        System.out.println("입금 후 잔액: " + money);
        // 거래 후 거래 건수 늘리기
        Bank.workCount++;

        // 12,500 출금하기(출금금액 저장)
        int outMoney = 12500;
        // 수수료 확인하기, 수수료는 fee 변수에 담기
        int fee = isVip ? 0 : Bank.FEE;
        // 출금 수수료: 500
        System.out.println("출금 수수료: " + fee);

        // 출금 후 잔액: 37000
        // money = money - outMoney - fee
        // money = 50000 - 12500 - 500
        money = money - outMoney - fee;
        System.out.println("출금 후 잔액: " + money);
        // 거래 후 거래 건수 늘리기
        Bank.workCount++;

        // STEP 6. 이자 지급
        // 현재 잔액에 이자율을 곱해서 이자를 계산
        // 원 단위 미만은 버리고 정수, 잔액 + 이자(이것도 거래건수 증가)
        // 이자 저장 변수 생성(double)
        double bonus = money * Bank.BONUS_RATE;
        // 원단위 이하 버림 -> 실수를 정수로 변환 --> 형변환
        // 최종 이자금액을 저장할 변수 생성
        int bonusMoney = (int)bonus;
        // 이자: 1110
        System.out.println("이자: " + bonusMoney);

        // 이자를 원금에 더한다.
        money = money + bonusMoney;
        // 이자 지급 후 잔액: 38110
        System.out.println("이자 지급 후 잔액: " + money);
        // 거래 건수 증가
        Bank.workCount++;

        // STEP 7. 대출 상담
        // 대출 가능: 나이가 19세 이상이고 잔액이 30,000원 이상
        // 대출 가능: true
        // 조건을 먼저 만들고 결과를 저장
        boolean loanOk = (age >= 19) && (money >= 3000);
        System.out.println("대출 가능: " + loanOk);
        // 우대 대상: 월급이 0이 아니고,
        // 잔액이 월급의 2배 이상 : 잔액을 월급으로 나눈 몫이 2보다 크거나 같으면.
        // 우대 대상: false
        boolean isSpecial = (pay != 0) && (money / pay >= 2);
        System.out.println("우대 대상: " + isSpecial);

        // STEP 8. 현금 인출기
        //현재 잔액을 만원권, 천원권, 백원 동전으로 몇 개씩 줄 수 있는지 계산하고,
        // 남은 금액도 출력하세요.
        // 만원권 3장, 천원권 8장, 백원 1개, 남은 금액 10원
        // 현재 잔액 : 38110 -> money
        // 1. 만원권, 잔액
        // 38110 / 10000 -> 몫 3, 나머지 8110
        int count_10000 = money / 10000; // 몫
        money = money % 10000;
        // 2. 천원권, 잔액
        int count_1000 = money / 1000; // 몫
        money = money % 1000;
        // 3. 백원, 잔액
        int count_100 = money / 100; // 몫
        money = money % 100;
        // 출력 결과 만들기
        String result = "만원권 " + count_10000 + "장, ";
        result = result + "천원권 " + count_1000 + "장, ";
        result = result + "백원 " + count_100 + "개, ";
        result = result + "남은 금액 : " + money + "원";
        System.out.println(result);

        // STEP 9. 두 번째 손님
        // 두 번째 고객이 왔습니다.
        // 고객 수를 늘린 다음 오늘의 총 고객 수와 거래 건수를 출력하세요.
        Bank.guestCount++;
        // 오늘의 총 고객 수: 2명, 거래 건수: 3건
        String output = "오늘의 총 고객 수: ";
        output = output + Bank.guestCount + "명, ";
        output = output + "거래 건수 : " + Bank.workCount + "건";
        System.out.println(output);
    }
}
