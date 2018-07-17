import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServerletPost extends HttpServlet {

@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	HtmlHelper helper = new HtmlHelper();
	HtmlTag titolo = new HtmlTag("title");
	titolo.setContent("GET TEST");
	
	HtmlTag stile = new HtmlTag("style",".container{display:table-caption;}");
	HtmlTag script = new HtmlTag("script","alert('test');");
	
	HtmlTag form = new HtmlTag("form");
	form.Attributes.put("action", "./servlet");
	form.Attributes.put("method", "post");
	
	HtmlTag labelNome = new HtmlTag("label","Nome : ");
	
	HtmlTag nome = new HtmlTag("input");
	nome.Attributes.put("name", "nome");
	nome.Attributes.put("type", "text");
	
	HtmlTag labelCognome = new HtmlTag("label","Cognome : ");
	
	HtmlTag cognome = new HtmlTag("input");
	cognome.Attributes.put("name", "cognome");
	cognome.Attributes.put("type", "text");
	
	HtmlTag submit = new HtmlTag("input");
	submit.Attributes.put("type", "submit");
	submit.Attributes.put("value", "invia");
	
	form.appendContent(labelNome);
	form.appendContent(nome);
	form.appendContent(labelCognome);
	form.appendContent(cognome);
	form.appendContent(submit);
	
	HtmlTag container = new HtmlTag("div",form);
	container.Attributes.put("class","container");
	
	
	helper.Head.add(titolo);
	helper.Head.add(stile);
	helper.Head.add(script);
	helper.Body.add(container);
	
	resp.getWriter().write(helper.getString());
	}
	
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	HtmlHelper helper = new HtmlHelper();
	String nome = req.getParameter("nome");
	String cognome = req.getParameter("cognome");
	
	HtmlTag titolo = new HtmlTag("title");
	titolo.setContent("TEST POST");
	
	HtmlTag stile = new HtmlTag("style");
	stile.setContent("h1{color:blue;} h2{color:red;}");
	
	HtmlTag tagNome = new HtmlTag("h1");
	tagNome.setContent(nome);
	HtmlTag tagCognome = new HtmlTag("h2");
	tagCognome.setContent(cognome);
	
	
	helper.Head.add(titolo);
	helper.Head.add(stile);
	

	helper.Body.add(tagNome);
	helper.Body.add(tagCognome);
	
	resp.getWriter().write(helper.getString());
	
	System.out.println(req);
}
	
}
