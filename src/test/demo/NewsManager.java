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
		Configuration conf = new Configuration().configure();
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
        .applySettings(conf.getProperties()).build();
		SessionFactory sf = conf.buildSessionFactory(serviceRegistry);
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		
		News n = new News();
		n.setTitle("�����籩����");
		n.setContent("���뷴���籩��������ʡ�������ί�������");
		
		sess.save(n);
		tx.commit();
		sess.close();
		sf.close();
	}
}
