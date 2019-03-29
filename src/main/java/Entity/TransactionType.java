package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Owned by Naufal Muhammad Ischyros
 */

@Entity (name = "transactiontype")
@Table (name = "transactiontype")
public class TransactionType {

    @Id
    @Column (name = "code")
    private String code;

    @Column (name = "description")
    private String description;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
