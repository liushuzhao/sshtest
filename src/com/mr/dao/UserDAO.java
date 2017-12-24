package com.mr.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.mr.user.User;
public class UserDAO {
	private SessionFactory sessionFactory; 
	public void insert(User user) throws Exception {
		this.getSession().save(user);
	}

	protected Session getSession() {
		return sessionFactory.openSession();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
