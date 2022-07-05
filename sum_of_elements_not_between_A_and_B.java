import java.util.*;
class Sample
{
    public static int findSum(int m[],int x,int y)
    {   int sum=0;
        for(int i=0;i<m.length;i++)
        {
            if(m[i]<x || m[i]>y)
              sum=sum+m[i];
        }
        return sum;
    }
    //call by value: If you do any modification in the function defnition it will not effect the original arguments.
    //call by reference: if you do any modification in function defnition it will effect the original arguments.

    public static void main(String args[])
    {
        int n,x[],a,b,i,res=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
          x[i]=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        res=Sample.findSum(x,a,b);
        System.out.println(res);
        sc.close();

    }
}