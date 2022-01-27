import java.util.Stack;

public class Stack2 {
    public static void main(String[] args) {
        Stack st=new Stack();
        System.out.println("Stack : "+st);


        pushElement(st,12);
        pushElement(st,19);
        pushElement(st,13);
        pushElement(st,45);
        pushElement(st,12);
        pushElement(st,18);
        pushElement(st,67);
        pushElement(st,10);

        popElement(st);
        popElement(st);
        popElement(st);
        popElement(st);
        popElement(st);
        popElement(st);
        popElement(st);
        popElement(st);





    }

     static void pushElement(Stack st ,int i) {
        st.push(i);
          System.out.println("push -> "+i);
          System.out.println("stack : "+st);
    }
    static void popElement(Stack st){
        int x= (int) st.pop();
        System.out.println("pop -> "+x);
        System.out.println(st);
    }
}
