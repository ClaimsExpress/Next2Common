package net.claims.express.next2.common.entities.next2;

import core.adf.accelerator.adfm.utils.StringUtils;
import core.adf.accelerator.model.basics.BaseEntity;
import lombok.Data;

import java.io.Serializable;

import java.math.BigDecimal;

import java.text.SimpleDateFormat;

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
@Table(name = "CARS_TOTALLOSS_BID")
public class CarsTotallossBid implements Serializable {

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
    @Column(name = "TOTALLOSS_BID_AMOUNT")
    private BigDecimal totallossBidAmount;
    @Column(name = "TOTALLOSS_BID_TOTAL_AMOUNT")
    private BigDecimal totallossBidTotalAmount;
    @Column(name = "TOTALLOSS_BID_APPROVED", length = 50)
    private String totallossBidApproved;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TOTALLOSS_BID_APPROVED_DATE")
    private Date totallossBidApprovedDate;
    @Column(name = "TOTALLOSS_BID_APPROVED_USER", length = 50)
    private String totallossBidApprovedUser;
    @Column(name = "TOTALLOSS_BID_CANCEL", length = 1)
    private String totallossBidCancel;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TOTALLOSS_BID_CANCEL_DATE")
    private Date totallossBidCancelDate;
    @Column(name = "TOTALLOSS_BID_CANCEL_USER", length = 50)
    private String totallossBidCancelUser;
    @Column(name = "TOTALLOSS_BID_CODE")
    private BigDecimal totallossBidCode;
    @Column(name = "TOTALLOSS_BID_CUR", length = 100)
    private String totallossBidCur;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TOTALLOSS_BID_DATE")
    private Date totallossBidDate;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TOTALLOSS_BID_DONE_DATE")
    private Date totallossBidDoneDate;
    @Column(name = "TOTALLOSS_BID_DETAILS", length = 1000)
    private String totallossBidDetails;
    @Column(name = "TOTALLOSS_BID_DONE", length = 1)
    private String totallossBidDone;
    @Id
    @Column(name = "TOTALLOSS_BID_ID", nullable = false, length = 36)
    private String totallossBidId;
    @Column(name = "TOTALLOSS_BID_DONE_USER", length = 50)
    private String totallossBidDoneUser;
    @Column(name = "TOTALLOSS_BID_NAME", length = 100)
    private String totallossBidName;
    @Column(name = "TOTALLOSS_BID_CAR_ID", length = 36)
    private String totallossBidCarId;
    //    @Column(name = "TOTALLOSS_BID_PACK_ID", length = 300)
    //    private String totallossBidPackId;

    @ManyToOne
    @JoinColumn(name = "TOTALLOSS_BID_PACK_ID")
    private CarsTotallossPack carsTotallossPack;

    @Column(name = "TOTALLOSS_BID_NOTIFICATION")
    private BigDecimal totallossBidNotification;
    @Column(name = "TOTALLOSS_BID_SEQUENCE")
    private BigDecimal totallossBidSequence;
    @Column(name = "TOTALLOSS_BID_TODO", length = 1)
    private String totallossBidToDo;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TOTALLOSS_BID_TODO_DATE")
    private Date totallossBidToDoDate;
    @Column(name = "TOTALLOSS_BID_TODO_USER", length = 50)
    private String totallossBidToDoUser;
    
    @Column(name = "TOTALLOSS_BID_FULL_NAME", length = 1000)
    private String totalLossBidFullName;
    
    @Column(name = "TOTALLOSS_BID_BIDDER_ID", length = 36)
    private String totalLossBidBidderId;
    
    @Transient
    private String dateString;

    public CarsTotallossBid() {
        totallossBidId=  UUID.randomUUID().toString();

    }
}
