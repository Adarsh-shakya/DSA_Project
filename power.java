public class power {
public void pow(int num ,int p, int ans)
{
if(p<=0)
{
    System.out.println(ans);
return;
}
pow(num,p-1,ans*num);
}
public static void main(String []args)
{
  power obj=new power();
  obj.pow(2, 4, 1);
}
}
