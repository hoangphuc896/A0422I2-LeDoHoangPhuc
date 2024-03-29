package com.example.ss10jsp.calculator.model;

public class Calculator {
    public static float calculator(float firstOperand, float secondOperand, char operator) {
        switch (operator){
            case '+':
                return firstOperand+secondOperand;
            case '-':
                return firstOperand-secondOperand;
            case '*':
                return firstOperand*secondOperand;
            case '/':
                if (secondOperand != 0){
                    return firstOperand/secondOperand;
                }else {
                    throw new RuntimeException("Can't divide by zero");
                }
            default:
                throw new RuntimeException("Invalid operation");
        }
    }
}
