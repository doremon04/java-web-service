package cus.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	static {
		if (sessionFactory == null) {
			StandardServiceRegistry  reg = new StandardServiceRegistryBuilder().configure().build();
			MetadataSources  sources = new MetadataSources(reg);
			Metadata metadata = sources.getMetadataBuilder().build();
			sessionFactory = metadata.getSessionFactoryBuilder().build();
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
