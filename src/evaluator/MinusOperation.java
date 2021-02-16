package evaluator;

public class MinusOperation extends UnaryOperation {

    public MinusOperation(IntExpression number) {
        super(number);
    }

    protected int doOperation(int value) {
        return -value;
    }

    protected String toStringOperator() {
        return "-";
    }
}
