package calc;

import java.util.Scanner;

public class CalcMain {
    static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2);
        System.out.println(result);
        // 계산기 정보 출력
        calculator.info();
        // 박보검의 계산기 출력하기
        calculator.printName("박보검");

        // 이름과 나이를 전달하면, 박보검 : 20세
        // 위와 같이 출력되도록...
        // 메서드의 이름은 printNameAndAge
        // printNameAndAge 메서드를 호출
        calculator.printNameAndAge("박보검", 20);
        System.out.println("빼기 : " + calculator.minus(4,3));
        System.out.println("곱하기 : " + calculator.multiply(3, 4));
        System.out.println("나누기 : " + calculator.devide(7, 0) );

        // 실수 두개를 전달해서 덧셈
        // x = 3.1, y = 4.7 ==> 7.8
        // 실수 더하기 호출
        System.out.println(calculator.add(3.1, 4.7));

        Scanner sc = new Scanner(System.in);

    }
}
