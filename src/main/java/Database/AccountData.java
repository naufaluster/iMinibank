package Database;

import Entity.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.service.ServiceRegistry;


/**
 * Owned by Naufal Muhammad Ischyros
 */
public class AccountData {

    private static SessionFactory factory;
    private static ServiceRegistry serviceRegistry;


    public AccountData(SessionFactory connection) {
        factory = connection;
    }

//    public List<Account> getListAccount(String cif) {
//        Session sesn = factory.openSession();
//        List<Account> listaccount = new ArrayList<Account>();
//        try{
//            Query query = sesn.createQuery("From account");
//            query.setMaxResults(10);
//            listaccount = query.list();
//        } finally {
//            sesn.close();
//        }
//
//        return listaccount;
//    }

    public boolean addAccount(Account account) {
        Session session = factory.openSession();
        try {
            Transaction trx = session.beginTransaction();
            session.save(account);
            session.flush();
            trx.commit();
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

}
