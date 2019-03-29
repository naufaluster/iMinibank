package Database;

import Entity.Customer;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.service.ServiceRegistry;

/**
 * Owned by Naufal Muhammad Ischyros
 */

public class CustomerData {

    private static SessionFactory factory;
    private static ServiceRegistry serviceRegistry;

    static CustomerData customerData;

    public CustomerData(SessionFactory connection) {
        factory = connection;
    }

    public Boolean addCustomer(Customer customer) {
        Session session = factory.openSession();
        try {
            Transaction trx = session.beginTransaction();
            session.save(customer);
            trx.commit();
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

}
