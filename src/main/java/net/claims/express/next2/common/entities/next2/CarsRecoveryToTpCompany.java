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
@Table(name = "CARS_RECOVERY_TO_TP_COMPANY")
public class CarsRecoveryToTpCompany extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 7083618982259664322L;
    @Column(name = "REC_AMOUNT_TO_PAY_TO_TP")
    private BigDecimal recAmountToPayToTp;
    @Column(name = "REC_INS_DAMAGES", length = 4000)
    private String recInsDamages;
    @Column(name = "REC_INSURED_ID", length = 36)
    private String recInsuredId;
    @Column(name = "REC_NOTES", length = 4000)
    private String recNotes;
    @Column(name = "REC_RESP_VALIDATION", length = 1)
    private String recRespValidation;
    @Temporal(TemporalType.DATE)
    @Column(name = "REC_RESP_VALIDATION_DATE")
    private Date recRespValidationDate;
    @Column(name = "REC_RESP_VALIDATION_USER", length = 36)
    private String recRespValidationUser;
    @Column(name = "REC_TP_AGREEMENT_AMOUNT")
    private BigDecimal recTpAgreementAmount;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REC_TP_AGREEMENT_DATE")
    private Date recTpAgreementDate;
    @Column(name = "REC_TP_AGREEMENT_NOTE", length = 400)
    private String recTpAgreementNote;
    @Column(name = "REC_TP_AGREEMENT_USER", length = 36)
    private String recTpAgreementUser;
    //    @Column(name = "REC_TP_CAR_ID", length = 36)
//    private String recTpCarId;
    @Column(name = "REC_TP_CHECK_ASSESSMENT", length = 1)
    private String recTpCheckAssessment;
    @Temporal(TemporalType.DATE)
    @Column(name = "REC_TP_CHECK_ASSESSMENT_DATE")
    private Date recTpCheckAssessmentDate;
    @Column(name = "REC_TP_CHECK_USER", length = 36)
    private String recTpCheckUser;
    @Column(name = "REC_TP_CLAIMNUMBER", length = 100)
    private String recTpClaimnumber;
    @Column(name = "REC_TP_DAMAGES", length = 4000)
    private String recTpDamages;
    @Temporal(TemporalType.DATE)
    @Column(name = "REC_TP_DAMAGES_DATE")
    private Date recTpDamagesDate;
    @Column(name = "REC_TP_DAMAGES_NET_VALUE")
    private BigDecimal recTpDamagesNetValue;
    @Column(name = "REC_TP_DAMAGES_NOTES", length = 4000)
    private String recTpDamagesNotes;
    @Column(name = "REC_TP_DAMAGES_PERC")
    private BigDecimal recTpDamagesPerc;
    @Column(name = "REC_TP_DAMAGES_VALUE")
    private BigDecimal recTpDamagesValue;
    @Column(name = "REC_TP_ESTIMATION_AMOUNT")
    private BigDecimal recTpEstimationAmount;
    @Temporal(TemporalType.DATE)
    @Column(name = "REC_TP_EXPECTED_PAYMENT_DATE")
    private Date recTpExpectedPaymentDate;
    //    @Column(name = "REC_TP_EXPERT_ID", length = 36)
