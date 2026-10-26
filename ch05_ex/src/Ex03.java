import java.util.Scanner;

// 점수 입력받아서 A ~ F까지 출력
public class Ex03 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력하면 등급을 알려드려요");
        System.out.println("점수 입력(0 ~ 100) : ");
        int score = scanner.nextInt();
        //등급 저장용 변수
        String grade = "";
        // 1. if 함수로 구현
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("if로 구한 등급 : " + grade);
        // 2. switch로 구현
        // 방식 : 점수를 10으로 나눈 몫을 취한 후에 그 값을 기준으로 분류한다.
        int value = score / 10;
        switch (value) {
            case 10 :
                grade = "A";
                break;
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            default:
                grade = "F";
        }
        System.out.println("switch 로 구한 등급 : " + grade);

        // switch 가 jdk 14 버전이후에 문법 변경(기존 것은 유효)
        // 1. 버전 업이 되도 기존 문법을 유지하는 경우
        // 2. 버전 업 될 때 Deprecated 되는 경우 있음. -> 대체제를 찾아 해결
        switch (value) {
            case 10 -> {grade = "A";}
            case 9 -> {grade = "A";}
            case 8 -> {grade = "B";}
            case 7 -> {grade = "C";}
            case 6 -> {grade = "D";}
            default -> {grade = "F";}
        }
        System.out.println("switch 새 문법으로 구한 등급 : " + grade);
    }
}
