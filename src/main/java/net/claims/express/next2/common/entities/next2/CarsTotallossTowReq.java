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
@Data
@Entity
@Table(name = "CARS_TOTALLOSS_TOW_REQ")
public class CarsTotallossTowReq implements Serializable {

    private static final long serialVersionUID = 2201095432137661080L;

    @Column(name = "TOTALLOSS_TOW_REQ_CANCEL", length = 1)
    private String totallossTowReqCancel;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TOTALLOSS_TOW_REQ_CANCEL_DATE")
    private Date totallossTowReqCancelDate;
    @Column(name = "TOTALLOSS_TOW_REQ_CANCEL_USER", length = 36)
    private String totallossTowReqCancelUser;
    @Column(name = "TOTALLOSS_TOW_REQ_DONE", length = 1)
    private String totallossTowReqDone;
    @Temporal(TemporalType.DATE)
    @Column(name = "TOTALLOSS_TOW_REQ_DONE_DATE")
    private Date totallossTowReqDoneDate;
    @Column(name = "TOTALLOSS_TOW_REQ_DONE_USER", length = 36)
    private String totallossTowReqDoneUser;
    @Column(name = "TOTALLOSS_TOW_REQ_FROM", length = 500)
    private String totallossTowReqFrom;
    @Id
    @Column(name = "TOTALLOSS_TOW_REQ_ID", nullable = false, length = 36)
    private String totallossTowReqId;
    @Column(name = "TOTALLOSS_TOW_REQ_NOTES", length = 1000)
    private String totallossTowReqNotes;
    @Column(name = "TOTALLOSS_TOW_REQ_PHONE", length = 200)
    private String totallossTowReqPhone;
    @Column(name = "TOTALLOSS_TOW_REQ_TO", length = 500)
    private String totallossTowReqTo;
    @Column(name = "TOTALLOSS_TOW_REQ_TODO", length = 1)
    private String totallossTowReqTodo;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TOTALLOSS_TOW_REQ_TODO_DATE")
    private Date totallossTowReqTodoDate;
    @Column(name = "TOTALLOSS_TOW_REQ_TODO_USER", length = 36)
    private String totallossTowReqTodoUser;
    @ManyToOne
    @JoinColumn(name = "TOTALLOSS_TOW_REQ_CAR_ID")
    private CarsLossCar carsLossCar;
    
    @Column(name = "TOTALLOSS_TOW_REQ_NOTIFICATION")
    private BigDecimal totalLossTowReqNotification ;
    @Column(name = "TOTALLOSS_TOW_REQ_SEQUENCE")
    private BigDecimal totalLossTowReqSequence;
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
    
    @Transient
    private String cancelUserFullName;
    
    @Transient
    private String toDoUserFullName;





    public CarsTotallossTowReq() {
        totallossTowReqId = UUID.randomUUID().toString();
    }


}
