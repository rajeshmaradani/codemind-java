import java.util.Scanner;  
class PrintAsciiValueExample4  
{  
public static void main(String args[])  
{
Scanner sc = new Scanner(System.in);  
char chr = sc.next().charAt(0);  
int asciiValue = chr;  
System.out.println(asciiValue);  
}  
} 