public class Fabonicci {
    static int a=0;
    static int b=1;
    static int c;
    public static void fabon(int num){
        if(num>=1){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            fabon(num-1);
        }
    }
}
class FaboMain{
    public static void main(String[] args) {
        System.out.print(Fabonicci.a+" "+Fabonicci.b+" ");
        Fabonicci.fabon(9);
    }
}
