package Lv3;

public enum OperatorType {

    ADD('+'),
    SUBTRACT('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    final private char symbol;

    OperatorType(char symbol) {
        this.symbol = symbol;
    }

    public static OperatorType fromChar(char ch) {
        for (OperatorType type : values()) {
            if (type.symbol == ch) {
                return type;
            }
        }
        throw new IllegalArgumentException("지원하지 않는 연산자입니다: " + ch);
    }

}
