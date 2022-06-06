import java.util.Scanner;
class descend
{
    public static void main(String args[])
    {
    int a[],i,count=0,n;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    a=new int[n];
    for(i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    for(i=0;i<n-1;i++)
    {
        if(a[i]<=a[i+1])
        {
            count=1;
            break;
        }
    }
    if(count==0)
    {
        System.out.println("yes");
    }
    else
    {
        System.out.println("no");
    }
    }
}