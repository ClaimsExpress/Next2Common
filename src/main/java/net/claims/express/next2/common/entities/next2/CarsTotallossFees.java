package net.claims.express.next2.common.entities.next2;

import core.adf.accelerator.model.basics.BaseEntity;
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
@Table(name = "CARS_TOTALLOSS_FEES")
public class CarsTotallossFees implements Serializable {

    private static final long serialVersionUID = -4409122699712593252L;

    @Column(name = "SYS_CREATED_BY", nullable = false, length = 36)
    private String sysCreatedBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "SYS_CREATED_DATE", nullable = false)
    private Date sysCreatedDate;
    @Column(name = "SYS_UPDATED_BY", nullable = false, length = 36)
    private String sysUpdatedBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "SYS_UPDATED_DATE", nullable = false)
    private Date sysUpdatedDate;
    @Column(name = "SYS_VERSION_NUMBER", nullable = false)
    private Long sysVersionNumber;
    @Column(name = "TOTALLOSS_FEES_AMOUNT")
    private BigDecimal totallossFeesAmount;
    @Column(name = "TOTALLOSS_FEES_CANCEL", length = 1)
    private String totallossFeesCancel;
    @Column(name = "TOTALLOSS_FEES_CURR", length = 36)
    private String totallossFeesCurr;
    @Temporal(TemporalType.DATE)
    @Column(name = "TOTALLOSS_FEES_DATE")
    private Date totallossFeesDate;
    @Column(name = "TOTALLOSS_FEES_DETAILS", length = 1000)
    private String totallossFeesDetails;
    @Column(name = "TOTALLOSS_FEES_DONE", length = 1)
    private String totallossFeesDone;
    @Id
    @Column(name = "TOTALLOSS_FEES_ID", nullable = false, length = 36)
    private String totallossFeesId;
    @Column(name = "TOTALLOSS_FEES_PAYEE_NAME", length = 1000)
    private String totallossFeesPayeeName;
    @Column(name = "TOTALLOSS_FEES_TODO", length = 1)
    private String totallossFeesTodo;
    @Column(name = "TOTALLOSS_FEES_TYPE", length = 36)
    private String totallossFeesType;
    @Column(name = "TOTALLOSS_FEES_USER", length = 36)
    private String totallossFeesUser;
    @ManyToOne
    @JoinColumn(name = "TOTALLOSS_FEES_CAR_ID")
    private CarsLossCar carsLossCar;

    public CarsTotallossFees() {
        totallossFeesId = UUID.randomUUID().toString();
    }


}
