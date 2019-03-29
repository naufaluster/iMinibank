package Database;

import Entity.Account;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.service.ServiceRegistry;

import java.util.ArrayList;
import java.util.List;

/**
 * Owned by Naufal Muhammad Ischyros
 */
public class AccountData {

    private static SessionFactory factory;
    private static ServiceRegistry serviceRegistry;


    public AccountData(SessionFactory connection) {
        factory = connection;
    }

    public List<Account> getListAccount() {
        Session sesn = factory.openSession();
        List<Account> listaccount = new ArrayList<Account>();
        try{
            Query query = sesn.createQuery("From Account");
            query.setMaxResults(10);
            listaccount = query.list();
        } finally {
            sesn.close();
        }

        return listaccount;
    }
    }
