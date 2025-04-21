package Lv2;

import java.util.Queue;
import java.util.ArrayDeque;



public class Calculator {
    private Queue<Integer> resultList = new ArrayDeque<>();

    public int calculator(int num1, int num2, char opertor) {
        int result;

        switch (opertor) {
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
                if(num2==0) throw new ArithmeticException("0으로 나눌 수 없습니다!");
                result = num1/num2;
                break;
            default :
                throw new IllegalArgumentException("올바른 연산자가 아닙니다!");

        }
        resultList.add(result); // int 결과 저장
        return result;
    }

    public Queue<Integer> getResultList() {
        return resultList;

    }
    public Integer removeResult(){
        if(!resultList.isEmpty()){
            return resultList.poll();
        }else{
            System.out.println("저장된 결과가 없습니다.");
            return null;
        }
    }
}
