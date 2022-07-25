import java.util.Scanner;
class Sample
{
	public static void main(String[ ] args)
	{
	int i=0;
	Scanner sc=new Scanner(System.in);
	char ch=sc.next( ).charAt(0);	 
	//char ch=sc.nextChar();
	switch(ch)
	{
	 case  'a' :
	 case 'e'  :
	 case 'i'   :
	 case 'o'  :
	 case 'u'  :
	 case  'A' :
	 case 'E'  :
	 case 'I'   :
	 case 'O'  :
	 case 'U'  :i++;
	}
	if(i==1)
	{
	    System.out.println("Vowel");
	}
	else
	{
	    System.out.println("Consonant");
	}
	}
}