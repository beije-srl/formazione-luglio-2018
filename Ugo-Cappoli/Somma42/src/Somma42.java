
public class Somma42 {
	
	public static void controlla(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=i;j<array.length;j++)
			{
				if((array[i]+array[j])==42)
				{
					System.out.println(i+ "\n"+ j);
				}
			}
		}
	}
public static void main(String[] args)
{
	int array[] = {11,32,10};
	controlla(array);
}}
