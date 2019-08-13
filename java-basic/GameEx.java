
/**
 * 가위바위보에서 Random(3)+1 을 사용하면 1 ~ 3까지 나옵니다. 컴퓨터가 만든 값이 1이면 가위를 낸 것이고 2이면 바위를 낸
 * 것이고 3이면 보를 낸 것으로 할 때, 사용자측이 가위, 바위, 보를 냈을 때 승패를 결정하는 프로그램을 작성하시오
 */
import java.util.Random;
import java.util.Scanner;

class GameEx {
    public static void main(String[] agrs) {
        Random ran = new Random();
        int num = ran.nextInt(3) + 1;
        String ai = "";
        String gawee = "가위";
        String bawee = "바위";
        String bo = "보";

        if (num == 1) {
            ai = gawee;
        } else if (num == 2) {
            ai = bawee;
        } else {
            ai = bo;
        }
        System.out.println("가위 바위 보!!!!");
        Scanner scan = new Scanner(System.in);
        String user = scan.next();
        if (user.equals(ai)) {
            System.out.println("비겼습니다");
        } else if (user.equals(gawee)) {
            if (ai.equals(bawee)) {
                System.out.println("졌습니다.");
            } else {
                System.out.println("이겼습니다.");
            }
        } else if (user.equals(bawee)) {
            if (ai.equals(gawee)) {
                System.out.println("이겼습니다.");
            } else {
                System.out.println("졌습니다.");
            }
        } else if (user.equals(bo)) {
            if (ai.equals(gawee)) {
                System.out.println("졌습니다.");
            } else {
                System.out.println("이겼습니다.");
            }
        } else {
            System.out.println("입력오류!!");
        }
        System.out.println(ai);
    }
}