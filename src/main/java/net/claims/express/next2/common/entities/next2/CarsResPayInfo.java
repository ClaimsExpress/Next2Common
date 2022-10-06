package net.claims.express.next2.common.entities.next2;

import core.adf.accelerator.adfm.utils.StringUtils;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;

import lombok.Data;
import net.claimsexpress.claimresolution.model.views.FinancialTypeLovWv;

@Entity
@Data
@Table(name = "CARS_RES_PAY_INFO")
public class CarsResPayInfo implements Serializable {

    private static final long serialVersionUID = -8980653825386175891L;

    @Column(name = "RES_PAY_INFO_AMOUNT", nullable = false)
    private BigDecimal resPayInfoAmount;

    @Column(name = "RES_PAY_INFO_CURRENCY", nullable = false, length = 10)
    private String resPayInfoCurrency;
    @Id
    @Column(name = "RES_PAY_INFO_ID", nullable = false, length = 36)
    private String resPayInfoId;

    @Column(name = "RES_PAY_INFO_MOVED", length = 1)
    private String resPayInfoMoved;
    @Column(name = "RES_PAY_INFO_REMARK", length = 2000)
    private String resPayInfoRemark;
    @Column(name = "RES_PAY_INFO_RISK", nullable = false, length = 20)
    private String resPayInfoRisk;
    @ManyToOne
    @JoinColumn(name = "RES_PAY_INFO_RISK", insertable = false, updatable = false)
    private FinancialTypeLovWv financialTypeLovWv;
    @Column(name = "RES_PAY_INFO_TYPE", length = 1)
    private String resPayInfoType;

    @Column(name = "RES_PAY_INFO_PM")
    private String resPayInfoPm;

    @Temporal(TemporalType.DATE)
    @Column(name = "RES_PAY_INFO_APP_DATE")
    private Date resPayInfoAppDate;

    // @Column(name = "LOG_USER", length = 12)
    @Transient
    private String logUser;
    @Transient
    private String risk;

    //    @Temporal(TemporalType.TIMESTAMP)
    //    @Column(name = "LOG_DATE_TIME")
    @Transient
    private Date logDateTime;

    @ManyToOne
    @JoinColumn(name = "RES_PAY_INFO_MATERIAL_ID")
    private CarsMaterialDamage carsMaterialDamage;
    @ManyToOne
    @JoinColumn(name = "RES_PAY_INFO_BODILY_ID")
    private CarsBodilyInjury carsBodilyInjury;

    @Column(name = "RES_PAY_INFO_PAYEE", length = 250)
    private String resPayInfoPayee;

    @Column(name = "RES_PAY_INFO_COVER_ID", length = 36)
    private String resPayInfoCoverId;

    @ManyToOne
    @JoinColumn(name = "RES_PAY_INFO_CAR_ID")
    private CarsLossCar carsLossCar;

    //    @ManyToOne
    //    @JoinColumn(name = "RES_PAY_INFO_PM")
    //    private ModePayLovWv modePayLovWv;

    @ManyToOne
    @JoinColumn(name = "RES_PAY_INFO_BRANCH_ID")
    private CarsBranch carsBranch;

    @OneToMany(orphanRemoval = true, mappedBy = "carsResPayInfo", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsResPay> carsResPayList;

    @Column(name = "SYS_CREATED_BY", length = 12)
    private String sysCreatedBy;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "SYS_CREATED_DATE")
    private Date sysCreatedDate;
    @Column(name = "SYS_UPDATED_BY", length = 12)
    private String sysUpdatedBy;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "SYS_UPDATED_DATE")
    private Date sysUpdatedDate;

    @Version
    @Column(name = "SYS_VERSION_NUMBER")
    private Long sysVersionNumber = new Long(0);

    @Transient
    private String branchId;

    @Transient
    private CarsSupplier hospitalSupplier;

    @Transient
    private CarsSupplier paymentOtherExpert;

    @Transient
    private CarsSupplier recoveryGarage;

    @Transient
    private String paymentOtherBenef;

    @Transient
    private String recoverySalvageFrom;


    @Transient
    private String matOwner;

    @Transient
    private String riskFinancialId;

    @Transient
    private String resPayTrasnfered;


    @Transient
    private String resPayCoverId;

    @Transient
    private String resPayFinType;

    @Transient
    private String resPayRiskCatego;
    
    @Transient
    private String resPayToRec;
    
    @Transient
    private String resPayPaymentType;
    
    @Transient
    private String recoveryFromName;
    
    @Transient
    private String recoveryFromId;
    
    @Transient
    private String recoveryFromType;
    
    @Transient
    private String applyIndAmount;

    public CarsResPayInfo() {
        resPayInfoId = UUID.randomUUID().toString();
    }



}
