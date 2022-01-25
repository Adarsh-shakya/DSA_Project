public class Replace {
   static String newstr=" ";
    public static String str(String string,char c1,char c2){
        if(string.length()==0){
            return newstr;
        }
        if(string.charAt(0)==c1){
            newstr=str(string.substring(1),c1,c2);
            return c2+newstr;
        }
        else
        {
            newstr=str(string.substring(1),c1,c2);
            return string.charAt(0)+newstr;
        }

    }
}
class ReMain{
    public static void main(String[] args) {
       String ans=Replace.str("abaca",'a','x');
        System.out.println("Given string     : abaca");
        System.out.println("Resulting string : "+ans);
    }
}
