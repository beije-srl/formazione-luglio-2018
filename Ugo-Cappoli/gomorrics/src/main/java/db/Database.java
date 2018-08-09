package db;


import org.hibernate.SessionFactory;

import dao.TokenDao;
import dao.UsersDao;

public class Database {

    //CLASSI DAO
    private UsersDao usersDao;
    private TokenDao tokenDao;
    
    public UsersDao getUsersDao() {
		return usersDao;
	}

	//CLASSI DAO
    private SessionFactory session;
    public Database()
    {
        this.session = new Context().getSession();

        //INSTANZIAMENTO DAO
        this.usersDao = new UsersDao(session);
        this.tokenDao = new TokenDao(session);
        //this.utenteDAO = new UtenteDAO(session);
    }

    public void close()
    {
        session.close();
    }

	public TokenDao getTokenDao() {
		return tokenDao;
	}



	



}

