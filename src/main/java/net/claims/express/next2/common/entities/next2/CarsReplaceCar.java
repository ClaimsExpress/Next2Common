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
import javax.persistence.Version;


@Entity
@Data
@Table(name = "CARS_REPLACE_CAR")
public class CarsReplaceCar implements Serializable {

    @Id
    @Column(name = "REPLACE_CAR_ID", nullable = false, length = 36)
    private String replaceCarId;

    @Column(name = "REPLACE_CAR_DESC", length = 2000)
    private String replaceCarDesc;

    @Column(name = "REPLACE_CAR_DRIVER_NAME", length = 500)
    private String replaceCarDriverName;

    @Column(name = "REPLACE_CAR_DRIVER_PHONE", length = 200)
    private String replaceCarDriverPhone;

    @Column(name = "REPLACE_CAR_EMAIL_FROM", length = 2000)
    private String replaceCarEmailFrom;

    @Column(name = "REPLACE_CAR_EMAIL_SENT_BY", length = 400)
    private String replaceCarEmailSentBy;

    @Temporal(TemporalType.DATE)
    @Column(name = "REPLACE_CAR_EMAIL_SENT_ON")
    private Date replaceCarEmailSentOn;

    @Column(name = "REPLACE_CAR_EMAIL_SIG", length = 4000)
    private String replaceCarEmailSig;

    @Column(name = "REPLACE_CAR_EMAIL_TO", length = 2000)
    private String replaceCarEmailTo;

    @Temporal(TemporalType.DATE)
    @Column(name = "REPLACE_CAR_END_DATE")
    private Date replaceCarEndDate;

    @Column(name = "REPLACE_CAR_GARAGE_ADDRESS", length = 2000)
    private String replaceCarGarageAddress;

    @Column(name = "REPLACE_CAR_GARAGE_NAME", length = 2000)
    private String replaceCarGarageName;

    @Column(name = "REPLACE_CAR_GARAGE_PHONE", length = 2000)
    private String replaceCarGaragePhone;

    @Column(name = "REPLACE_CAR_NOTES", length = 4000)
    private String replaceCarNotes;

    @Column(name = "REPLACE_CAR_NO_DAYS")
    private BigDecimal replaceCarNoDays;

    @Column(name = "REPLACE_CAR_PAID_AMOUNT_USD")
    private BigDecimal replaceCarPaidAmountUSD;


    @Column(name = "REPLACE_CAR_REQUEST_BY", length = 2000)
    private String replaceCarRequestBy;

    @Temporal(TemporalType.DATE)
    @Column(name = "REPLACE_CAR_REQUEST_DATE")
    private Date replaceCarRequestDate;

    @Column(name = "REPLACE_CAR_REQUEST_NO_DAYS")
    private BigDecimal replaceCarRequestNoDays;

    @Column(name = "REPLACE_CAR_REQUEST_TO", length = 2000)
    private String replaceCarRequestTo;

    @Column(name = "REPLACE_CAR_REQUEST_TO_MR", length = 2000)
    private String replaceCarRequestToMr;

    @Temporal(TemporalType.DATE)
    @Column(name = "REPLACE_CAR_START_DATE")
    private Date replaceCarStartDate;

    @Column(name = "REPLACE_CAR_VIP_CARD", length = 2000)
    private String replaceCarVipCard;

    @ManyToOne
    @JoinColumn(name = "REPLACE_CAR_NOTIFICATION_ID")
    private CarsNotification carsNotification;

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
    private Long sysVersionNumber = 0L;



}
