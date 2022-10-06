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
@Table(name = "CARS_TOTALLOSS_REQUEST")
public class CarsTotallossRequest implements Serializable {

    private static final long serialVersionUID = -6097242940903810201L;

    @Column(name = "TOTALLOSS_REQUEST_CANCEL", length = 1)
    private String totallossRequestCancel;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TOTALLOSS_REQUEST_CANCEL_DATE")
    private Date totallossRequestCancelDate;
    @Column(name = "TOTALLOSS_REQUEST_CANCEL_USER", length = 36)
    private String totallossRequestCancelUser;
    @Column(name = "TOTALLOSS_REQUEST_DETAILS", length = 1000)
    private String totallossRequestDetails;
    @Column(name = "TOTALLOSS_REQUEST_DONE", length = 1)
    private String totallossRequestDone;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TOTALLOSS_REQUEST_DONE_DATE")
    private Date totallossRequestDoneDate;
    @Column(name = "TOTALLOSS_REQUEST_DONE_USER", length = 36)
    private String totallossRequestDoneUser;
    @Id
    @Column(name = "TOTALLOSS_REQUEST_ID", nullable = false, length = 36)
    private String totallossRequestId;
    @Column(name = "TOTALLOSS_REQUEST_NOTES", length = 1000)
    private String totallossRequestNotes;
    @Column(name = "TOTALLOSS_REQUEST_TODO", length = 1)
    private String totallossRequestTodo;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TOTALLOSS_REQUEST_TODO_DATE")
    private Date totallossRequestTodoDate;
    @Column(name = "TOTALLOSS_REQUEST_TODO_USER", length = 36)
    private String totallossRequestTodoUser;
    @ManyToOne
    @JoinColumn(name = "TOTALLOSS_REQUEST_CAR_ID")
    private CarsLossCar carsLossCar;

    @Column(name = "SYS_CREATED_BY", nullable = false, length = 36)
    private String sysCreatedBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "SYS_CREATED_DATE", nullable = false)
    private Date sysCreatedDate;
    @Column(name = "SYS_UPDATED_BY", nullable = false, length = 36)
    private String sysUpdatedBy;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "SYS_UPDATED_DATE", nullable = false)
    private Date sysUpdatedDate;
    @Column(name = "SYS_VERSION_NUMBER", nullable = false)
    private Long sysVersionNumber;

    @Column(name = "TOTALLOSS_REQUEST_NOTIFICATION", nullable = false)
    private BigDecimal totalLossRequestNotification;

    @Column(name = "TOTALLOSS_REQUEST_SEQUENCE", nullable = false)
    private BigDecimal totalLossRequestSequence;


    @Transient
    private boolean checkBox;

    @Transient
    private boolean checkBoxDone;

    @Transient
    private boolean checkBoxToDo;





    public CarsTotallossRequest() {
        totallossRequestId = UUID.randomUUID().toString();
    }


}
