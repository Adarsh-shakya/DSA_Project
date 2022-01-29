import java.util.Stack;

public class Stack1 {
    public static void main(String []args){
        Stack stk=new Stack();
        boolean result =stk.empty();
        System.out.println("Is stack empty: "+result);
        stk.push(2);
        stk.push(4);
        stk.push(5);
        stk.push(7);
        result=stk.empty();
        System.out.println(stk);
        System.out.println("Is stack empty: "+result);

    }
}
