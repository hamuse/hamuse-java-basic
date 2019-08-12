import java.util.Scanner;

class Plus {
    public static void main(String[] args) {
        System.out.println("첫번째 수 입력");
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        a = scanner.nextInt();
        System.out.println("두번째 수 입력");
        int b = 0;
        b = scanner.nextInt();
        int c = a + b;

        System.out.println(String.format("%d + %d = %d", a, b, c));

    }
}