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
@Table(name = "CARS_TOTALLOSS_COMUN")
public class CarsTotallossComun implements Serializable {

    private static final long serialVersionUID = -2759329623287479219L;

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
    @Column(name = "TOTALLOSS_COMUN_AMOUNT")
    private BigDecimal totallossComunAmount;
    @Column(name = "TOTALLOSS_COMUN_CANCEL", length = 1)
    private String totallossComunCancel;
    @Column(name = "TOTALLOSS_COMUN_CURR", length = 10)
    private String totallossComunCurr;
    @Temporal(TemporalType.DATE)
    @Column(name = "TOTALLOSS_COMUN_DATE")
    private Date totallossComunDate;
    @Column(name = "TOTALLOSS_COMUN_DETAILS", length = 1000)
    private String totallossComunDetails;
    @Column(name = "TOTALLOSS_COMUN_DONE", length = 1)
    private String totallossComunDone;
    @Id
    @Column(name = "TOTALLOSS_COMUN_ID", nullable = false, length = 36)
    private String totallossComunId;
    @Column(name = "TOTALLOSS_COMUN_NAME", length = 1000)
    private String totallossComunName;
    @Temporal(TemporalType.DATE)
    @Column(name = "TOTALLOSS_COMUN_REMINDER")
    private Date totallossComunReminder;
    @Column(name = "TOTALLOSS_COMUN_TODO", length = 1)
    private String totallossComunTodo;
    @Column(name = "TOTALLOSS_COMUN_TYPE", length = 10)
    private String totallossComunType;
    @Column(name = "TOTALLOSS_COMUN_USER", length = 36)
    private String totallossComunUser;
    @ManyToOne
    @JoinColumn(name = "TOTALLOSS_COMUN_CAR_ID")
    private CarsLossCar carsLossCar;

    public CarsTotallossComun() {
        totallossComunId = UUID.randomUUID().toString()

    }


}
