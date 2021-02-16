package evaluator;

public abstract class UnaryOperation implements IntExpression {

    private IntExpression number;

    public UnaryOperation(IntExpression number) {
        this.number = number;
    }

    abstract protected int doOperation(int value);

    public int getValue() {
        return doOperation(number.getValue());
    }

    abstract protected String toStringOperator();

    public String toString() {
        return toStringOperator() + "(" + number.getValue() + ")";
    }
}
