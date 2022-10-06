package net.claims.express.next2.common.entities.next2;

import java.io.Serializable;

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
@NamedQueries({ @NamedQuery(name = "CarsTotallossUser.findAll", query = "select o from CarsTotallossUser o") })
@Table(name = "CARS_TOTALLOSS_USER")
public class CarsTotallossUser implements Serializable {
    private static final long serialVersionUID = 7229855541513516459L;
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
    @Column(name = "TOTALLOSS_USER_ACTIVE", length = 1)
    private String totallossUserActive;
    @Column(name = "TOTALLOSS_USER_CODE", length = 36)
    private String totallossUserCode;
    @Column(name = "TOTALLOSS_USER_CONTACT_ADDRESS", length = 36)
    private String totallossUserContactAddress;
    @Column(name = "TOTALLOSS_USER_CONTACT_MOBILE", length = 36)
    private String totallossUserContactMobile;
    @Column(name = "TOTALLOSS_USER_CONTACT_NAME", length = 36)
    private String totallossUserContactName;
    @Column(name = "TOTALLOSS_USER_CONTACT_PHONE", length = 36)
    private String totallossUserContactPhone;
    @Column(name = "TOTALLOSS_USER_CREDITCARD_EXPI", length = 36)
    private String totallossUserCreditcardExpi;
    @Column(name = "TOTALLOSS_USER_CREDITCARD_NUM", length = 200)
    private String totallossUserCreditcardNum;
    @Column(name = "TOTALLOSS_USER_CREDITCARD_NUM3", length = 200)
    private String totallossUserCreditcardNum3;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TOTALLOSS_USER_DATE")
    private Date totallossUserDate;
    @Id
    @Column(name = "TOTALLOSS_USER_ID", nullable = false, length = 36)
    private String totallossUserId;
    //    @Column(name = "TOTALLOSS_USER_INSURANCE_ID", length = 36)
    //    private String totallossUserInsuranceId;
    @ManyToOne
    @JoinColumn(name = "TOTALLOSS_USER_INSURANCE_ID")
    private CarsInsurance carsInsurance;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TOTALLOSS_USER_SMS_SENT_DATE")
    private Date totallossUserSmsSentDate;
    @Column(name = "TOTALLOSS_USER_SUPPLIER_ID", length = 36)
    private String totallossUserSupplierId;
    @Column(name = "TOTALLOSS_USER_VERIFY_CODE", length = 36)
    private String totallossUserVerifyCode;
    
    @Transient
    private String activeUser;

    public CarsTotallossUser() {
        totallossUserId = UUID.randomUUID().toString();
    }


}
