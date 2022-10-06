package net.claims.express.next2.common.entities.next2;

import core.adf.accelerator.model.basics.BaseEntity;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Date;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "CARS_SERVICE_FOLLOW_UP")
public class CarsServiceFollowUp implements Serializable {
    private static final long serialVersionUID = 5355965608390583132L;
    @Temporal(TemporalType.DATE)
    @Column(name = "FU_ARRIVAL_TO_GAR")
    private Date fuArrivalToGar;
    @Column(name = "FU_EMAIL", length = 100)
    private String fuEmail;
    @Temporal(TemporalType.DATE)
    @Column(name = "FU_END_TIME")
    private Date fuEndTime;
    @Column(name = "FU_GARAGE_ID", length = 36)
    private String fuGarageId;
    @Column(name = "FU_GAR_PHONE", length = 100)
    private String fuGarPhone;
    @Column(name = "FU_HOME_ADDRESS", length = 500)
    private String fuHomeAddress;
    @Id
    @Column(name = "FU_ID", nullable = false, length = 36)
    private String fuId;
    @Column(name = "FU_MOBILE", length = 50)
    private String fuMobile;
    @Column(name = "FU_MOBILE2", length = 50)
    private String fuMobile2;
    @Column(name = "FU_NOTIFICATION_ID", length = 36)
    private String fuNotificationId;
    @Column(name = "FU_PICKUP_ADDRESS", length = 500)
    private String fuPickupAddress;
    @Temporal(TemporalType.DATE)
    @Column(name = "FU_PROMIS_DELIVERY")
    private Date fuPromisDelivery;
    @Temporal(TemporalType.DATE)
    @Column(name = "FU_PROMIS_PICK_UP_TIME")
    private Date fuPromisPickUpTime;
    @Temporal(TemporalType.DATE)
    @Column(name = "FU_REAL_DELIVERY")
    private Date fuRealDelivery;
    @Temporal(TemporalType.DATE)
    @Column(name = "FU_REAL_PICK_UP_TIME")
    private Date fuRealPickUpTime;
    @Column(name = "FU_REGION", length = 100)
    private String fuRegion;
    @Column(name = "FU_SERVICE", length = 36)
    private String fuService;
    @Column(name = "FU_SERV_LINE", nullable = false)
    private BigDecimal fuServLine;
    @Temporal(TemporalType.DATE)
    @Column(name = "FU_SIGNATURE_TIME")
    private Date fuSignatureTime;
    @Temporal(TemporalType.DATE)
    @Column(name = "FU_START_TIME")
    private Date fuStartTime;
    @Temporal(TemporalType.DATE)
    @Column(name = "TIME_STAMP")
    private Date timeStamp;
    @Column(name = "USER_ID", length = 36)
    private String userId;

    public CarsServiceFollowUp() {
        fuId = UUID.randomUUID().toString();
    }

   

}
