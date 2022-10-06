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
import javax.persistence.Transient;

@Entity
@Data
@Table(name = "CARS_REPAIR_SHOP_ACTIVITY")
public class CarsRepairShopActivity implements Serializable {
    private static final long serialVersionUID = 5892077091423205132L;
    @Id
    @Column(name = "RS_ACT_ID", nullable = false, length = 36)
    private String rscActId;
    //    @Column(name = "RSC_CAR_ID", nullable = false, length = 36)
    //    private String rscCarId;
    @Column(name = "RS_ACT_DESCRIPTION", length = 250)
    private String rscDescription;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "RS_ACT_FROM_DATE", nullable = false)
    private Date rscFromDate;
    //    @Column(name = "RSC_ID", nullable = false, length = 36)
    //    private String rscId;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "RS_ACT_TO_DATE", nullable = false)
    private Date rscToDate;

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

    @Column(name = "RS_ACT_CANCELED", length = 1)
    private String rscCanceled;

    @ManyToOne
    @JoinColumn(name = "RS_ACT_CAR_ID")
    private CarsLossCar carsLossCar;

    @ManyToOne
    @JoinColumn(name = "RS_ACT_CAP_ID")
    private CarsRepairShopCapacity carsRepairShopCapacity;

    @Transient
    private String validation;

    public CarsRepairShopActivity() {
        rscActId = UUID.randomUUID().toString();
    }


}
