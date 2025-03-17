
@Entity
@Table(schema = "public", name = "transactions")
public class Transactions {
    private Long transactionId;
    private Long userId;
    private Long accountId;
    private Long categoryId;
    private Long amount;
    private String transactionType;
    private Timestamp createdAt;

    @Id
    @GeneratedValue(startegy = GenerationType.Entity)
    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }
    
    @Column(name = "user_id")
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {    
        this.userId = userId;
    }

    @Column(name = "account_id")
    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }
    
    @Column(name = "category_id")
    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {    
        this.categoryId = categoryId;
    }

    @Column(name = "amount")
    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
    
    @Column(name = "transaction_type")
    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {    
        this.transactionType = transactionType;
    }

    @Column(name = "created_at")
    public Timestamp getCreatedAt() {
        return createdAt;
    }   

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
