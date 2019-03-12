package com.kevin.行为型模式.解释器模式.interpreter;

/**
 * @author kevin
 * @version 1.0
 * @description     终结符表达式，实现表达式的实体类
 * @createDate 2019/3/3
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
