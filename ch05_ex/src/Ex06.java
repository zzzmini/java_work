import java.util.Scanner;

// 주사위 3개 입력(중복가능)
// 1. 세 눈이 모두 같으면: 10,000 + 같은 눈 × 1,000원
// 2. 두 눈이 같으면: 1,000 + 같은 눈 × 100원
// 3. 모두 다르면: 가장 큰 눈 × 100원
public class Ex06 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("주사위 1 : ");
        int a = scanner.nextInt();
        System.out.println("주사위 2 : ");
        int b = scanner.nextInt();
        System.out.println("주사위 3 : ");
        int c = scanner.nextInt();
        // 상금을 계산해서 담을 변수
        int prize = 0;
        // 비교 : 세 눈이 모두 같은지
        if (a == b && b == c) {
            prize = 10000 + (a * 1000);
        } else if (a == b || b == c || a == c) {
            // 두 주사위 눈이 같은 경우 -> 같은 눈 찾기
            if (a == b) {
                prize = 1000 + a * 100;
            } else if (b == c) {
                prize = 1000 + b * 100;
            } else {
                prize = 1000 + c * 100;
            }
        } else {
            // 세개의 눈이 모두 다른 경우 -> 가장 큰 눈을 찾아야 함.
            // 가장 큰 눈 × 100원
            int max = a;
            if (max < b) max = b;
            if (max < c) max = c;
            prize = max * 100;
        }
        System.out.println("상금 : " + prize + "원");
    }
}
