package dao;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Optional;

import org.hibernate.SessionFactory;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestBody;

import db.Database;
import db.OPs;
import models.LoginResponse;
import models.Token;
import models.Users;
import utils.Utilis;

public class UsersDao extends OPs<Users>  {

	SessionFactory s;
	public UsersDao(SessionFactory s) {
		super(s);
		this.s=s;
		// TODO Auto-generated constructor stub
	}
	
	public void registra(Users u)
	{
		String password = u.getPassword();
		u.setPassword(Utilis.MD5(password));
		super.Add(u);
	}
	
	public LoginResponse login(Users u)
	{
		LoginResponse resp = new LoginResponse();
		Optional<Users> user = super.getAll().stream().filter(x -> x.getEmail().equals(u.getEmail()) && x.getPassword().equals(Utilis.MD5(u.getPassword()))).findFirst();
		
		boolean isPresent = user.isPresent();
		resp.setSuccess(isPresent);
		if(isPresent) {
			String token = Utilis.generateToken();
			Token t = new Token(token,user.get().getIdUtente());
			new Database().getTokenDao().Add(t);
			resp.setToken(token);
		}else {
		resp.setToken(null);}
		return resp;
	}

}
