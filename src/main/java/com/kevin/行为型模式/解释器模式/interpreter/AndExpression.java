package com.kevin.行为型模式.解释器模式.interpreter;

/**
 * @author kevin
 * @version 1.0
 * @description
 * @createDate 2019/3/3
 */
public class AndExpression implements Expression{

    private Expression expr1 = null;
    private Expression expr2 = null;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}
