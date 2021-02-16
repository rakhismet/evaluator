package evaluator;

public class Main {

    public static void main(String[] args) {
        IntExpression expr1 = new DivideOperation(new IntConstant(5), new MinusOperation(new NotOperation(new IntConstant(0))));
        System.out.println(expr1 + " = " + expr1.getValue());
        IntExpression ternary = new TernaryOperation(new AndOperation(new IntConstant(3), new IntConstant(0)), new IntConstant(5), new MultiplyOperation(new IntConstant(-8), new IntConstant(13)));
        System.out.println(ternary + " = " + ternary.getValue());
        IntExpression expr = new DivideOperation(new IntConstant(5), new MinusOperation(new NotOperation(new IntConstant(1))));
        System.out.println(expr + " = " + expr.getValue());
    }
}
