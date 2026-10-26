package check;

public class RandomNumber {
    static void main(String[] args) {
        // 일반 수학관련 함수는 Math 클래스에 있음.
        // 0.0 이상 1.0 미만 더블값(0.0 ~ 0.9999)
        double x = Math.random();
        System.out.println(x);
        // 주사위 값 생성(1~6)
        int dice = (int)(Math.random()*6)+1;
        System.out.println(dice);
    }
}
