package net.claims.express.next2.common.entities.next2;

import lombok.Data;

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

@Entity
@Data
@Table(name = "CARS_TOTALLOSS_CLAIM_DOC")
public class CarsTotallossClaimDoc implements Serializable {

    private static final long serialVersionUID = -7680358704070011378L;

  
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
    @Id
    @Column(name = "TOTALLOSS_CLAIM_DOC_ID", nullable = false, length = 36)
    private String totallossClaimDocId;
    @Column(name = "TOTALLOSS_DOC_CATEGORY", length = 36)
    private String totallossDocCategory;
    @Temporal(TemporalType.DATE)
    @Column(name = "TOTALLOSS_DOC_DATE")
    private Date totallossDocDate;
    @Column(name = "TOTALLOSS_DOC_EXIST", length = 1)
    private String totallossDocExist;
    @Column(name = "TOTALLOSS_DOC_NATURE", length = 36)
    private String totallossDocNature;
    @Column(name = "TOTALLOSS_DOC_NOTE", length = 1000)
    private String totallossDocNote;
    @Temporal(TemporalType.DATE)
    @Column(name = "TOTALLOSS_DOC_SENT_DATE")
    private Date totallossDocSentDate;
    @Column(name = "TOTALLOSS_DOC_SENT_NATURE", length = 36)
    private String totallossDocSentNature;
    @Column(name = "TOTALLOSS_DOC_SENT_NOTE", length = 1000)
    private String totallossDocSentNote;
    @Column(name = "TOTALLOSS_DOC_SENT_TO", length = 36)
    private String totallossDocSentTo;
    @Column(name = "TOTALLOSS_DOC_TYPE", length = 36)
    private String totallossDocType;
    @Column(name = "TOTALLOSS_DOC_USER", length = 50)
    private String totallossDocUser;
    @ManyToOne
    @JoinColumn(name = "TOTALLOSS_DOC_CAR_ID")
    private CarsLossCar carsLossCar;

    public CarsTotallossClaimDoc() {
        totallossClaimDocId = UUID.randomUUID().toString();
    }



}
