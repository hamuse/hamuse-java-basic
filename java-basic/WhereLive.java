import java.util.Scanner;

class WhereLive {
    public static void main(String[] args) {
        System.out.println("어디에 살아요??");
        Scanner scanner = new Scanner(System.in);
        String where = "";
        where = scanner.next();
        System.out.println(String.format("%s에 삽니다.",where));

    }

}