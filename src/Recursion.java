//Head recursion
public class Recursion {
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        int recuAnswer=fact(n-1);
        int result=n*recuAnswer;
        return result;
    }
}
class RecuMain{
    public static void main(String[] args) {
        System.out.println("Facturial= "+ Recursion.fact(5));
    }
}
