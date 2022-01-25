public class convertSTRtoNUM {
        static int sum=0;
        public static void con(String string ,int i){
            if(string.length()==i){
                System.out.println(sum);
                return;
            }
            int num= Integer.parseInt(String.valueOf(string.charAt(i)));
            sum=10*sum+num;
            con(string,i+1);
        }
    }
    class convertMain{
        public static void main(String[] args) {
             convertSTRtoNUM.con("2019",0);
        }
    }

