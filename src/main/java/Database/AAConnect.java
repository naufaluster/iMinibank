package Database;

import Entity.Account;
import Entity.Customer;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Owned by Naufal Muhammad Ischyros
 */

public class AAConnect {

    private static SessionFactory factory;
    private static ServiceRegistry serviceRegistry;

    public static SessionFactory getConnection() {
        System.out.println("Get connecting");
        Configuration config = new Configuration();
        config.configure();
        config.addAnnotatedClass(Customer.class);
      config.addAnnotatedClass(Account.class);
//		config.addResource("query.hbm.xml");
//		config.addResource("Customer.hbm.xml");
        serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
        factory = config.buildSessionFactory(serviceRegistry);
        System.out.println("Successfully connected!");
        return factory;
    }
}
