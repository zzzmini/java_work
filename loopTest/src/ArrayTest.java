public class ArrayTest {
    static void main(String[] args) {
        // 배열 변수 선언하기, 배열이름을 복수형
        int[] scores = {75, 80, 50, 35};
        // 3번째 값 출력 : 50
        System.out.println("3번째 배열 내용 : " + scores[2]);
        // 2번째 배열의 값을 0 으로 변경 후에 출력
        scores[1] = 0;
        System.out.println("2번째 배열 내용 : " + scores[1]);
        // 전체 배열 내용 순회하면서 출력
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        // 문자 배열 만들기
        String[] members = {"장원영", "안유진", "가을"};
        // 배열의 인덱스와 값을 같이 처리할 때
        for (int i = 0; i < members.length; i++) {
            if (i < members.length - 1) {
                System.out.printf(members[i] + ", ");
            } else {
                System.out.printf(members[i]);
            }
        }
        // Advanced-For(향상된 for 구문)
        // 배열 안의 요소들만 필요할 때
        for(String name : members){
            System.out.println(name);
        }

//        System.out.println(members[3]);  Out of Bound Exception(배열의 범위를 벗어난 색인 요청할 때)
    }
}
