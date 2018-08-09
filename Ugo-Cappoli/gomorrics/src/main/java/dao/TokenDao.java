package dao;

import org.hibernate.SessionFactory;

import db.OPs;
import models.Token;

public class TokenDao extends OPs<Token>{

	public TokenDao(SessionFactory s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

}
