package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Owned by Naufal Muhammad Ischyros
 */

@Entity (name = "wallet")
@Table (name = "wallet")
public class Wallet {

    @Id
    @Column (name = "walletid")
    private String walletid;

    @Column (name = "description")
    private String description;

    @Column (name = "customerNumber")
    private String customerNumber;

    @Column (name = "createDate")
    private String createDate;

    public String getWalletid() {
        return walletid;
    }

    public void setWalletid(String walletid) {
        this.walletid = walletid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

}
