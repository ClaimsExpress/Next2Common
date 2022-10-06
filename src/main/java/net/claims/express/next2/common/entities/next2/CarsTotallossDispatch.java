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
@Table(name = "CARS_TOTALLOSS_DISPATCH")
public class CarsTotallossDispatch implements Serializable {

    private static final long serialVersionUID = 6853135603542334656L;

   
    @Id
    @Column(name = "TOTALLOSS_DISPATCH_ID", nullable = false, length = 36)
    private String totallossDispatchId;
    @Temporal(TemporalType.DATE)
    @Column(name = "TOTALLOSS_EMAIL_DATE")
    private Date totallossEmailDate;
    @Column(name = "TOTALLOSS_EMAIL_NOTES", length = 3000)
    private String totallossEmailNotes;
    @Column(name = "TOTALLOSS_EMAIL_USER", length = 36)
    private String totallossEmailUser;
    @Column(name = "TOTALLOSS_TOW_ARRIVED", length = 1)
    private String totallossTowArrived;
    @Temporal(TemporalType.DATE)
    @Column(name = "TOTALLOSS_TOW_ARRIVED_DATE")
    private Date totallossTowArrivedDate;
    @Column(name = "TOTALLOSS_TOW_ARRIVED_USER", length = 36)
    private String totallossTowArrivedUser;
    @Column(name = "TOTALLOSS_TOW_CANCELED", length = 1)
    private String totallossTowCanceled;
    @Temporal(TemporalType.DATE)
    @Column(name = "TOTALLOSS_TOW_CANC_DATE")
    private Date totallossTowCancDate;
    @Column(name = "TOTALLOSS_TOW_CANC_USER", length = 36)
    private String totallossTowCancUser;
    @Column(name = "TOTALLOSS_TOW_CONTACT_PERSON", length = 500)
    private String totallossTowContactPerson;
    @Column(name = "TOTALLOSS_TOW_DETAIL", length = 1000)
    private String totallossTowDetail;
    @Temporal(TemporalType.DATE)
    @Column(name = "TOTALLOSS_TOW_DETAIL_DATE")
    private Date totallossTowDetailDate;
    @Column(name = "TOTALLOSS_TOW_DETAIL_USER", length = 36)
    private String totallossTowDetailUser;
    @Column(name = "TOTALLOSS_TOW_DISPATCHED", length = 1)
    private String totallossTowDispatched;
    @Temporal(TemporalType.DATE)
    @Column(name = "TOTALLOSS_TOW_DISPATCHED_DATE")
    private Date totallossTowDispatchedDate;
    @Column(name = "TOTALLOSS_TOW_DISPATCHED_USER", length = 36)
    private String totallossTowDispatchedUser;
    @Column(name = "TOTALLOSS_TOW_FROM_AREA", length = 500)
    private String totallossTowFromArea;
    @Column(name = "TOTALLOSS_TOW_FROM_LOCATION", length = 500)
    private String totallossTowFromLocation;
    @Column(name = "TOTALLOSS_TOW_FROM_RS_DESC", length = 500)
    private String totallossTowFromRsDesc;
    @Column(name = "TOTALLOSS_TOW_NUM")
    private BigDecimal totallossTowNum;
    @Column(name = "TOTALLOSS_TOW_PHONE", length = 100)
    private String totallossTowPhone;
    @Column(name = "TOTALLOSS_TOW_REMINDER", length = 5)
    private String totallossTowReminder;
    @Column(name = "TOTALLOSS_TOW_SHOW", length = 1)
    private String totallossTowShow;
    @Column(name = "TOTALLOSS_TOW_TO_AREA", length = 500)
    private String totallossTowToArea;
    @Column(name = "TOTALLOSS_TOW_TO_FOLLOW", length = 1)
    private String totallossTowToFollow;
    @Column(name = "TOTALLOSS_TOW_TO_FOLLOW_DONE", length = 1)
    private String totallossTowToFollowDone;
    @Column(name = "TOTALLOSS_TOW_TO_LOCATION", length = 500)
    private String totallossTowToLocation;
    @Column(name = "TOTALLOSS_TOW_TO_RS_DESC", length = 500)
    private String totallossTowToRsDesc;
    @ManyToOne
    @JoinColumn(name = "TOTALLOSS_TOW_TO_TOWN_ID")
    private CarsTown carsTown;
    @ManyToOne
    @JoinColumn(name = "TOTALLOSS_TOW_TO_RS_ID")
    private CarsSupplier carsSupplier;
    @ManyToOne
    @JoinColumn(name = "TOTALLOSS_TOW_CAR_ID")
    private CarsLossCar carsLossCar;

    public CarsTotallossDispatch() {
        totallossDispatchId = UUID.randomUUID().toString();
    }



}
