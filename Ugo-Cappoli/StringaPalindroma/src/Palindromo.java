
public class Palindromo {

    public static boolean controlla(String testo)
    {
        boolean isPalindromo = false;
        int len = testo.length();

        int index = 0;

        boolean end = false;
        while(index < len && !end)
        {
            if(testo.charAt(index) == testo.charAt(len-1-index))
            {
                isPalindromo=true;
            }else{isPalindromo=false;end=true;}
            index++;
        }


        return isPalindromo;
    }
    
	
	public static void main(String[] args)
	{
		System.out.println(controlla("otlto"));
	}
}
