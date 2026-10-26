public class WhileTest {
    static void main(String[] args) {
        int i = 1;  // 증분
        int sum = 0; // 누적용

        while (i <= 10) {
            sum = sum + i;
            i++;
        }
        System.out.println("sum = " + sum);

        int j = 1;
        sum = 0;
        do {
            sum = sum + j;
            j = j + 1;
        } while (j <= 10);
        System.out.println(sum);
    }
}
