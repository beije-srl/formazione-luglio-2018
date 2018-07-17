
public class Multiplo {
	
public static boolean multiplo(int x, int y)
{
	if(x%y!=0)
	{
		return false;
	}
	return true;
}
public static void main(String[] args)
{
	for(int i=1;i<=100;i++)
	{
		boolean multiplo3 = multiplo(i,3);
		boolean multiplo5 = multiplo(i,5);
		if(multiplo3)
		{
			System.out.println(i + ".Buzz");
		}
		if(multiplo5)
		{
			System.out.println(i+".Fuzz");
		}
		if(multiplo3 && multiplo5)
		{
			System.out.println(i+".BuzzFuzz");
		}
	}
}

}
