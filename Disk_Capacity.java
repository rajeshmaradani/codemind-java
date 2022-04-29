import java.util.Scanner;
class disc
{
    public static void main(String args[])
    {
        int t,s,b,r;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        r=2*t*s*b*512;
        System.out.println(r);
    }
}