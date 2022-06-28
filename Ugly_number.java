import java.util.Scanner;
class Sample
{
    public static String findUglyNumber(int n)
    {
        int flag=0;
        while(n>0)
        {
            if(n%5==0)
            {
               n=n/5;
               flag=1;
            }
            if(n%3==0)
            {
                n=n/3;
                flag=1;
            }
            if(n%2==0)
            {
                n=n/2;
                flag=1;
            }
            if(flag==0 || n==1)
               break;
        }
        if(n==1)
          return "Ugly Number";
        else
          return "Not Ugly Number";
    }
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int t;
    t=sc.nextInt();
    String result=Sample.findUglyNumber(t);
    System.out.println(result);
}
}