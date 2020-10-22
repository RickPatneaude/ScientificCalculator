/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificcalculator;

import java.util.*;

/**
 *
 * @author RickP
 */
public class Calculations {


 
    //separates, then recombines values and operators in order to calculate mathematical expressions
    public static double evaluate(String expression)
    {
        char[] tokens = expression.toCharArray();
        
         // Stack for numbers: 'values'
        Stack<Double> values = new Stack<Double>();
 
        // Stack for Operators: 'ops'
        Stack<Character> ops = new Stack<Character>();
 
        for (int i = 0; i < tokens.length; i++)
        {
             
            // Current token is a 
            // whitespace, skip it
            if (tokens[i] == ' ')
                continue;
            
            //token indicates Math operation, should calculate this expression first
            
            //Log
            if (tokens[i] == 'L')
            {
                
                                    
                    StringBuilder exp = new StringBuilder();
                    i++;
                    int lPar = 0;
                    int rPar = 0;
                    while ((lPar == 0 && rPar == 0) || (lPar != rPar))
                   {
                       exp.append(tokens[i]);                       
                       if(tokens[i] == '(') lPar++;
                       if(tokens[i] == ')') rPar++;
                       if (i < tokens.length) i++;
                   }
                   
                   
                   double lAnswer = Math.log10(evaluate(exp.toString()));
                   values.push(lAnswer);
                   if(i == tokens.length) break;                
                                
            }
            //Log Natural
            if (tokens[i] == 'l')
            {
                
                                    
                    StringBuilder exp = new StringBuilder();
                    i++;
                    int lPar = 0;
                    int rPar = 0;
                    while ((lPar == 0 && rPar == 0) || (lPar != rPar))
                   {
                       exp.append(tokens[i]);                       
                       if(tokens[i] == '(') lPar++;
                       if(tokens[i] == ')') rPar++;
                       if (i < tokens.length) i++;
                   }
                   
                   
                   double lAnswer = Math.log(evaluate(exp.toString()));
                   values.push(lAnswer);
                   if(i == tokens.length) break;                
                                
            }
            
            //Sine
            if (tokens[i] == 'S')
            {
                
                                    
                    StringBuilder exp = new StringBuilder();
                    i++;
                    int lPar = 0;
                    int rPar = 0;
                    while ((lPar == 0 && rPar == 0) || (lPar != rPar))
                   {
                       exp.append(tokens[i]);                       
                       if(tokens[i] == '(') lPar++;
                       if(tokens[i] == ')') rPar++;
                       if (i < tokens.length) i++;
                   }
                   
                   
                   double lAnswer = Math.sin(evaluate(exp.toString()));
                   values.push(lAnswer);
                   if(i == tokens.length) break;   
                                
            }

            //Tan
            if (tokens[i] == 'T')
            {
                
                                    
                    StringBuilder exp = new StringBuilder();
                    i++;
                    int lPar = 0;
                    int rPar = 0;
                    while ((lPar == 0 && rPar == 0) || (lPar != rPar))
                   {
                       exp.append(tokens[i]);                       
                       if(tokens[i] == '(') lPar++;
                       if(tokens[i] == ')') rPar++;
                       if (i < tokens.length) i++;
                   }
                   
                   
                   double lAnswer = Math.tan(evaluate(exp.toString()));
                   values.push(lAnswer);
                   if(i == tokens.length) break;   
                                
            }                        

            //Cosine
            if (tokens[i] == 'C')
            {
                
                                    
                    StringBuilder exp = new StringBuilder();
                    i++;
                    int lPar = 0;
                    int rPar = 0;
                    while ((lPar == 0 && rPar == 0) || (lPar != rPar))
                   {
                       exp.append(tokens[i]);                       
                       if(tokens[i] == '(') lPar++;
                       if(tokens[i] == ')') rPar++;
                       if (i < tokens.length) i++;
                   }
                   
                   
                   double lAnswer = Math.cos(evaluate(exp.toString()));
                   values.push(lAnswer);
                   if(i == tokens.length) break;   
                                
            }
            
            //Cotangent
            if (tokens[i] == 'c')
            {
                
                                    
                    StringBuilder exp = new StringBuilder();
                    i++;
                    int lPar = 0;
                    int rPar = 0;
                    while ((lPar == 0 && rPar == 0) || (lPar != rPar))
                   {
                       exp.append(tokens[i]);                       
                       if(tokens[i] == '(') lPar++;
                       if(tokens[i] == ')') rPar++;
                       if (i < tokens.length) i++;
                   }
                   
                   
                   double lAnswer = (1/Math.tan(evaluate(exp.toString())));
                   values.push(lAnswer);
                   if(i == tokens.length) break;   
                                
            }
            
            //exponent logic is done here
            if (tokens[i] == 'x')
            {
                
                                    
                    StringBuilder exp = new StringBuilder();
                    i++;
                    int power = Integer.parseInt(String.valueOf(tokens[i]));                    
                    i++;
                    int lPar = 0;
                    int rPar = 0;
                    while ((lPar == 0 && rPar == 0) || (lPar != rPar))
                   {
                       exp.append(tokens[i]);                       
                       if(tokens[i] == '(') lPar++;
                       if(tokens[i] == ')') rPar++;
                       if (i < tokens.length) i++;
                   }
                   
                   
                   double lAnswer = Math.pow(evaluate(exp.toString()), power);
                   values.push(lAnswer);
                   if(i == tokens.length) break;   
                                
            }            
            
            //Token is a digit, will be concatenated if more than one digit then pushed onto the values stack
            if ((tokens[i] == '-' && tokens[i + 1] >= '0' && tokens[i + 1] <= '9') || (tokens[i] >= '0' && 
                 tokens[i] <= '9'))
            {
                StringBuilder sbuf = new
                            StringBuilder();
                 
                //digit concatenation
                while ((i < tokens.length) &&  ((tokens[i] == '-' && tokens[i + 1] >= '0' && tokens[i + 1] <= '9') ||( 
                        tokens[i] >= '0' && 
                          tokens[i] <= '9') || (tokens[i] == '.')) )
                    sbuf.append(tokens[i++]);
                values.push(Double.parseDouble(sbuf.toString()));               
                  i--;
            }
 
            //Opening brace, push to operations stack
            else if (tokens[i] == '(')
                ops.push(tokens[i]);
 
            //Closing brace
            else if (tokens[i] == ')')
            {
                while (ops.peek() != '(')
                values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                    ops.pop();            }
 
            // Current token is an operator.
            else if (tokens[i] == '+' || 
                     tokens[i] == '-' ||
                     tokens[i] == '*' || 
                        tokens[i] == '/')
            {
                // While top of 'ops' has same 
                // or greater precedence to current
                // token, which is an operator.
                // Apply operator on top of 'ops'
                // to top two elements in values stack
                while (!ops.empty() && 
                       hasPrecedence(tokens[i], 
                                    ops.peek()))
                  values.push(applyOp(ops.pop(), 
                                   values.pop(),
                                 values.pop()));
 
                // Push current token to 'ops'.
                ops.push(tokens[i]);
            }
        }
 
        // Entire expression has been 
        // parsed at this point, apply remaining
        // ops to remaining values
        while (!ops.empty())
            values.push(applyOp(ops.pop(), values.pop(), values.pop()));
 
        // Top of 'values' contains 
        // result, return it
        return values.pop();
    }
 
    // Returns true if 'op2' has higher 
    // or same precedence as 'op1',
    // otherwise returns false.
    public static boolean hasPrecedence(
                           char op1, char op2)
    {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') && 
            (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }
 
    // A utility method to apply an 
    // operator 'op' on operands 'a' 
    // and 'b'. Return the result.
    public static double applyOp(char op, double b, double a)
    {
        switch (op)
        {
        case '+':
            return a + b;
        case '-':
            return a - b;
        case '*':
            return a * b;
        case '/':
            if (b == 0)
                throw new
                UnsupportedOperationException(
                      "Cannot divide by zero");
            return a / b;
        }
        return 0;
    }
 
    // Driver method to test above methods
    public static void main(String[] args)
    {
        System.out.println(Calculations.
                        evaluate("10 + 2 * 6"));
        System.out.println(Calculations.
                      evaluate("100 * 2 + 12"));
        System.out.println(Calculations.
                   evaluate("100 * ( 2 + 12 )"));
        System.out.println(Calculations.
             evaluate("100 * ( 2 + 12 ) / 14"));
    }
}    

