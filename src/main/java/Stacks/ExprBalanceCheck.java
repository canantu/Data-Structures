package Stacks;

public class ExprBalanceCheck {

    public static void main(String[] args) {

        System.out.println(balanceCheck("(A*B) + {V-M}"));
        System.out.println(balanceCheck("(A*B) + {V-M}]"));

    }


    public static boolean balanceCheck(String expr) {
        // create a stack
        MyStack<Character> myStack = new MyStack<>();
        // iterate over expr
        for (int i = 0; i < expr.length(); i++) {
            Character ch = expr.charAt(i);
            // filter non player chars
            if (ch != '(' && ch != '{' && ch != '[' && ch != ']' && ch != '}' && ch != ')'){
                continue;
            }
            // push opening symbols
            if (ch == '(' || ch == '{' || ch == '['){
                myStack.push(ch);
                continue;
            }
            if (myStack.isEmpty()){ return false;}
            // if closing symbol, look for matching and remove it
            switch (ch){
                case ')':
                    if (myStack.pop() != '(') { return false; }
                    break;
                case ']':
                    if (myStack.pop() != '[') { return false; }
                    break;
                case '}':
                    if (myStack.pop() != '{') { return false; }
                    break;
            }
        }
        // return if stack is empty
        return myStack.isEmpty();
    }
}
