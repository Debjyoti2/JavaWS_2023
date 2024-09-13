package src.com.java8;

import java.math.BigDecimal;

public class ExternalDepo {

    private  Long externalDepoId;
    private Long compId;
    private BigDecimal amount;

    public ExternalDepo(Long externalDepoId, Long compId, BigDecimal amount) {
        this.externalDepoId = externalDepoId;
        this.compId = compId;
        this.amount = amount;
    }

    public Long getExternalDepoId() {
        return externalDepoId;
    }

    public void setExternalDepoId(Long externalDepoId) {
        this.externalDepoId = externalDepoId;
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
