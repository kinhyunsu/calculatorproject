package Lv2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("명령어를 입력해주세요 !(go, exit) :");
        while(true){
            try{
                String input = scanner.next();
                if (input.equals("go")){
                    System.out.println("시스템을 시작합니다.");
                }else if (input.equals("exit")){
                    System.out.println("시스템을 종료합니다.");
                    break;
                }else{
                    System.out.println("알 수 없는 명령어입니다.");
                    break;
                }
                System.out.println("첫 번째 수를 입력해주십쇼 ! :");
                int num1 = scanner.nextInt();
                if(num1 < 0){
                    System.out.println("음수는 입력할 수 없습니다!");
                    continue;
                }
                System.out.println("사칙연산 기호를 입력해주십쇼 ! :");
                char operator = scanner.next().charAt(0);

                System.out.println("두 번째 수를 입력해주십쇼! : ");
                int num2 = scanner.nextInt();
                if(num2 < 0){
                    System.out.println("두 번째 수도 음수 입력은 불가합니다 ! ");
                    continue;
                }
                int result = calculator.calculator(num1, num2, operator);
                System.out.println("결과입니다 ! : " + result);
            }catch (InputMismatchException e){
                System.out.println("숫자만 입력가능합니다!");
                scanner.nextLine();
            }catch (ArithmeticException e){
                System.out.println("계산 중 오류 발생 : " + e.getMessage());
            }
            System.out.println("명령어를 입력해주세요 !(go, exit) :");
        }

    }
}