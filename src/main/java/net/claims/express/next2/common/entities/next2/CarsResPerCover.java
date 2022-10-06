package net.claims.express.next2.common.entities.next2;

import core.adf.accelerator.adfm.utils.StringUtils;
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
import javax.persistence.Transient;
import javax.persistence.Version;

@Entity
@Data
@Table(name = "CARS_RES_PER_COVER")
public class CarsResPerCover implements Serializable {
    //extends BaseEntity implements Serializable {
    private static final long serialVersionUID = -4639188396546126275L;
    //    @Column(name = "RES_PER_COVER_CAR_ID", length = 36)
    //    private String resPerCoverCarId;
    //    @Column(name = "RES_PER_COVER_COV_ID", length = 36)
    //    private String resPerCoverCovId;
    @Column(name = "RES_PER_COVER_COV_LIMIT")
    private BigDecimal resPerCoverCovLimit;
    @Column(name = "RES_PER_COVER_DESC", length = 500)
    private String resPerCoverDesc;
    @Id
    @Column(name = "RES_PER_COVER_ID", nullable = false, length = 36)
    private String resPerCoverId;
    @Column(name = "RES_PER_COVER_LABOR")
    private BigDecimal resPerCoverLabor;
    @Column(name = "RES_PER_COVER_OTHER")
    private BigDecimal resPerCoverOther;
    @Column(name = "RES_PER_COVER_PARTS")
    private BigDecimal resPerCoverParts;

    @ManyToOne
    @JoinColumn(name = "RES_PER_COVER_MATERIAL_ID")
    private CarsMaterialDamage carsMaterialDamage;
    @ManyToOne
    @JoinColumn(name = "RES_PER_COVER_BODILY_ID")
    private CarsBodilyInjury carsBodilyInjury;

    @ManyToOne
    @JoinColumn(name = "RES_PER_COVER_CAR_ID")
    private CarsLossCar carsLossCar;

    @ManyToOne
    @JoinColumn(name = "RES_PER_COVER_COV_ID")
    private CarsCover carsCover;

    @Transient
    private String contextCurrentUser;

    @Transient
    private BigDecimal carSequence;

    @Transient
    private String vehicle;

    @Transient
    private String typeOfCard;

    @Column(name = "SYS_CREATED_BY", length = 12)
    private String sysCreatedBy;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "SYS_CREATED_DATE")
    private Date sysCreatedDate;
    @Column(name = "SYS_UPDATED_BY", length = 12)
    private String sysUpdatedBy;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "SYS_UPDATED_DATE")
    private Date sysUpdatedDate;

    @Version
    @Column(name = "SYS_VERSION_NUMBER")
    private Long sysVersionNumber = new Long(0);
    
    @Transient
    private String coverId;

    public CarsResPerCover() {
        resPerCoverId = UUID.randomUUID().toString();
    }


}
