package net.claims.express.next2.common.entities.next2;

import lombok.Data;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Date;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Data
@Table(name = "CARS_REPLACEMENT_CAR_RULES")
public class CarsReplacementCarRules implements Serializable {
    private static final long serialVersionUID = 135554159634030831L;
    @Id
    @Column(name = "REPL_CAR_RULE_ID", nullable = false, length = 36)
    private String replCarRuleId;
    @Temporal(TemporalType.DATE)
    @Column(name = "REPL_FROM_DATE")
    private Date replFromDate;
    @Column(name = "REPL_MAX_COST_CLAIM")
    private BigDecimal replMaxCostClaim;
    @Column(name = "REPL_MAX_COST_DAY")
    private BigDecimal replMaxCostDay;
    @Column(name = "REPL_MAX_COST_YEAR")
    private BigDecimal replMaxCostYear;
    @Column(name = "REPL_MAX_DAYS_YEAR")
    private BigDecimal replMaxDaysYear;
    @Column(name = "REPL_NBR_DAYS_CLAIM")
    private BigDecimal replNbrDaysClaim;
    @Column(name = "REPL_NBR_DAYS_DED_CLAIM")
    private BigDecimal replNbrDaysDedClaim;
//    @Column(name = "REPL_PRODUCT_ID", length = 36)
//    private String replProductId;
    @Temporal(TemporalType.DATE)
    @Column(name = "REPL_TO_DATE")
    private Date replToDate;
    @Column(name = "SYS_CREATED_BY", nullable = false, length = 36)
    private String sysCreatedBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "SYS_CREATED_DATE", nullable = false)
    private Date sysCreatedDate;
    @Column(name = "SYS_UPDATED_BY", nullable = false, length = 36)
    private String sysUpdatedBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "SYS_UPDATED_DATE", nullable = false)
    private Date sysUpdatedDate;
    @Column(name = "SYS_VERSION_NUMBER", nullable = false)
    private Long sysVersionNumber;
    
    @ManyToOne
    @JoinColumn(name = "REPL_PRODUCT_ID")
    private CarsProducts carsProducts;


    public CarsReplacementCarRules() {
        replCarRuleId = UUID.randomUUID().toString();
    }

   


}
