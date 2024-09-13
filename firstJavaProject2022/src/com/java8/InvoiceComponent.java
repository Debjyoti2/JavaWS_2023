package src.com.java8;


import java.math.BigDecimal;

public class InvoiceComponent {

    private Long compId;
    private BigDecimal amount;

    public InvoiceComponent(Long compId, BigDecimal amount) {
        this.compId = compId;
        this.amount = amount;
    }

    public Long getCompId() {
        return compId;
    }

    public void setCompId(Long compId) {
        this.compId = compId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
