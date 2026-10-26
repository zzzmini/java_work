public class StarPrint {
    static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            String star = "";
            for (int j = 1; j <= i; j++) {
                star = star + "*";
            }
            System.out.println(star);
        }
    }
}
