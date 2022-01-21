import java.util.ArrayList;

public class Arrlist {
    public static void main(String []args){
        ArrayList<String> list =new ArrayList<>();
        list.add("adarsh");
        list.add("Shakya");
        list.add("Ruby");
        list.add("Prachi");
        list.add("Dev");
        System.out.println(list);
        list.remove("Ruby");
        list.add(2,"sona");
        System.out.println(list.size());
        System.out.println(list);
    }
}
