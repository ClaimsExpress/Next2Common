package net.claims.express.next2.common.entities.next2;


import lombok.Data;
import net.claims.express.next2.common.entities.BaseEntity;

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
import javax.persistence.Transient;

@Entity
@Data
@Table(name = "CARS_QUOTATION_HISTORY")
public class CarsQuotationHistory extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 6397200505766970182L;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "QUOTATION_APPROVAL_DATE")
    private Date quotationApprovalDate;
    @Column(name = "QUOTATION_APPROVED_AMOUNT")
    private BigDecimal quotationApprovedAmount;
    @Column(name = "QUOTATION_APPROVED_LABOR")
    private BigDecimal quotationApprovedLabor;
    @Column(name = "QUOTATION_APPROVED_PARTS")
    private BigDecimal quotationApprovedParts;
    @Id
    @Column(name = "QUOTATION_ID", nullable = false, length = 36)
    private String quotationId;
    @Column(name = "QUOTATION_REQUESTED_AMOUNT")
    private BigDecimal quotationRequestedAmount;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "QUOTATION_REQUESTED_DATE")
    private Date quotationRequestedDate;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "QUOTATION_RECEIVED_DATE")
    private Date quotationReceivedDate;
    @Column(name = "QUOTATION_REQUESTED_LABOR")
    private BigDecimal quotationRequestedLabor;
    @Column(name = "QUOTATION_REQUESTED_PART")
    private BigDecimal quotationRequestedPart;
    @Column(name = "QUOTATION_REQUESTED_USER", length = 36)
    private String quotationRequestedUser;
    @Column(name = "QUOTATION_REMARK", length = 500)
    private String quotationRemark;
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
    @ManyToOne
    @JoinColumn(name = "QUOTATION_CAR_ID")
    private CarsLossCar carsLossCar;
    @ManyToOne
    @JoinColumn(name = "QUOTATION_REPAIR_SHOP_ID")
    private CarsSupplier carsSupplier;

    @ManyToOne
    @JoinColumn(name = "QUOTATION_MATERIAL_ID")
    private CarsMaterialDamage carsMaterialDamage;

    @Transient
    private String carsSupplierSupplierName;

    @Transient
    private String carsSupplierPhoneNumber;

    @Transient
    private String approvalExist;

    public CarsQuotationHistory() {
        quotationId = UUID.randomUUID().toString();
    }


}
