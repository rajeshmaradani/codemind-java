import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int n,i,x[];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        //Allocating memory for array
        x=new int[n];

        //Reading of an array
        for(i=0;i<n;i++)
         x[i]=sc.nextInt();

        for(i=n-1;i>=0;i--)
        {
            if(x[i]%2==0)
            {
                System.out.println(x[i]);
                break;
            }
        }
        sc.close();

    }
}