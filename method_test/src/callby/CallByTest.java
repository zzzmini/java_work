package callby;

import java.util.Arrays;

public class CallByTest {
    // n값을 전달받아서 10 증가하고 출력하는 메서드
    static void addTen(int x) {
        x = x + 10;
    }

    // 배열을 받아서 첫번째 값을 100으로 바꾸는 메서드
    static void setFirst(int[] arr) {
        // 첫째 값을 100
        arr[0] = 100;
    }

    static void main(String[] args) {
        int n = 10;
        // 변수를 전달할 때는 값만 보낸다.
        // Call By value
        addTen(n);
        System.out.println("n = " + n);

        // 배열을 하나 만들고 배열을 넘겨서 처리
        int[] scores = {10, 20, 30};
        // 원본 출력
        System.out.println(Arrays.toString(scores));
        // 메서드를 호출
        // Call By Reference (주소 보냄)
        setFirst(scores);
        // 원본 출력
        System.out.println(Arrays.toString(scores));
    }
}
