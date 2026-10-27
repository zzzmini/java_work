package member;

public class Info {
    // 멤버 정보 출력하는 기능 클래스
    // 1. 이름 만 받는 경우
    public String memberInfo(String name){
        String info = "이름 : " + name;
        return info;
    }
    // 2. 이름과 나이를 받는 경우
    public String memberInfo(String name, int age){
        String info = "이름 : " + name + ", 나이 : " + age;
        return info;
    }

    // 3. 이름, 나이, 키를 받는 경우
    public String memberInfo(String name, int age, double height){
        String info = "이름 : " + name + ", 나이 : " + age + ", 키 : " + height;
        return info;
    }
}
