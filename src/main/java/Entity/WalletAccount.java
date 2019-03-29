package Entity;

import javax.persistence.*;

/**
 * Owned by Naufal Muhammad Ischyros
 */

@Entity(name = "walletaccount")
@Table (name = "walletaccount")
public class WalletAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    @Column (name = "id")
    private int id;

    @ManyToOne
    @JoinColumn (name = "AccountNumber")
    private Account accountNumber;

    @ManyToOne
    @JoinColumn (name = "walletid")
    private Wallet wallet_id;

    @Column (name = "status")
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Account getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Account accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Wallet getWallet_id() {
        return wallet_id;
    }

    public void setWallet_id(Wallet wallet_id) {
        this.wallet_id = wallet_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
