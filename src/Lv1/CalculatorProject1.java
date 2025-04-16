package Lv1;
import java.util.Scanner;

public class CalculatorProject1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while(true) {
            System.out.println("명령어를 입력해주세요 :");
            String input = scanner.next();
            if (input.equals("go")) {
                System.out.println("프로그램을 시작합니다.");
            }else if (input.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
            }else {
                System.out.println("알 수 없는 명령어입니다.");
                break;
            }

            System.out.println("첫 번째 정수를 입력해주세요 ! :");
            int num1 = scanner.nextInt();

            System.out.println("연산자를 입력해주세요 ! : (+,-,*,/)");
            char operator = scanner.next().charAt(0);


            System.out.println("두 번째 정수를 입력해주세요 ! :");
            int num2 = scanner.nextInt();

            int result = 0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("나눗셈 연산에서 분모(두번 째 정수)에 0이 입력될 수 없습니다!");
                    }

                default:

                    System.out.println("올바른 연산자가 아닙니다 ! ");
                    return;
            }
            System.out.println("결과입니다 ! : " + result);
            System.out.println("더 계산하시겠습니까? (exit를 입력 시 종료되며 다른 키 입력 시 실행됩니다.)");
        }

    }
}
