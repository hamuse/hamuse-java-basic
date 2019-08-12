import java.util.Scanner;
import java.util.Random;

class Dice {
    public static void main(String[] args) {
        /**
         * 주사위를 던져서 홀수 인지 짝수인지 맞추는 게임입니다. 일단 컴퓨터가 던져서 얻은 값은 3입니다. 사용자는 입력을 홀수 인거 같으면 "홀"
         * 을 선택 아니면 "짝 " 선택을 한다고 할때 결과를 출력하세요
         * 
         */

        Scanner scanner = new Scanner(System.in);
        Random ran = new Random();

        System.out.println("홀 짝을 입력하세요.");
        int dice = 0;
        dice = ran.nextInt(6) + 1;
        System.out.println(String.format("랜덤으로 나온수 %d", dice));

        String dap = "";
        if (dice % 2 == 0) {
            dap = "짝";
        } else {
            dap = "홀";
        }
        System.out.println("주사위 값을 예측한 홀, 짝 입력");
        String answer = "";
        answer = scanner.next();
        if (answer.equals(dap)) {

            System.out.println("정답^_^");

        } else if (!answer.equals(dap)) { //앞에 ! 하면 같지 않으면으로 쓰임 .

            System.out.println("땡!!!!!!!!!!!!!!!!!");
        } else {

            System.out.println("다시 입력해주세요.");
        }

    }
}