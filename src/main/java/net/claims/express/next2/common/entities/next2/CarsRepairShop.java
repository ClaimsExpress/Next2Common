package net.claims.express.next2.common.entities.next2;

import lombok.Data;
import net.claims.express.next2.common.entities.BaseEntity;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Date;

import java.util.Iterator;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Data
@Entity
@Table(name = "CARS_REPAIR_SHOP")
public class CarsRepairShop extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 2509127048524487124L;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "RS_APPROVAL_DATE")
    private Date rsApprovalDate;
    @Column(name = "RS_APPROVAL_USER", length = 36)
    private String rsApprovalUser;
    @Column(name = "RS_APPROVED_AMOUNT")
    private BigDecimal rsApprovedAmount;
    //    @Column(name = "RS_CAR_ID", length = 36)
    //    private String rsCarId;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "RS_DELIVERY_DATE")
    private Date rsDeliveryDate;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "RS_EXPECTED_DELIVERY_DATE")
    private Date rsExpectedDeliveryDate;
    @Column(name = "RS_EXPECTED_NO_OF_DAYS")
    private BigDecimal rsExpectedNoOfDays;
    @Id
    @Column(name = "RS_ID", nullable = false, length = 36)
    private String rsId;
    @Column(name = "RS_INS_REMARKS", length = 2000)
    private String rsInsRemarks;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "RS_RECEIVED_DATE")
    private Date rsReceivedDate;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "RS_RECEPTION_OF_THE_CAR_DATE")
    private Date rsReceptionOfTheCarDate;
    @Column(name = "RS_REMARKS", length = 2000)
    private String rsRemarks;
    //    @Column(name = "RS_REPAIR_SHOP_ID", length = 36)
//    private String rsRepairShopId;
    @Column(name = "RS_REQUESTED_AMOUNT")
    private BigDecimal rsRequestedAmount;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "RS_REQUESTED_ASS_DATE")
    private Date rsRequestedAssDate;
    @Column(name = "RS_REQUESTED_ASS_USER", length = 36)
    private String rsRequestedAssUser;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "RS_REQUESTED_DATE")
    private Date rsRequestedDate;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "RS_REQUESTED_INS_APP_DATE")
    private Date rsRequestedInsAppDate;
    @Column(name = "RS_REQUESTED_INS_APP_USER", length = 36)
    private String rsRequestedInsAppUser;
    @Column(name = "RS_REQUESTED_LABOR")
    private BigDecimal rsRequestedLabor;
    @Column(name = "RS_REQUESTED_PART")
    private BigDecimal rsRequestedPart;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "RS_REQUESTED_RE_ASS_DATE")
    private Date rsRequestedReAssDate;
    @Column(name = "RS_REQUESTED_RE_ASS_REMARKS", length = 2000)
    private String rsRequestedReAssRemarks;
    @Column(name = "RS_REQUESTED_RE_ASS_USER", length = 36)
    private String rsRequestedReAssUser;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "RS_REQUESTED_RESURVEY_DATE")
    private Date rsRequestedResurveyDate;
    @Column(name = "RS_REQUESTED_RESURVEY_REMARKS", length = 2000)
    private String rsRequestedResurveyRemarks;
    @Column(name = "RS_REQUESTED_RESURVEY_USER", length = 36)
    private String rsRequestedResurveyUser;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "RS_REQUESTED_SURVEY_DATE")
    private Date rsRequestedSurveyDate;
    @Column(name = "RS_REQUESTED_SURVEY_REMARKS", length = 2000)
    private String rsRequestedSurveyRemarks;
    @Column(name = "RS_REQUESTED_SURVEY_USER", length = 36)
    private String rsRequestedSurveyUser;
    @Column(name = "RS_REQUESTED_USER", length = 36)
    private String rsRequestedUser;
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
    @JoinColumn(name = "RS_CAR_ID")
    private CarsLossCar carsLossCar;

    @ManyToOne
    @JoinColumn(name = "RS_REPAIR_SHOP_ID")
    private CarsSupplier carsSupplier;

    public CarsRepairShop() {

        rsId = UUID.randomUUID().toString();
    }


}
