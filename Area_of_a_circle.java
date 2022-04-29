import java.util.Scanner;
class circle
{
    public static void main(String args[])
    {
        int r;
        double c,pi=3.14;
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        c=pi*r*r;
        System.out.printf("%.2f",c);
    }
}