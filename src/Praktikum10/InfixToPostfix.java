package Praktikum10;

/**
 *
 * @NURUL ARIFIN 19MI0016
 * 
 */




import java.util.Stack;
public class InfixToPostfix {
    String infixExp = "";
    String postfixExp = "";
    Stack<Character> s = new Stack<Character>();
    
    public void setInfixExp(String infixExp){
        this.infixExp = infixExp;
    }
    public boolean isOperator(char ch){
        if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^'){
            return true;
        }
        return false;
    }
    
    public int degreeOp(char op){
        if(op == '+' || op == '-'){
            return 1;
        }else if(op == '*' || op == '/'){
            return 2;
        }else if(op == '*'){
            return 3;
        }else{
            return 0;
        }
    }
    
    
    public String toPostfix(){
        char ch;
        for(int i = 0; i < infixExp.length(); i++){
            ch = infixExp.charAt(i);
            if(isOperator(ch)){
                if(s.isEmpty() || degreeOp(ch) > degreeOp(s.peek())){
                    s.push(ch);
                }else{
                    postfixExp += s.pop();
                    do{
                        if(s.isEmpty() || degreeOp(ch) > degreeOp(s.peek())){
                            break;
                        }else{
                            
                        }
                    }while(degreeOp(ch) <= degreeOp(s.peek()));
                    s.push(ch);
                }
            }else if(ch == ')'){
                do{
                    postfixExp += s.pop();
                }while(s.peek() != '(');
                s.pop();
            }else if(ch == '('){
                s.push(ch);
            }else{
                postfixExp += ch;
            }
        }
        if(!s.isEmpty()){
            do{
                postfixExp += s.pop();
            }while(!s.isEmpty());
        }
        return postfixExp;
    }
}
