import java.util.Scanner;
class current
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String id,name;
        int n;
        double tr,r,s;
        id=sc.nextLine();
        name=sc.nextLine();
        n=sc.nextInt();
        if(n<=199)
        {
           tr=n*1.20;
           r=(tr/100)*15.0;
           if(r<100)
           {
               r=100;
           }
           s=tr+r;
           System.out.printf("%.2f",s);
        }
         else if(n>=200 && n<400)
        {
           tr=n*1.50;
           r=(tr/100)*15.0;
           if(r<100)
           {
               r=100;
           }
           s=tr+r;
           System.out.printf("%.2f",s);
        }
        else if(n>=400 && n<600)
        {
           tr=n*1.80;
           r=(tr/100)*15.0;
           if(r<100)
           {
               r=100;
           }
           s=tr+r;
           System.out.printf("%.2f",s);
        }
         else
        {
           tr=n*2.00;
           r=(tr/100)*15.0;
           s=tr+r;
           System.out.printf("%.2f",s);
        }
    }
}