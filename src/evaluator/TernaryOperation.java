package evaluator;

public class TernaryOperation implements IntExpression {

    private IntExpression exp1;
    private IntExpression exp2;
    private IntExpression exp3;

    public TernaryOperation (IntExpression e, IntExpression e2, IntExpression e3) {
        exp1 = e;
        exp2 = e2;
        exp3 = e3;
    }

    public int getValue() {
        if (exp1.getValue() != 0) {
            return exp2.getValue();
        }
        return exp3.getValue();
    }
    public String toString() {
        return "(" + exp1.toString() + " ? " + exp2.toString() + " : " + exp3.toString() + ")";
    }
}
