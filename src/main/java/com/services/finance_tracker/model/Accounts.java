@Entity
@Table(schema="public", name = "accounts")
public class Accounts {
    private Long accountId;
    private Long userId;
    private String accountName;
    private String AccountType;
    private Long accountLimt;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    @Column(name = "user_id")
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }   

    @Column(name = "account_name")
    public String getAccountName() {
        return accountName;
    }   
    
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Column(name = "account_type")
    public String getAccountType() {
        return accountType;
    }                   

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Column(name = "account_limit")
    public Long getAccountLimit() {
        return accountLimit;
    }

    public void setAccountLimit(Long accountLimit) {
        this.accountLimit = accountLimit;
    }
    
}
