
public class OPStringa {
public static String parola(String text)
{
	return text.substring(1, text.length()) + text.charAt(0) + "ay";
}
public static void main(String[] args)
{
	System.out.println(parola("banana"));
}
}
