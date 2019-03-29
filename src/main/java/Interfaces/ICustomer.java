package Interfaces;

import Entity.Customer;

/**
 * Owned by Naufal Muhammad Ischyros
 */
public interface ICustomer {
    Boolean addCustomer(Customer customer);
    Customer login(String username, String password);
}
