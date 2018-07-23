import java.security.KeyPair;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;



public class HtmlHelper {

	ArrayList<HtmlTag> Body;
	ArrayList<HtmlTag> Head;
	
	public HtmlHelper()
	{
		Body = new ArrayList<>();
		Head = new ArrayList<>();
	}

	public void AddHead(HtmlTag elem)
	{
		Head.add(elem);
	}
	
	public List<HtmlTag> getAllHeads()
	{
		return Head;
	}
	
	public void AddBody(HtmlTag elem)
	{
		Body.add(elem);
	}
	
	public List<HtmlTag> getAllBody()
	{
		return Body;
	}
	
	public String getString()
	{
		String page ="<html>";
		page+="<head>";
		for(HtmlTag tag : Head)
		{
			page+=tag.getString();
		}
		page+="</head>";
		page+="<body>";
		for(HtmlTag tag : Body)
		{
			page+=tag.getString();
		}
		page+="</body>";
		page+="</head>";
		return page;
	}

}
