import java.util.Scanner;

// 두 수를 a와 b에 입력 받은 후,
// 두 수를 출력하고
// 두 수를 바꾸어
// 다시 출력하시오.
// 첫번째 수 입력 : 3
// 두번째 수 입력 : 4
public class Ex02 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("두 수를 입력받아 큰 수를 출력합니다.");
        System.out.println("첫 번째 수를 입력하세요.");
        int a = scanner.nextInt();

        System.out.println("두 번째 수를 입력하세요.");
        int b = scanner.nextInt();
        // 두 수 출력
        System.out.println("a = " + a + ", b = " + b);
        // 두 수를 바꾸기
        int temp = a;
        a = b;
        b = temp;
        // 변경 후에 출력하기
        System.out.println("두 수를 변경했어요");
        System.out.println("a = " + a + ", b = " + b);
    }
}
