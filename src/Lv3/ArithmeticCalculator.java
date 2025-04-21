package Lv3;

import java.util.Queue;
import java.util.ArrayDeque;
import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticCalculator<T extends Number> {
    private Queue<Double> resultList = new ArrayDeque<>();

    public double calculator(T num1, T num2, OperatorType operator) {
        double a = num1.doubleValue();
        double b = num2.doubleValue();
        double result;

        switch (operator) {
            case ADD -> result = a + b;
            case SUBTRACT -> result = a - b;
            case MULTIPLY -> result = a * b;
            case DIVIDE -> {
                if (b == 0) throw new ArithmeticException("0으로 나눌 수 없습니다!");
                result = a / b;
            }
            default -> throw new IllegalArgumentException("지원하지 않는 연산자입니다.");
        }

        resultList.add(result);
        return result;
    }

    public Queue<Double> getResultList() {
        return resultList;
    }

    public Double removeResult() {
        if (!resultList.isEmpty()) {
            return resultList.poll();
        } else {
            System.out.println("저장된 결과가 없습니다.");
            return null;
        }
    }

    public List<Double> getResultsGreaterThan(double threshold) {
        return resultList.stream()
                .filter(r -> r > threshold)
                .collect(Collectors.toList());
    }
}