//    private String recTpExpertId;
    @Temporal(TemporalType.DATE)
    @Column(name = "REC_TP_EXPERT_RECEIVED_DATE")
    private Date recTpExpertReceivedDate;
    @Column(name = "REC_TP_EXPERT_RECEIVED_USER", length = 36)
    private String recTpExpertReceivedUser;
    @Id
    @Column(name = "REC_TP_ID", length = 36)
    private String recTpId;
    @Column(name = "REC_TP_REQ_ASSESSMENT", length = 1)
    private String recTpReqAssessment;
    @Temporal(TemporalType.DATE)
    @Column(name = "REC_TP_REQ_ASSESSMENT_DATE")
    private Date recTpReqAssessmentDate;
    @Column(name = "REC_TP_REQ_USER", length = 36)
    private String recTpReqUser;
    @Column(name = "REC_TP_RESP")
    private BigDecimal recTpResp;
    @Column(name = "REC_TP_STATUS", length = 36)
    private String recTpStatus;
    @Temporal(TemporalType.DATE)
    @Column(name = "REC_TP_STATUS_DATE")
    private Date recTpStatusDate;
    @Column(name = "REC_TP_STATUS_USER", length = 36)
    private String recTpStatusUser;
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
    @Column(name = "REC_TP_RESP_B")
    private BigDecimal recTpRespB;
    @Column(name = "REC_TP_RESP_C")
    private BigDecimal recTpRespC;
    @Temporal(TemporalType.DATE)
    @Column(name = "REC_TP_REQ_DAMAGES_DATE")
    private Date recTpReqDamagesDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REC_TP_PAY_PAID_DATE")
    private Date recTpPayPaidDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "REC_TP_PAY_DELIVERY_DATE")
    private Date recTpPayDeliveryDate;

    @Column(name = "REC_TP_CONTACT", length = 4000)
    private String recTpContact;


    @ManyToOne
    @JoinColumn(name = "REC_TP_CAR_ID")
    private CarsLossCar carsLossCar;

    @ManyToOne
    @JoinColumn(name = "REC_TP_EXPERT_ID")
    private CarsSupplier carsSupplierExpert;

    @Transient
    private String expert;

    @Transient
    private String tpExpertName;

    @Transient
    private String claimOfficer;
    @Transient
    private String policyType;
    @Transient
    private String reportedDate;
    @Transient
    private String recoveryStatus;

    @Transient
    private String tpInsuranceCompany;


    public CarsRecoveryToTpCompany() {
        recTpId = UUID.randomUUID().toString();
    }

    public void setTpInsuranceCompany(String tpInsuranceCompany) {
        this.tpInsuranceCompany = tpInsuranceCompany;
    }

    public String getTpInsuranceCompany() {
        return tpInsuranceCompany;
    }

    public BigDecimal getRecAmountToPayToTp() {
        return recAmountToPayToTp;
    }

    public void setRecAmountToPayToTp(BigDecimal recAmountToPayToTp) {
        this.recAmountToPayToTp = recAmountToPayToTp;
    }

    public String getRecInsDamages() {
        return recInsDamages;
    }

    public void setRecInsDamages(String recInsDamages) {
        this.recInsDamages = recInsDamages;
    }

    public String getRecInsuredId() {
        return recInsuredId;
    }

    public void setRecInsuredId(String recInsuredId) {
        this.recInsuredId = recInsuredId;
    }

    public String getRecNotes() {
        return recNotes;
    }

    public void setRecNotes(String recNotes) {
        this.recNotes = recNotes;
    }

    public String getRecRespValidation() {
        return recRespValidation;
    }

    public void setRecRespValidation(String recRespValidation) {
        this.recRespValidation = recRespValidation;
    }

    public Date getRecRespValidationDate() {
        return recRespValidationDate;
    }

    public void setRecRespValidationDate(Date recRespValidationDate) {
        this.recRespValidationDate = recRespValidationDate;
    }

    public String getRecRespValidationUser() {
        return recRespValidationUser;
    }

    public void setRecRespValidationUser(String recRespValidationUser) {
        this.recRespValidationUser = recRespValidationUser;
    }

    public BigDecimal getRecTpAgreementAmount() {
        return recTpAgreementAmount;
    }

    public void setRecTpAgreementAmount(BigDecimal recTpAgreementAmount) {
        this.recTpAgreementAmount = recTpAgreementAmount;
    }

    public Date getRecTpAgreementDate() {
        return recTpAgreementDate;
    }

    public void setRecTpAgreementDate(Date recTpAgreementDate) {
        this.recTpAgreementDate = recTpAgreementDate;
    }

    public String getRecTpAgreementNote() {
        return recTpAgreementNote;
    }

    public void setRecTpAgreementNote(String recTpAgreementNote) {
        this.recTpAgreementNote = recTpAgreementNote;
    }

    public String getRecTpAgreementUser() {
        return recTpAgreementUser;
    }

    public void setRecTpAgreementUser(String recTpAgreementUser) {
        this.recTpAgreementUser = recTpAgreementUser;
    }

    public String getRecTpCheckAssessment() {
        return recTpCheckAssessment;
    }

    public void setRecTpCheckAssessment(String recTpCheckAssessment) {
        this.recTpCheckAssessment = recTpCheckAssessment;
    }

    public Date getRecTpCheckAssessmentDate() {
        return recTpCheckAssessmentDate;
    }

    public void setRecTpCheckAssessmentDate(Date recTpCheckAssessmentDate) {
        this.recTpCheckAssessmentDate = recTpCheckAssessmentDate;
    }

    public String getRecTpCheckUser() {
        return recTpCheckUser;
    }

    public void setRecTpCheckUser(String recTpCheckUser) {
        this.recTpCheckUser = recTpCheckUser;
    }

    public String getRecTpClaimnumber() {
        return recTpClaimnumber;
    }

    public void setRecTpClaimnumber(String recTpClaimnumber) {
        this.recTpClaimnumber = recTpClaimnumber;
    }

    public String getRecTpDamages() {
        return recTpDamages;
    }

    public void setRecTpDamages(String recTpDamages) {
        this.recTpDamages = recTpDamages;
    }

    public Date getRecTpDamagesDate() {
        return recTpDamagesDate;
    }

    public void setRecTpDamagesDate(Date recTpDamagesDate) {
        this.recTpDamagesDate = recTpDamagesDate;
    }

    public BigDecimal getRecTpDamagesNetValue() {
        return recTpDamagesNetValue;
    }

    public void setRecTpDamagesNetValue(BigDecimal recTpDamagesNetValue) {
        this.recTpDamagesNetValue = recTpDamagesNetValue;
    }

    public String getRecTpDamagesNotes() {
        return recTpDamagesNotes;
    }

    public void setRecTpDamagesNotes(String recTpDamagesNotes) {
        this.recTpDamagesNotes = recTpDamagesNotes;
    }

    public BigDecimal getRecTpDamagesPerc() {
        return recTpDamagesPerc;
    }

    public void setRecTpDamagesPerc(BigDecimal recTpDamagesPerc) {
        this.recTpDamagesPerc = recTpDamagesPerc;
    }

    public BigDecimal getRecTpDamagesValue() {
        return recTpDamagesValue;
    }

    public void setRecTpDamagesValue(BigDecimal recTpDamagesValue) {
        this.recTpDamagesValue = recTpDamagesValue;
    }

    public BigDecimal getRecTpEstimationAmount() {
        return recTpEstimationAmount;
    }

    public void setRecTpEstimationAmount(BigDecimal recTpEstimationAmount) {
        this.recTpEstimationAmount = recTpEstimationAmount;
    }

    public Date getRecTpExpectedPaymentDate() {
        return recTpExpectedPaymentDate;
    }

    public void setRecTpExpectedPaymentDate(Date recTpExpectedPaymentDate) {
        this.recTpExpectedPaymentDate = recTpExpectedPaymentDate;
    }

    public Date getRecTpExpertReceivedDate() {
        return recTpExpertReceivedDate;
    }

    public void setRecTpExpertReceivedDate(Date recTpExpertReceivedDate) {
        this.recTpExpertReceivedDate = recTpExpertReceivedDate;
    }

    public String getRecTpExpertReceivedUser() {
        return recTpExpertReceivedUser;
    }

    public void setRecTpExpertReceivedUser(String recTpExpertReceivedUser) {
        this.recTpExpertReceivedUser = recTpExpertReceivedUser;
    }

    public String getRecTpId() {
        return recTpId;
    }

    public void setRecTpId(String recTpId) {
        this.recTpId = recTpId;
    }

    public String getRecTpReqAssessment() {
        return recTpReqAssessment;
    }

    public void setRecTpReqAssessment(String recTpReqAssessment) {
        this.recTpReqAssessment = recTpReqAssessment;
    }

    public Date getRecTpReqAssessmentDate() {
        return recTpReqAssessmentDate;
    }

    public void setRecTpReqAssessmentDate(Date recTpReqAssessmentDate) {
        this.recTpReqAssessmentDate = recTpReqAssessmentDate;
    }

    public String getRecTpReqUser() {
        return recTpReqUser;
    }

    public void setRecTpReqUser(String recTpReqUser) {
        this.recTpReqUser = recTpReqUser;
    }

    public BigDecimal getRecTpResp() {
        return recTpResp;
    }

    public void setRecTpResp(BigDecimal recTpResp) {
        this.recTpResp = recTpResp;
    }

    public String getRecTpStatus() {
        return recTpStatus;
    }

    public void setRecTpStatus(String recTpStatus) {
        this.recTpStatus = recTpStatus;
    }

    public Date getRecTpStatusDate() {
        return recTpStatusDate;
    }

    public void setRecTpStatusDate(Date recTpStatusDate) {
        this.recTpStatusDate = recTpStatusDate;
    }

    public String getRecTpStatusUser() {
        return recTpStatusUser;
    }

    public void setRecTpStatusUser(String recTpStatusUser) {
        this.recTpStatusUser = recTpStatusUser;
    }

    public String getSysCreatedBy() {
        return sysCreatedBy;
    }

    public void setSysCreatedBy(String sysCreatedBy) {
        this.sysCreatedBy = sysCreatedBy;
    }

    public Date getSysCreatedDate() {
        return sysCreatedDate;
    }

    public void setSysCreatedDate(Date sysCreatedDate) {
        this.sysCreatedDate = sysCreatedDate;
    }

    public String getSysUpdatedBy() {
        return sysUpdatedBy;
    }

    public void setSysUpdatedBy(String sysUpdatedBy) {
        this.sysUpdatedBy = sysUpdatedBy;
    }

    public Date getSysUpdatedDate() {
        return sysUpdatedDate;
    }

    public void setSysUpdatedDate(Date sysUpdatedDate) {
        this.sysUpdatedDate = sysUpdatedDate;
    }

    public Long getSysVersionNumber() {
        return sysVersionNumber;
    }

    public void setSysVersionNumber(Long sysVersionNumber) {
        this.sysVersionNumber = sysVersionNumber;
    }

    public void setCarsLossCar(CarsLossCar carsLossCar) {
        this.carsLossCar = carsLossCar;
    }

    public CarsLossCar getCarsLossCar() {
        return carsLossCar;
    }

    public void setCarsSupplierExpert(CarsSupplier carsSupplierExpert) {
        this.carsSupplierExpert = carsSupplierExpert;
    }

    public CarsSupplier getCarsSupplierExpert() {
        return carsSupplierExpert;
    }

    public void setRecTpRespB(BigDecimal recTpRespB) {
        this.recTpRespB = recTpRespB;
    }

    public BigDecimal getRecTpRespB() {
        return recTpRespB;
    }

    public void setRecTpRespC(BigDecimal recTpRespC) {
        this.recTpRespC = recTpRespC;
    }

    public BigDecimal getRecTpRespC() {
        return recTpRespC;
    }

    public void setRecTpReqDamagesDate(Date recTpReqDamagesDate) {
        this.recTpReqDamagesDate = recTpReqDamagesDate;
    }

    public Date getRecTpReqDamagesDate() {
        return recTpReqDamagesDate;
    }

    public void setExpert(String expert) {
        this.expert = expert;
    }

    public String getExpert() {
        return expert;
    }

    public void setTpExpertName(String tpExpertName) {
        this.tpExpertName = tpExpertName;
    }

    public String getTpExpertName() {
        if (this.getCarsSupplierExpert() != null && tpExpertName == null) {

            return this.getCarsSupplierExpert().getSupplierName();
        }

        return tpExpertName;
    }

    public void setClaimOfficer(String claimOfficer) {
        this.claimOfficer = claimOfficer;
    }

    public String getClaimOfficer() {
        return claimOfficer;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setReportedDate(String reportedDate) {
        this.reportedDate = reportedDate;
    }

    public String getReportedDate() {
        return reportedDate;
    }

    public void setRecoveryStatus(String recoveryStatus) {
        this.recoveryStatus = recoveryStatus;
    }

    public String getRecoveryStatus() {
        return recoveryStatus;
    }

    public void setRecTpPayPaidDate(Date recTpPayPaidDate) {
        this.recTpPayPaidDate = recTpPayPaidDate;
    }

    public Date getRecTpPayPaidDate() {
        return recTpPayPaidDate;
    }

    public void setRecTpPayDeliveryDate(Date recTpPayDeliveryDate) {
        this.recTpPayDeliveryDate = recTpPayDeliveryDate;
    }

    public Date getRecTpPayDeliveryDate() {
        return recTpPayDeliveryDate;
    }

    public void setRecTpContact(String recTpContact) {
        this.recTpContact = recTpContact;
    }

    public String getRecTpContact() {
        return recTpContact;
    }
}
