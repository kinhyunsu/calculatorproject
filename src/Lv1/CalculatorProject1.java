package Lv1;
import java.util.Scanner;

public class CalculatorProject1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 정수를 입력해주세요 ! :");
        int num1 = scanner.nextInt();

        System.out.println("연산자를 입력해주세요 ! : (+,-,*,/)");
        char operator = scanner.next().charAt(0);


        System.out.println("두 번째 정수를 입력해주세요 ! :");
        int num2 = scanner.nextInt();

        int result = 0;

        switch (operator){
            case '+' :
                result = num1 + num2;
                break;
            case '-' :
                result = num1 - num2;
                break;
            case '*' :
                result = num1 * num2;
                break;
            case '/' :
                if (num2 !=0){
                    result = num1 / num2;
                } else {
                    System.out.println("0으로 나눌 수 없습니다!");
                }

            default:

                System.out.println("올바른 연산자가 아닙니다 ! ");
                return;
        }
        System.out.println("결과입니다 ! : " + result);

    }
}
