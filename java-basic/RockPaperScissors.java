import java.util.Scanner;

class RockPaperScissors {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("가위바위보 게임");
        System.out.println("1.가위 , 2.바위 , 3.보");
        // 컴퓨터가 바위를 냈다.
        int op = 0;
        op = scanner.nextInt();
        if (op == 1) {
            System.out.println("졌습니다.ㅠ_ㅠ");
        } else if (op == 2) {
            System.out.println("비겼습니다..........");
        } else if (op == 3) {
            System.out.println("이겼습니다.^_^");
        } else {
            System.out.println("!!다시 입력해주세요!!");
        }
    }
}