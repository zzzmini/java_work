public class VariableTest {
    // 변수의 종류는 정수, 실수, 문자열, 부울 타입
    // 정수 : int(20억), long(그 이상)
    //  실수 : double
    // 참거짓(부울타입) : boolean
    // 소문자로 시작하는 데이터 타입 : primitive type(원시타입)
    // 문자 : String
    static void main(String[] args) {
        int age = 23;
        int weight = 45;
        long myNumber = 1_000_000;
        double height = 171.5;
        boolean isDebut = true;
        String name = "안유진";
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("키 : " + height + "cm");
        System.out.println("데뷔 : " + isDebut);
        System.out.println("월급 : " + myNumber);
    }
}
