package net.claims.express.next2.common.entities.next2;

import lombok.Data;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "CARS_RES_PAY_DELETED")
@Data
public class CarsResPayDeleted implements Serializable {
    private static final long serialVersionUID = 4218790752401894383L;
    @Column(name = "RES_PAY_AMOUNT")
    private BigDecimal resPayAmount;
    @Column(name = "RES_PAY_AMOUNT_COMP")
    private BigDecimal resPayAmountComp;
    @Column(name = "RES_PAY_AMOUNT_COMP_LL")
    private BigDecimal resPayAmountCompLl;
    @Column(name = "RES_PAY_AMOUNT_COMP_USD")
    private BigDecimal resPayAmountCompUsd;
    @Column(name = "RES_PAY_AMOUNT_LL")
    private BigDecimal resPayAmountLl;
    @Column(name = "RES_PAY_AMOUNT_USD")
    private BigDecimal resPayAmountUsd;
    @Column(name = "RES_PAY_BODILY_ID", length = 36)
    private String resPayBodilyId;
    @Column(name = "RES_PAY_BRANCH_ID", length = 36)
    private String resPayBranchId;
    @Column(name = "RES_PAY_BROKER_ID", length = 36)
    private String resPayBrokerId;
    @Column(name = "RES_PAY_CAR_ID", length = 36)
    private String resPayCarId;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "RES_PAY_CHECK_DATE")
    private Date resPayCheckDate;
    @Column(name = "RES_PAY_CHECK_FLAG", length = 1)
    private String resPayCheckFlag;
    @Column(name = "RES_PAY_CHECK_NUM")
    private BigDecimal resPayCheckNum;
    @Column(name = "RES_PAY_CHECK_SEQ_NO")
    private BigDecimal resPayCheckSeqNo;
    @Column(name = "RES_PAY_COVER_ID", length = 36)
    private String resPayCoverId;
    @Column(name = "RES_PAY_CURRENCY", length = 3)
    private String resPayCurrency;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "RES_PAY_DATE")
    private Date resPayDate;
    @Id
    @Column(name = "RES_PAY_ID", nullable = false, length = 36)
    private String resPayId;
    @Column(name = "RES_PAY_INFO_ID", length = 36)
    private String resPayInfoId;
    @Column(name = "RES_PAY_LEDGER", length = 15)
    private String resPayLedger;
    @Column(name = "RES_PAY_MATERIAL_ID", length = 36)
    private String resPayMaterialId;
    @Column(name = "RES_PAY_PAID_TO_NAME", length = 105)
    private String resPayPaidToName;
    @Column(name = "RES_PAY_PERCENT", length = 1)
    private String resPayPercent;
    @Column(name = "RES_PAY_PM", length = 10)
    private String resPayPm;
    @Column(name = "RES_PAY_PRIORITY", length = 2)
    private String resPayPriority;
    @Column(name = "RES_PAY_RATE")
    private BigDecimal resPayRate;
    @Column(name = "RES_PAY_REF02", length = 2)
    private String resPayRef02;
    @Column(name = "RES_PAY_REMARKS", length = 1000)
    private String resPayRemarks;
    @Column(name = "RES_PAY_REQUESTER", length = 100)
    private String resPayRequester;
    @Column(name = "RES_PAY_RISK", length = 6)
    private String resPayRisk;
    @Column(name = "RES_PAY_SEQUENCE")
    private BigDecimal resPaySequence;
    @Column(name = "RES_PAY_SITUATION", length = 1)
    private String resPaySituation;
    @Column(name = "RES_PAY_SORT", length = 6)
    private String resPaySort;
    @Column(name = "RES_PAY_STATUS", length = 1)
    private String resPayStatus;
    @Column(name = "RES_PAY_SUPPLIER", length = 100)
    private String resPaySupplier;
    @Column(name = "RES_PAY_SUPPLIER_ID", length = 36)
    private String resPaySupplierId;
    @Column(name = "RES_PAY_TP")
    private BigDecimal resPayTp;
    @Column(name = "RES_PAY_TP_ID", length = 36)
    private String resPayTpId;
    @Column(name = "RES_PAY_TP_REF", length = 16)
    private String resPayTpRef;
    @Column(name = "RES_PAY_TRANSACTION_ID", length = 36)
    private String resPayTransactionId;
    @Column(name = "RES_PAY_APPLY_IND_AMOUNT", length = 1)
    private String resPayApplyIndAmount;
    @Column(name = "RES_PAY_RECOVERY_TYPE", length = 36)
    private String resPayRecoveryType;
    @Column(name = "SYS_CREATED_BY", nullable = false, length = 36)
    private String sysCreatedBy;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "SYS_CREATED_DATE", nullable = false)
    private Date sysCreatedDate;
    @Column(name = "SYS_UPDATED_BY", nullable = false, length = 36)
    private String sysUpdatedBy;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "SYS_UPDATED_DATE", nullable = false)
    private Date sysUpdatedDate;
    @Column(name = "SYS_VERSION_NUMBER", nullable = false)
    private Long sysVersionNumber;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TIME_DELETED")
    private Date timeDeleted;
    @Column(name = "USER_DELETED", length = 36)
    private String userDeleted;
 
    
    @Column(name = "RES_PAY_TRANSFER", length = 36)
    private String resPayTransfer;
    
    @Column(name = "RES_PAY_SEND_TO_RECOVERY", length = 1)
    private String resPaySendToRecovery;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "RES_PAY_SEND_TO_RECOVERY_DATE")
    private Date resPaySendToRecoveryDate;
    
    @Column(name = "RES_PAY_SEND_TO_RECOVERY_USER", length = 36)
    private String resPaySendToRecoveryUser;
        
    @Transient
    private String riskDesc;
      
    @Transient
    private String transDesc;
    
    @Transient
    private String createdFullName;
     
    @Transient
    private String updatedFullName;
    
    @Transient
    private String userDeletedFullName;
    
    @Column(name = "RES_PAY_PAYMENT_TYPE", length = 1)
    private String resPayPaymentType;
    
    @Column(name = "RES_PAY_DELETE_REASON", length = 36)
    private String resPayDeleteReason;

    public CarsResPayDeleted() {
    }


}
