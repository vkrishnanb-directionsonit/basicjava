package edu.lessons.day3.premitiveTypes.ex;

/**
 * Implements a simple calculator with a recursive descendant parser.
 * The synax of the expression in EBNF is:
 * <pre>
 * expression = term, [ "+" | "-" , term ] ;
 * term = "(",  term, ")" | "0" | "1" | ... | "9" ;
 * </pre>
 * 
 * @author pape
 *
 */
public class Calculator {

    private char[] expression;

    private char currentCharacter;
    
    private int indexOfCurrentCharacter = 0;
    
    /**
     * Creates a new Calculator with the given expression.
     */
    public Calculator(String expression) {
        this.expression = expression.toCharArray();
        readNextCharacter();
    }
    
    /**
     * Reads in the next character to be parsed.
     * If no character exists anymore, then the 0 is used
     * as the next character.
     * White spaces are ignored.
     */
    private void readNextCharacter() {
        while ( indexOfCurrentCharacter < expression.length
                && Character.isWhitespace(expression[indexOfCurrentCharacter]) ) {
            indexOfCurrentCharacter++;
        }
        
        if ( indexOfCurrentCharacter < expression.length) {
            currentCharacter = expression[indexOfCurrentCharacter++];
        } else {
            currentCharacter = 0;
        }
    }
    
    /**
     * Returns the value of the expression.
     */
    public int evaluateExpression() {
        int valueOfExpression = evaluiereTerm();
        
        while ( currentCharacter == '+' || currentCharacter == '-') {
            char operator = currentCharacter;
            readNextCharacter();
            int term = evaluiereTerm();
            switch (operator) {
            case '+': valueOfExpression += term;
                      break;
            case '-': valueOfExpression -= term;
                      break;
            }
        }
         
        return valueOfExpression;
    }

    /**
     * Reads in a term, evalutes it and returns the result.
     */
    private int evaluiereTerm() {
        int resultOfTerm = 0;
        
        if (currentCharacter == '(') {
            readNextCharacter();
            resultOfTerm = evaluateExpression();
            if (currentCharacter != ')') {
                System.out.println("Closing parenthesis expected");
            } else {
                readNextCharacter();
            }
        } else if ( Character.isDigit(currentCharacter)) {
            resultOfTerm = currentCharacter - '0';
            readNextCharacter();
        }
        
        return resultOfTerm;
    }
}
