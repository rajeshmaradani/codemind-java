import java.util.Scanner;
class avaarge
{
    public static void main(String args[])
    {
        int n,m;
        double r;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        r=(n+m)/2.0;
        System.out.printf("%.4f",r);
    }
}