package vending;

public class VendingBefore {
    // 1. 한 줄(라인)을 긋는 기능을 생성
    public static void printLine() {
        System.out.println("=============================");
    }

    public static void printTitle() {
        printLine();
        System.out.println("  자판기 시작");
        printLine();
    }

    public static void output(int count, int money){
        printLine();
        System.out.println("총 " + count + "개 구매. 잔돈: " + money + "원");
        printLine();
    }


    public static void main(String[] args) {

        int money = 3000;
        int price = 1000;
        int count = 0;

        printTitle();

        while (money >= price) {
            money -= price;
            count++;
            System.out.println(count + "번째 구매. 잔액: " + money + "원");
        }

        output(count, money);
    }
}
