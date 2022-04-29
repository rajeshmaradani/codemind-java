import java.util.Scanner;
class temp
{
    public static void main(String args[])
    {
        int c;
        double f;
        Scanner sc=new Scanner(System.in);
        c=sc.nextInt();
        f=32+(c*9.0/5);
        System.out.printf("%.2f",f);
    }
}