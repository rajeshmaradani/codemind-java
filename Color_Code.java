import java.util.Scanner;
class code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char ch;
        ch=sc.next().charAt(0);
        switch(ch)
        {   
            case 'v':
            case  'V':
                System.out.println("Violet");
                break;
            case 'I':
            case 'i':
                System.out.println("Indigo");
                break;
             case 'B':
             case 'b':
                System.out.println("Blue");
                break;
             case 'g':
             case 'G':
                System.out.println("Green");
                break;
             case 'Y':
             case 'y':
                System.out.println("Yellow");
                break;
             case 'O':
             case 'o':
                System.out.println("Orange");
                break;
             case 'R':
             case 'r':
                System.out.println("Red");
                break;
            default:
                 System.out.println("-1");
                 break;
        }
    }
}