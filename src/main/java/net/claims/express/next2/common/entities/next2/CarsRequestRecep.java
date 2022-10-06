package net.claims.express.next2.common.entities.next2;

import core.adf.accelerator.adfm.utils.ModelUtils;
import core.adf.accelerator.adfm.utils.StringUtils;
import core.adf.accelerator.model.basics.BaseEntity;

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

import lombok.Data;
import net.claims.express.next2.common.entities.BaseEntity;
import net.claimsexpress.claimresolution.model.views.DocumentsLovVw;

@Entity
@Table(name = "CARS_REQUEST_RECEP")
@Data
public class CarsRequestRecep extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 6721869775296475260L;

    @Column(name = "LOSS_TOW_REQ_AMOUNT")
    private BigDecimal lossTowReqAmount;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LOSS_TOW_REQ_ANS_DATE")
    private Date lossTowReqAnsDate;
    @Column(name = "LOSS_TOW_REQ_ANS_NOTE", length = 500)
    private String lossTowReqAnsNote;
    @Column(name = "LOSS_TOW_REQ_ANS_RESP", length = 100)
    private String lossTowReqAnsResp;
    @Column(name = "LOSS_TOW_REQ_ANS_STATUS_CODE", length = 36)
    private String lossTowReqAnsStatusCode;
    @Column(name = "LOSS_TOW_REQ_ANS_USER", length = 50)
    private String lossTowReqAnsUser;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LOSS_TOW_REQ_DATE")
    private Date lossTowReqDate;
    @Id
    @Column(name = "LOSS_TOW_REQ_ID", nullable = false, length = 36)
    private String lossTowReqId;
    @Column(name = "LOSS_TOW_REQ_NOTE", length = 500)
    private String lossTowReqNote;
    @Column(name = "LOSS_TOW_REQ_RECALL", length = 1)
    private String lossTowReqRecall;
    //    @Column(name = "LOSS_TOW_REQ_STATUS_CODE", nullable = false, length = 36)
    //    private String lossTowReqStatusCode;
    @Column(name = "LOSS_TOW_REQ_USER", length = 50)
    private String lossTowReqUser;
    @Column(name = "LOSS_TOW_REQ_FROM", length = 50)
    private String lossTowReqFrom;

    @Column(name = "LOSS_TOW_REQ_TO", length = 50)
    private String lossTowReqTo;
    @ManyToOne
    @JoinColumn(name = "LOSS_TOW_REQ_CAR_ID")
    private CarsLossCar carsLossCar;

    @ManyToOne
    @JoinColumn(name = "LOSS_TOW_REQ_STATUS_CODE")
    private DocumentsLovVw documentsLovVw;


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

    @Column(name = "LOSS_TOW_REQ_CANCEL_USER", length = 36)
    private String lossTowReqCancelUser;

    @Column(name = "LOSS_TOW_REQ_CANCEL", length = 1)
    private String lossTowReqCancel;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LOSS_TOW_REQ_CANCEL_DATE", nullable = false)
    private Date lossTowReqCancelDate;


    @Column(name = "LOSS_TOW_REQ_DONE_USER", length = 36)
    private String lossTowReqDoneUser;

    @Column(name = "LOSS_TOW_REQ_DONE", length = 1)
    private String lossTowReqDone;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LOSS_TOW_REQ_DONE_DATE", nullable = false)
    private Date lossTowReqDoneDate;

    @Transient
    private String requestFromDesc;

    @Transient
    private Boolean requestCancelBoolean;

    @Transient
    private Boolean requestDoneBoolean;

    public CarsRequestRecep() {
        lossTowReqId = UUID.randomUUID().toString();
    }

}
