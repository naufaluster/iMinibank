package Entity;

import javax.persistence.*;

/**
 * Owned by Naufal Muhammad Ischyros
 */

@Entity (name = "transaction")
@Table (name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    @Column (name = "id")
    private int id;

    @Column (name = "date")
    private String date;

    @Column (name = "accountNumberDebit")
    private String accountNumberDebit;

    @Column (name = "accountNumberCredit")
    private String accountNumberCredit;

    @Column (name = "amount")
    private int amount;

    @Column (name = "transactionType")
    private String transactionType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAccountNumberDebit() {
        return accountNumberDebit;
    }

    public void setAccountNumberDebit(String accountNumberDebit) {
        this.accountNumberDebit = accountNumberDebit;
    }

    public String getAccountNumberCredit() {
        return accountNumberCredit;
    }

    public void setAccountNumberCredit(String accountNumberCredit) {
        this.accountNumberCredit = accountNumberCredit;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
}
