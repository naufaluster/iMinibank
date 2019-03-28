package Database;

import Entity.Customer;
import org.hibernate.SessionFactory;
import org.hibernate.service.ServiceRegistry;

/**
 * Owned by Naufal Muhammad Ischyros
 */
public class CustomerData {

    private static SessionFactory factory;
    private static ServiceRegistry serviceRegistry;


    public CustomerData(SessionFactory connection) {
        factory = connection;
    }

    public Boolean addCustomer(Customer customer) {
        return null;
    }
}
