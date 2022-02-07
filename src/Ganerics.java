public class Ganerics<T> {
    T value;
    public void show(){
        System.out.println(value.getClass().getName());
    }
}
class genericDemo{
    public static void main(String[] args) {
        Ganerics<Integer> obj=new Ganerics();
        obj.value=67;
        obj.show();
    }
}
