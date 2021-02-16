package evaluator;

public class NotOperation extends UnaryOperation {

    public NotOperation(IntExpression number) {
        super(number);
    }

    protected int doOperation(int value) {
        return (value != 0 ? 0 : 1);
    }

    protected String toStringOperator() {
        return "!";
    }
}
