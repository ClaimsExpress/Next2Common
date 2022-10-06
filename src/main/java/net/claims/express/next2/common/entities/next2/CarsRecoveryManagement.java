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

@Data
@Entity
@Table(name = "CARS_RECOVERY_MANAGEMENT")
public class CarsRecoveryManagement extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 7423912756825506152L;

    @Column(name = "REC_MNG_AGREED_AMOUNT")
    private BigDecimal recMngAgreedAmount;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REC_MNG_AGREEMENT_DATE")
    private Date recMngAgreementDate;
    @Column(name = "REC_MNG_AGREEMENT_USER", length = 36)
    private String recMngAgreementUser;
    @Column(name = "REC_MNG_AMOUNT_TO_RECOVER")
    private BigDecimal recMngAmountToRecover;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REC_MNG_CALLED_DATE")
    private Date recMngCalledDate;
    @Column(name = "REC_MNG_CALLED_NAME", length = 200)
    private String recMngCalledName;
    //    @Column(name = "REC_MNG_CAR_ID", length = 36)
    //    private String recMngCarId;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REC_MNG_CLOSED_DATE")
    private Date recMngClosedDate;
    @Column(name = "REC_MNG_CLOSED_NOTE", length = 100)
    private String recMngClosedNote;
    @Column(name = "REC_MNG_CLOSED_USER", length = 36)
    private String recMngClosedUser;
    @Column(name = "REC_MNG_ESTIMATED_AMOUNT")
    private BigDecimal recMngEstimatedAmount;
    @Column(name = "REC_MNG_ESTIMATED_USER", length = 36)
    private String recMngEstimatedUser;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REC_MNG_EXP_PAY_DATE")
    private Date recMngExpPayDate;
    @Id
    @Column(name = "REC_MNG_ID", length = 36)
    private String recMngId;
    //    @Column(name = "REC_MNG_INSURED_ID", length = 36)
    //    private String recMngInsuredId;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REC_MNG_LETTER_DATE")
    private Date recMngLetterDate;
    @Column(name = "REC_MNG_LETTER_EXIST", length = 1)
    private String recMngLetterExist;
    @Column(name = "REC_MNG_LETTER_USER", length = 36)
    private String recMngLetterUser;
    @Column(name = "REC_MNG_NOT_APPR_BY_TP_COMPANY", length = 1)
    private String recMngNotApprByTpCompany;
    @Column(name = "REC_MNG_NOT_APPR_BY_TP_USER", length = 36)
    private String recMngNotApprByTpUser;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REC_MNG_NOT_APPR_TP_COMP_DATE")
    private Date recMngNotApprTpCompDate;
    @Column(name = "REC_MNG_NOTES", length = 4000)
    private String recMngNotes;
    @Column(name = "REC_MNG_PAYMENT_NOTE", length = 300)
    private String recMngPaymentNote;
    @Column(name = "REC_MNG_PREPARED", length = 1)
    private String recMngPrepared;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REC_MNG_PREPARED_DATE")
    private Date recMngPreparedDate;
    @Column(name = "REC_MNG_PREPARED_USER", length = 36)
    private String recMngPreparedUser;
    @Column(name = "REC_MNG_RECOVERED_NOTES", length = 4000)
    private String recMngRecoveredNotes;
    @Column(name = "REC_MNG_RECOVERY_STATUS", length = 36)
    private String recMngRecoveryStatus;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REC_MNG_RECOVERY_STATUS_DATE")
    private Date recMngRecoveryStatusDate;
    @Column(name = "REC_MNG_RECOVERY_STATUS_USER", length = 36)
    private String recMngRecoveryStatusUser;
    @Column(name = "REC_MNG_REPRESENTANT_NAME", length = 400)
    private String recMngRepresentantName;
    @Column(name = "REC_MNG_SALVAGE_VALUE")
    private BigDecimal recMngSalvageValue;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REC_MNG_SENT_TO_TP_COMP_DATE")
    private Date recMngSentToTpCompDate;
    @Column(name = "REC_MNG_SENT_TO_TP_COMPANY", length = 1)
    private String recMngSentToTpCompany;
    @Column(name = "REC_MNG_SENT_TP_COMPANY_USER", length = 36)
    private String recMngSentTpCompanyUser;
    @Column(name = "REC_MNG_STATUS", length = 2)
    private String recMngStatus;
    @Column(name = "REC_MNG_STATUS_USER", length = 36)
    private String recMngStatusUser;
    @Column(name = "REC_MNG_TYPE_OF_CASE", length = 5)
    private String recMngTypeOfCase;
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

    @Column(name = "REC_MNG_INS_COMPANY_ID", length = 36)
    private String recMngInsCompanyId;

    @Column(name = "REC_MNG_TP_COMPANY_ID", length = 36)
    private String recMngTpCompanyId;

    @Column(name = "REC_MNG_NOTIFICATION", length = 36)
    private String recMngNotification;

    @Column(name = "REC_MNG_INS_VEHINV")
    private BigDecimal recMngInsVehinv;

    @Column(name = "REC_MNG_TP_VEHINV")
    private BigDecimal recMngTpVehinv;

    @Column(name = "REC_MNG_INS_COMPANY", length = 1000)
    private String recMngInsCompany;

    @Column(name = "REC_MNG_INS_NAME", length = 1000)
    private String recMngInsName;

    @Column(name = "REC_MNG_INS_PLATE", length = 1000)
    private String recMngInsPlate;

    @Column(name = "REC_MNG_INS_POLICY", length = 1000)
    private String recMngInsPolicy;

    @Column(name = "REC_MNG_TP_NAME", length = 1000)
    private String recMngTpName;

    @Column(name = "REC_MNG_TP_PLATE", length = 1000)
    private String recMngTpPlat;

    @Column(name = "REC_MNG_TP_POLICY", length = 1000)
    private String recMngTpPolicy;

    @Column(name = "REC_MNG_TP_COMPANY", length = 1000)
    private String recMngTpCompany;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REC_MNG_ACCIDENT_DATE")
    private Date recMngAccidentDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REC_MNG_PAYMENT_DATE")
    private Date recMngPaymentDate;

    @Column(name = "REC_MNG_TP_RESPONSIBILITY")
    private BigDecimal recMngTpResp;

    @Column(name = "REC_MNG_PAID_AMOUNT")
    private BigDecimal recMngPaidAmmount;

    @Column(name = "REC_MNG_AMOUNT_PAID_TO_TP")
    private BigDecimal recMngAmountPaidToTp;

    @Column(name = "REC_MNG_RECOVERED_AMOUNT1")
    private BigDecimal recMngRecoveredAmount1;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REC_MNG_RECOVEREY_DATE1")
    private Date recMngRecoveryDate1;

    @Column(name = "REC_MNG_RECOVERED_AMOUNT2")
    private BigDecimal recMngRecoveredAmount2;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REC_MNG_RECOVEREY_DATE2")
    private Date recMngRecoveryDate2;

    @Column(name = "REC_MNG_RECOVERED_AMOUNT3")
    private BigDecimal recMngRecoveredAmount3;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REC_MNG_RECOVEREY_DATE3")
    private Date recMngRecoveryDate3;

    @Column(name = "REC_MNG_RELATED_NOTIFICATION", length = 36)
    private String recMngRelatedNotification;

    @Column(name = "REC_MNG_AMOUNT_ESTIMATION_TP")
    private BigDecimal recMngAmountEstimationTp;

    @Column(name = "REC_MNG_AMOUNT_DUE_TO_TP")
    private BigDecimal recMngAmountDueToTp;

    @Column(name = "REC_MNG_BODILY_INJURY_EXIST", length = 36)
    private String recMngBodilyInjuryExist;

    @Column(name = "REC_MNG_DEDUCTIBLE")
    private BigDecimal recMngDeductible;

    @Column(name = "REC_MNG_NOT_DUE")
    private BigDecimal recMngNotDue;

    @Column(name = "REC_MNG_3_MORE_VEHICLES")
    private BigDecimal recMng3MoreVehicles;

    @Column(name = "REC_MNG_TP_DRIVER_PHONE", length = 1000)
    private String recMngTpDriverPhone;

    @Column(name = "REC_MNG_TP_PHONE", length = 1000)
    private String recMngTpPhone;

    @Column(name = "REC_MNG_SPLITED", length = 1000)
    private String recMngSplited;

    @Column(name = "REC_MNG_RECOVERED_NOTIFICATION", length = 36)
    private String recMngRecoveredNotification;

    @Column(name = "REC_MNG_SENT_TO_INS_COMPANY", length = 1000)
    private String recMngSentToInsCompany;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REC_MNG_SENT_TO_INS_COMP_DATE")
    private Date recMngSentToInsCompanyDate;

    @Column(name = "REC_MNG_REQUEST_BILLS", length = 36)
    private String recMngRequestedBills;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REC_MNG_REQUEST_BILLS_DATE")
    private Date recMngRequestedBillsDate;

    @Column(name = "REC_MNG_REQUEST_EXP_REPORT", length = 36)
    private String recMngRequestedExpReport;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REC_MNG_REQUEST_EXP_REP_DATE")
    private Date recMngRequestedExpRepDate;

    @Column(name = "REC_MNG_REQUEST_OTHERS", length = 36)
    private String recMngRequestedOthers;

    @Column(name = "REC_MNG_REQUEST_SUBBROGATION", length = 36)
    private String recMngRequestedSubbrogation;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REC_MNG_REQUEST_SUBB_DATE")
    private Date recMngRequestedSubbDate;

    @Column(name = "REC_MNG_INS_VEH_ASSESSMENT")
    private BigDecimal recMngInsVehAsses;

    @Column(name = "REC_MNG_PAYMENT_MODE", length = 1000)
    private String recMngPaymentMode;

    @Column(name = "REC_MNG_PRINT_NOTES", length = 4000)
    private String recMngPrintNotes;

    @Column(name = "REC_MNG_RECEIVED_BILLS", length = 36)
    private String recMngReceivedBills;

    @Column(name = "REC_MNG_RECEIVED_EXP_REP", length = 36)
    private String recMngReceivedExpRep;

    @Column(name = "REC_MNG_RECEIVED_OTHERS", length = 36)
    private String recMngReveivedOthers;

    @Column(name = "REC_MNG_RECEIVED_SUBBROGATION", length = 36)
    private String recMngReceivedSubbrogation;

    @Column(name = "REC_MNG_CLOSING_NOTE2", length = 100)
    private String recMngClosingNote2;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REC_MNG_REOPEN_DATE")
    private Date recMngReaopenDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REC_MNG_CLOSING_DATE2")
    private Date recMngClosingDate2;


    @Transient
    private String recoveryStatusPrepared;
    @Transient
    private String recoveryStatusSentToTP;
    @Transient
    private String recoveryStatusNotApp;
    @Transient
    private String recoveryRepairShop;
    @Transient
    private String recoveryType;
    @ManyToOne
    @JoinColumn(name = "REC_MNG_CAR_ID")
    private CarsLossCar carsLossCar;

    @ManyToOne
    @JoinColumn(name = "REC_MNG_INSURED_ID")
    private CarsLossCar carsLossCarInsured;

    @ManyToOne
    @JoinColumn(name = "REC_MNG_INJURED_ID")
    private CarsBodilyInjury carsBodilyInjury;

    @Transient
    private String notificationId;

    @Transient
    private String carBrandTrademark;

    @Transient
    private String statusDescription;

    @Transient
    private String carBrandTrademarkDirect;

    @Transient
    private String claimNumber;

    @Transient
    private String recMngStatusDesc;

    @Transient
    private String importDate;


}
