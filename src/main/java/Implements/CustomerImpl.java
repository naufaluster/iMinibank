package Implements;

import Database.AAConnect;
import Database.CustomerData;
import Entity.Customer;
import Interfaces.ICustomer;

/**
 * Owned by Naufal Muhammad Ischyros
 */

public class CustomerImpl implements ICustomer {

    private CustomerData customerData;

    public CustomerImpl(){
        customerData = new CustomerData(AAConnect.getConnection());
    }

    public Boolean addCustomer(Customer customer) {
        return customerData.addCustomer(customer);
    }

}
