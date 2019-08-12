import java.util.Scanner;

class PlusEx {
    public static void main(String[] args) {

        System.out.println("첫번째 숫자 입력");
        Scanner scanner = new Scanner(System.in);
        int a, b, c = 0;
        String op = "" ;
        a = scanner.nextInt();

        System.out.println("두번째 숫자 입력");

        b = scanner.nextInt();

        System.out.println("연산 종류를 선택하세요 + , - , * , / ");

        op = scanner.next();

        // statements.
        // if(컨디션){익스프레션}else if(컨디션){익스프레션}else{익스프레션}
        // if(컨디션){스테이먼트} -> 익스프레션이 두개이상이라 스테이먼트 블럭이라 부른다.
        // if(op == 1){} -> 숫자일때 == 
        // if(op.equals("")){ } -> 문자일때

        if (op.equals("+")) { // == 는 int 만 같은 값을 표시한다. 
            c = a + b;
            System.out.println(String.format("%d + %d = %d", a, b, c));
        }else if(op.equals("-")) {
            c = a - b;
            System.out.println(String.format("%d - %d = %d", a, b, c));
        } else if (op.equals("*")) {
            c = a * b;
            System.out.println(String.format("%d * %d = %d", a, b, c));
        } else if (op.equals("/")) {
            c = a / b;
            System.out.println(String.format("%d / %d = %d", a, b, c));
        } else {
            System.out.println("잘못된 연산입니다.");
        }

    }
}