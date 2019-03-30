package Entity;

import javax.persistence.*;
import java.util.Calendar;

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

    @Temporal(TemporalType.TIMESTAMP)
    @Column (name = "openDate")
    private Calendar openDate;

    @Column (name = "balance")
    private int balance;

    @ManyToOne
    @JoinColumn (name = "customerNumber")
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

    public Calendar getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Calendar openDate) {
        this.openDate = openDate;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Customer getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(Customer customerNumber) {
        this.customerNumber = customerNumber;
    }

}
