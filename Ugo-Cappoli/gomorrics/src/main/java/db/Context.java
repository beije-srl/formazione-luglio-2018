package db;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Context {

    private SessionFactory sessionFactory;

    public Context()
    {
        sessionFactory = new Configuration()

                .configure() // configura la SessionFactory utilizzando l' hibernate.cfg.xml

                .buildSessionFactory();
    }

    public SessionFactory getSession()
    {
        return this.sessionFactory;
    }

    public void close()
    {
        if ( sessionFactory != null ) {
            sessionFactory.close();
        }
    }

}