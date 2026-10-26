package ifCondition;

import java.util.Scanner;

public class ScannerEx {
    static void main(String[] args) {
        // 스캐너를 구입
        Scanner sc = new Scanner(System.in);
        String name;
        // m : method - 기능을 수행, 함수(function)
        System.out.println("이름을 입력하세요");
        name = sc.next();
        System.out.println("입력한 이름은 : " + name);
        System.out.println("나이 입력(0 ~ 120) 정수만..");
        int age = sc.nextInt();
        System.out.println("입력한 나이는 : " + age);
        // 키를 입력받습니다. 단, 실수로 입력 받으세요.
        System.out.println("키를 입력하세요.");
        double height = sc.nextDouble();
        System.out.println("입력한 키는 : " + height);
    }
}
