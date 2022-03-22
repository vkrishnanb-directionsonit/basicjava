package edu.lessons.day3.premitiveTypes.ex;



public class CalculatorTest  {

    public void testevaluateExpression1() {
        Calculator calculator = new Calculator("1");
        
        System.out.println(1== calculator.evaluateExpression());
    }
    
    public void testevaluateExpression2() {
        Calculator calculator = new Calculator("1 + 2");
        
        System.out.println(3== calculator.evaluateExpression());
    }

    public void testevaluateExpression3() {
        Calculator calculator = new Calculator("((1))");
        
        System.out.println(1== calculator.evaluateExpression());
    }
    
    public void testevaluateExpression4() {
        Calculator calculator = new Calculator("((1) -2 + (3)");
        
        System.out.println(2== calculator.evaluateExpression());
    }
}
