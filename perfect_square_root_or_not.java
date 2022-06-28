import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,s;
        n=sc.nextInt();
        s=(int)Math.sqrt(n);
        if(s*s==n)
          System.out.println("True");
        else
          System.out.println("False");
          
         sc.close();
       
    }
}