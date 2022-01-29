import java.util.Stack;

public class Stack3 {
    public static void main(String []args){
        Stack<String> stk=new Stack<>();
        stk.push("adarsh");
        stk.push("shakya");
        stk.push("yadav");
        stk.push("bhagel");
        stk.push("chauhan");
        stk.push("Agrawal");
        int location=stk.search("shakya");
        System.out.println(stk);
        System.out.println("shakya at location "+ location);
        System.out.println("at top: "+stk.peek());
        System.out.println("Size : "+stk.size());
    }
}
