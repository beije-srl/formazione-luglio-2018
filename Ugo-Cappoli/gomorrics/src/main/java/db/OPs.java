package db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract class OPs<T> {
    SessionFactory session;
    T obj;
    public OPs(SessionFactory s)
    {
        this.session = s;
    }
    public void Add(T object)
    {
        Session s = session.openSession();
        s.beginTransaction();
        s.save(object);
        s.getTransaction().commit();
        s.close();
    }

    public List<T> getAll()
    {

        Class<T> persistentClass = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
        Session s = session.openSession();
        s.beginTransaction();
        List<T> result = s.createCriteria(persistentClass).list();
        s.getTransaction().commit();
        s.close();
        return result;
    }

    public T get(int id)
    {
        Class<T> persistentClass = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
        Session s = session.openSession();
        s.beginTransaction();
        T result = (T)s.createCriteria(persistentClass).add(Restrictions.idEq(id)).uniqueResult();
        s.getTransaction().commit();
        s.close();
        return result;
    }

    public void  Delete(T object)
    {

    }
}
