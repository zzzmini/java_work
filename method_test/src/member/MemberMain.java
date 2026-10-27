package member;

import java.util.Scanner;

public class MemberMain {
    static void main(String[] args) {
        // 1. Info 클래스를 new로 생성한다.
        Info info = new Info();
        // 2. 필요한 메서드를 호출한다.
        String result = info.memberInfo("안유진");
        System.out.println(result);

        result = info.memberInfo("안유진", 20);
        System.out.println(result);

        result = info.memberInfo("안유진", 25, 173.2);
        System.out.println(result);
    }
}
