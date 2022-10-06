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
import javax.persistence.Transient;

@Entity
@Data
@Table(name = "CARS_TOTALLOSS_MNG")
public class CarsTotallossMng implements Serializable {

    private static final long serialVersionUID = 6135567788813316089L;

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
    @Column(name = "TOTALLOSS_BID_STATUS", length = 36)
    private String totallossBidStatus;
    @Column(name = "TOTALLOSS_MNG_BUYER", length = 1000)
    private String totallossMngBuyer;
    @Column(name = "TOTALLOSS_MNG_CAR_AREA", length = 500)
    private String totallossMngCarArea;
    @Column(name = "TOTALLOSS_MNG_CAR_LOCATION", length = 500)
    private String totallossMngCarLocation;
    @Column(name = "TOTALLOSS_MNG_CAR_RS_DESC", length = 500)
    private String totallossMngCarRsDesc;
    @Column(name = "TOTALLOSS_MNG_CAR_VALUE")
    private BigDecimal totallossMngCarValue;
    @Column(name = "TOTALLOSS_MNG_CONTACT_PERSON", length = 500)
    private String totallossMngContactPerson;
    @Column(name = "TOTALLOSS_MNG_DED_AND_DEP", length = 1000)
    private String totallossMngDedAndDep;
    @Id
    @Column(name = "TOTALLOSS_MNG_ID", nullable = false, length = 36)
    private String totallossMngId;
    @Column(name = "TOTALLOSS_MNG_MARKET_VALUE")
    private BigDecimal totallossMngMarketValue;
    @Column(name = "TOTALLOSS_MNG_NET_AMOUNT")
    private BigDecimal totallossMngNetAmount;
    @Column(name = "TOTALLOSS_MNG_PHONE", length = 500)
    private String totallossMngPhone;
    @Column(name = "TOTALLOSS_MNG_VEHICLE_STATUS", length = 36)
    private String totallossMngVehicleStatus;
    @Column(name = "TOTALLOSS_MNG_VEHICLE_STATUS_O", length = 500)
    private String totallossMngVehicleStatusO;
    @Column(name = "TOTALLOSS_PACK_IN", length = 50)
    private String totallossPackIn;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TOTALLOSS_PACK_IN_DATE")
    private Date totallossPackInDate;
    @Column(name = "TOTALLOSS_PACK_IN_USER", length = 50)
    private String totallossPackInUser;
    @Column(name = "TOTALLOSS_REGIS_CANCEL", length = 1)
    private String totallossRegisCancel;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TOTALLOSS_REGIS_CANCEL_DATE")
    private Date totallossRegisCancelDate;
    @Column(name = "TOTALLOSS_REGIS_CANCEL_USER", length = 50)
    private String totallossRegisCancelUser;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TOTALLOSS_REGIS_DATE")
    private Date totallossRegisDate;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TOTALLOSS_REGIS_DELIVERY_DATE")
    private Date totallossRegisDeliveryDate;
    @Column(name = "TOTALLOSS_REGIS_DELIVERY_PLACE", length = 1000)
    private String totallossRegisDeliveryPlace;
    @Column(name = "TOTALLOSS_REGIS_DELIVERY_TO", length = 1000)
    private String totallossRegisDeliveryTo;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TOTALLOSS_REGIS_DELIV_DATE")
    private Date totallossRegisDelivDate;
    @Column(name = "TOTALLOSS_REGIS_DELIV_USER", length = 50)
    private String totallossRegisDelivUser;
    @Column(name = "TOTALLOSS_REGIS_DETAILS", length = 1000)
    private String totallossRegisDetails;
    @Column(name = "TOTALLOSS_REGIS_DONE", length = 1)
    private String totallossRegisDone;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TOTALLOSS_REGIS_DONE_DATE")
    private Date totallossRegisDoneDate;
    @Column(name = "TOTALLOSS_REGIS_DONE_USER", length = 50)
    private String totallossRegisDoneUser;
    @Column(name = "TOTALLOSS_REGIS_RESPONSIBLE", length = 1000)
    private String totallossRegisResponsible;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TOTALLOSS_REGIS_TIME_STAMP")
    private Date totallossRegisTimeStamp;
    @Column(name = "TOTALLOSS_REGIS_TODO", length = 1)
    private String totallossRegisTodo;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TOTALLOSS_REGIS_TODO_DATE")
    private Date totallossRegisTodoDate;
    @Column(name = "TOTALLOSS_REGIS_TODO_USER", length = 50)
    private String totallossRegisTodoUser;
    @Column(name = "TOTALLOSS_REGIS_USER", length = 50)
    private String totallossRegisUser;
    @Column(name = "TOTALLOSS_REGIS_WRECKAGE_CERT", length = 100)
    private String totallossRegisWreckageCert;
    @Column(name = "TOTALLOSS_SOLD_AMOUNT")
    private BigDecimal totallossSoldAmount;
    @Column(name = "TOTALLOSS_SOLD_CANCEL", length = 1)
    private String totallossSoldCancel;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TOTALLOSS_SOLD_CANCEL_DATE")
    private Date totallossSoldCancelDate;
    @Column(name = "TOTALLOSS_SOLD_CANCEL_USER", length = 50)
    private String totallossSoldCancelUser;
    @Column(name = "TOTALLOSS_SOLD_CURR", length = 10)
    private String totallossSoldCurr;
    @Column(name = "TOTALLOSS_SOLD_DETAILS", length = 1000)
    private String totallossSoldDetails;
    @Column(name = "TOTALLOSS_SOLD_DONE", length = 1)
    private String totallossSoldDone;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TOTALLOSS_SOLD_DONE_DATE")
    private Date totallossSoldDoneDate;
    @Column(name = "TOTALLOSS_SOLD_DONE_USER", length = 50)
    private String totallossSoldDoneUser;
    @Column(name = "TOTALLOSS_SOLD_TODO", length = 1)
    private String totallossSoldTodo;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TOTALLOSS_SOLD_TODO_DATE")
    private Date totallossSoldTodoDate;
    @Column(name = "TOTALLOSS_SOLD_TODO_USER", length = 50)
    private String totallossSoldTodoUser;
    @ManyToOne
    @JoinColumn(name = "TOTALLOSS_RS_ID")
    private CarsSupplier carsSupplier;
    @ManyToOne
    @JoinColumn(name = "TOTALLOSS_CAR_ID")
    private CarsLossCar carsLossCar;
    @ManyToOne
    @JoinColumn(name = "TOTALLOSS_AREA_ID")
    private CarsTown carsTown;
    @ManyToOne
    @JoinColumn(name = "TOTALLOSS_PACK_ID")
    private CarsTotallossPack carsTotallossPack;

    @Column(name = "TOTALLOSS_MNG_SALVAGE_EST")
    private BigDecimal totalLossMngSalvageEst;

    @Transient
    private String garageDescription;

    @Transient
    private String packWinnerName;

    @Transient
    private BigDecimal packApprovedAmount;

    @Transient
    private String packApproved;

    public CarsTotallossMng() {
        totallossMngId = UUID.randomUUID().toString();
    }



}
