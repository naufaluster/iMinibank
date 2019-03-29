package Entity;

import javax.persistence.*;

/**
 * Owned by Naufal Muhammad Ischyros
 */

@Entity(name = "account")
@Table (name = "account")
public class Account {

    @Id
    @Column (name = "AccountNumber")
    private String AccountNumber;

    @Column (name = "AccountName")
    private String AccountName;

    @Column (name = "openDate")
    private String openDate;

    @Column (name = "balance")
    private String balance;

    @ManyToOne
    @JoinColumn (name = "cif")
    private Customer customerNumber;

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getAccountName() {
        return AccountName;
    }

    public void setAccountName(String accountName) {
        AccountName = accountName;
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public Customer getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(Customer customerNumber) {
        this.customerNumber = customerNumber;
    }
}
