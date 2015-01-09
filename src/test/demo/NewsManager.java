package test.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import test.domain.News;

public class NewsManager {
	public static void main(String[] args) throws Exception {
		// Configuration conf = new Configuration().configure();
		// ServiceRegistry serviceRegistry = new
		// StandardServiceRegistryBuilder()
		// .applySettings(conf.getProperties()).build();
		// SessionFactory sf = conf.buildSessionFactory(serviceRegistry);

		SessionFactory sf = new Configuration().configure()
				.buildSessionFactory(
						new StandardServiceRegistryBuilder().build());

		// Session sess = sf.getCurrentSession();
		Session sess = sf.openSession();
		sess.beginTransaction();
		News n = new News();
		n.setTitle("反腐风暴继续");
		n.setContent("中央反腐风暴继续，六省会城市市委书记落马。");
		sess.save(n);

		sess.getTransaction().commit();

		sess.close();
		sf.close();
	}
}
