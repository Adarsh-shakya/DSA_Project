//TailRecursion
public class TailRecusinon {
    public static void fact(int n, int ans){
        if(n==1)
        {
            System.out.print("Factorial= "+ans);
            return;
        }
        fact(n-1,ans*n);
    }
}
class tailMain{
    public static void main(String []args){
        TailRecusinon.fact(4,1);
    }
}
