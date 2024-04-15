package org.ass.springweb.repository;

import javax.persistence.Query;

import org.ass.springweb.entity.Register;
import org.ass.springweb.util.ConnectionProperties;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import net.bytebuddy.asm.Advice.Return;

@Repository
public class RegisterRepository {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void save(Register register) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(register);
		transaction.commit();
	}

	public Register finalByEmail(String email) {
		Session session = sessionFactory.openSession();
		StringBuilder builder = new StringBuilder();
		builder.append("from Register where email=:e ");
		Query query = session.createQuery(builder.toString());
		query.setParameter("e", email);
		return (Register) query.getSingleResult();
	}

}
