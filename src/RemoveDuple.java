
public class RemoveDuple{
    static String str=" ";
    public static String remo(String string){
        if(string.length()==0 || string.length()==1){
            return string;
        }
        if(string.charAt(0)==string.charAt(1)){
            str=remo(string.substring(2));
            return string.charAt(0)+str;
        }
        else
        {
            str=remo(string.substring(1));
            return string.charAt(0)+str;
        }

    }
}
class removeMain{
    public static void main(String[] args) {
        String s=RemoveDuple.remo("aabaaca");
        System.out.println("Given String: "+s);
        System.out.print("result string:"+s);
    }
}

