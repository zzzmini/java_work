package calc;

import java.util.Scanner;

public class Calculator {


    // 계산기 프로그램이에요
    public void info() {
        System.out.println("계산기에요~~~");
    }
    // 000의 계산기에요... 출력
    public void printName(String name) {
        System.out.println(name + "의 계산기");
    }

    // 이름과 나이를 받아서 출력하는 메서드
    public void printNameAndAge(String name, int age) {
        System.out.println(name + " : " + age + "세");
    }

    // 사직연산을 수행하는 메서드를 생성
    public int add(int x, int y) {
        return x + y;
    }

    // 실수 두개 받아서 합계구하는 메서드
    public double add(double x, double y) {
        return x + y;
    }

    // 빼기
    public int minus(int x, int y) {
        return x - y;
    }

    // 곱하기
    public int multiply(int x, int y) {
        return x * y;
    }

    // 나누기
    public double devide(int x, int y) {
        return (double) x / y;
    }
}
