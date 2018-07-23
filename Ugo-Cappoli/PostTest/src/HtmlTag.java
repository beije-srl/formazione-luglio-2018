import java.util.HashMap;
import java.util.Map.Entry;

public class HtmlTag {
	HashMap<String, String> Attributes;
	String name;
	String content;

	public HtmlTag(String name) {
		Attributes = new HashMap<>();
		this.name = name;
		this.content = "";
	}

	public HtmlTag(String name, String content) {
		Attributes = new HashMap<>();
		this.name = name;
		this.content = content;
	}

	public HtmlTag(String name, HtmlTag content) {
		Attributes = new HashMap<>();
		this.name = name;
		this.content = content.getString();
	}

	public String getString() {
		String attrs = "";
		for (Entry<String, String> entry : Attributes.entrySet()) {
			attrs += " " + entry.getKey() + "=" + entry.getValue() + " ";
		}
		String html = "<" + name + attrs + ">" + content + "</" + name + ">";
		return html;
	}

	public void setContent(String text) {
		this.content = text;
	}

	public void setContent(HtmlTag tag) {
		this.content = tag.getString();
	}

	public void appendContent(HtmlTag tag) {
		this.content += tag.getString();
	}

	public void appendContent(String text) {
		this.content += text;
	}
}