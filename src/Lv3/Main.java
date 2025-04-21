package Lv3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArithmeticCalculator<Double> calculator = new ArithmeticCalculator<>();

        System.out.println("명령어를 입력해주세요 (go, exit, delete, list, filter):");

        while (true) {
            try {
                String input = scanner.next();

                switch (input) {
                    case "go" -> System.out.println("시스템을 시작합니다.");
                    case "exit" -> {
                        System.out.println("시스템을 종료합니다.");
                        return;
                    }
                    case "list" -> {
                        System.out.println("현재 저장된 결과 리스트:");
                        System.out.println(calculator.getResultList());
                        continue;
                    }
                    case "delete" -> {
                        Double removed = calculator.removeResult();
                        System.out.println("삭제된 결과값 : " + removed);
                        continue;
                    }
                    case "filter" -> {
                        System.out.println("기준값을 입력해주세요:");
                        double threshold = scanner.nextDouble();
                        System.out.println("해당 값보다 큰 결과들:");
                        System.out.println(calculator.getResultsGreaterThan(threshold));
                        continue;
                    }
                    default -> {
                        System.out.println("알 수 없는 명령어입니다.");
                        continue;
                    }
                }

                System.out.print("첫 번째 수를 입력해주세요: ");
                double num1 = scanner.nextDouble();
                if (num1 < 0) {
                    System.out.println("음수는 입력할 수 없습니다.");
                    continue;
                }

                System.out.print("사칙연산 기호를 입력해주세요 (+ - * /): ");
                char operatorChar = scanner.next().charAt(0);
                OperatorType operator = OperatorType.fromChar(operatorChar);

                System.out.print("두 번째 수를 입력해주세요: ");
                double num2 = scanner.nextDouble();
                if (num2 < 0) {
                    System.out.println("음수는 입력할 수 없습니다.");
                    continue;
                }

                double result = calculator.calculator(num1, num2, operator);
                System.out.println("결과입니다! : " + result);

            } catch (InputMismatchException e) {
                System.out.println("입력 형식이 잘못되었습니다. 숫자를 입력해주세요.");
                scanner.nextLine();
            } catch (ArithmeticException | IllegalArgumentException e) {
                System.out.println("오류 발생: " + e.getMessage());
            }

            System.out.println("명령어를 입력해주세요 (go, exit, delete, list, filter):");
        }
    }
}
