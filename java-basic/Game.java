import java.util.Random;
import java.util.Scanner;
/**
 * 가위바위보에서 Random(3)+1 을 사용하면 1 ~ 3까지 나옵니다. 컴퓨터가 만든 값이 1이면 가위를 낸 것이고 2이면 바위를 낸
 * 것이고 3이면 보를 낸 것으로 할 때, 사용자측이 가위, 바위, 보를 냈을 때 승패를 결정하는 프로그램을 작성하시오
 */
class Game{
    public static void main(String[] args) {

        Random ran = new Random();
        int dice = 0;
        dice = ran.nextInt(3)+1;
      //  System.out.println(String.format("컴퓨터가 낸 %s",dice));
        String cum = "";
        
        if(dice == 1){
           cum = "가위";
            //System.out.println(cum);
        }else if(dice == 2){
            cum = "바위";
            //System.out.println(cum);
        }else{
            cum = "보";
            //System.out.println(cum);
        }
        Scanner scan = new Scanner(System.in);
        String user = scan.next();

        if(user.equals("가위")){
            if(cum.equals("가위")){
                System.out.println("비겼습니다.");

            }else if (cum.equals("바위")){
                System.out.println("졌습니다.");
            }else{
                System.out.println("이겼습니다.");
            }
            
        }else if(user.equals("바위")){
            if(cum.equals("가위" )){
                System.out.println("이겼습니다.");

            }else if(cum.equals("바위")){
                System.out.println("비겼습니다.");
            }else {
                System.out.println("졌습니다.");
            }

        }else if(user.equals("보")){
            if(cum.equals("가위")){
                System.out.println("졌습니다.");

            }else if (cum.equals("바위")){
                System.out.println("이겼습니다.");
            }else{
                System.out.println("비겼습니다.");
            }
        }else{
            System.out.println("잘못된 값입니다.");
        }

       System.out.println(cum);
    }
}