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
@Table(name = "CARS_REPAIR_SHOP_UNAVAILABLE")
public class CarsRepairShopUnavailable implements Serializable {
    private static final long serialVersionUID = -6335276804850475332L;
//    @Column(name = "RSU_UNAV_CAR_ID", length = 36)
//    private String rsuUnavCarId;
    @Id
    @Column(name = "RSU_UNAV_ID", nullable = false, length = 36)
    private String rsuUnavId;
    @Column(name = "RSU_UNAV_REASON_ID", length = 36)
    private String rsuUnavReasonId;
    @Column(name = "RSU_UNAV_REMARKS", length = 1000)
    private String rsuUnavRemarks;
//    @Column(name = "RSU_UNAV_SUPPLIER_ID", nullable = false, length = 36)
//    private String rsuUnavSupplierId;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "RSU_UNAV_TIME")
    private Date rsuUnavTime;
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
    
    @ManyToOne
    @JoinColumn(name = "RSU_UNAV_SUPPLIER_ID")
    private CarsSupplier carsSupplier;

    @ManyToOne
    @JoinColumn(name = "RSU_UNAV_CAR_ID")
    private CarsLossCar carsLossCar;

    public CarsRepairShopUnavailable() {
      rsuUnavId =  UUID.randomUUID().toString();
    }

//    public CarsRepairShopUnavailable(String rsuUnavCarId, String rsuUnavId, String rsuUnavReasonId,
//                                     String rsuUnavRemarks, String rsuUnavSupplierId, Date rsuUnavTime,
//                                     String sysCreatedBy, Date sysCreatedDate, String sysUpdatedBy, Date sysUpdatedDate,
//                                     Long sysVersionNumber) {
//        this.rsuUnavCarId = rsuUnavCarId;
//        this.rsuUnavId = rsuUnavId;
//        this.rsuUnavReasonId = rsuUnavReasonId;
//        this.rsuUnavRemarks = rsuUnavRemarks;
//        this.rsuUnavSupplierId = rsuUnavSupplierId;
//        this.rsuUnavTime = rsuUnavTime;
//        this.sysCreatedBy = sysCreatedBy;
//        this.sysCreatedDate = sysCreatedDate;
//        this.sysUpdatedBy = sysUpdatedBy;
//        this.sysUpdatedDate = sysUpdatedDate;
//        this.sysVersionNumber = sysVersionNumber;
//    }

    public String getRsuUnavId() {
        return rsuUnavId;
    }

    public void setRsuUnavId(String rsuUnavId) {
        this.rsuUnavId = rsuUnavId;
    }

    public String getRsuUnavReasonId() {
        return rsuUnavReasonId;
    }

    public void setRsuUnavReasonId(String rsuUnavReasonId) {
        this.rsuUnavReasonId = rsuUnavReasonId;
    }

    public String getRsuUnavRemarks() {
        return rsuUnavRemarks;
    }

    public void setRsuUnavRemarks(String rsuUnavRemarks) {
        this.rsuUnavRemarks = rsuUnavRemarks;
    }

    public Date getRsuUnavTime() {
        return rsuUnavTime;
    }

    public void setRsuUnavTime(Date rsuUnavTime) {
        this.rsuUnavTime = rsuUnavTime;
    }

    public String getSysCreatedBy() {
        return sysCreatedBy;
    }

    public void setSysCreatedBy(String sysCreatedBy) {
        this.sysCreatedBy = sysCreatedBy;
    }

    public Date getSysCreatedDate() {
        return sysCreatedDate;
    }

    public void setSysCreatedDate(Date sysCreatedDate) {
        this.sysCreatedDate = sysCreatedDate;
    }

    public String getSysUpdatedBy() {
        return sysUpdatedBy;
    }

    public void setSysUpdatedBy(String sysUpdatedBy) {
        this.sysUpdatedBy = sysUpdatedBy;
    }

    public Date getSysUpdatedDate() {
        return sysUpdatedDate;
    }

    public void setSysUpdatedDate(Date sysUpdatedDate) {
        this.sysUpdatedDate = sysUpdatedDate;
    }

    public Long getSysVersionNumber() {
        return sysVersionNumber;
    }

    public void setSysVersionNumber(Long sysVersionNumber) {
        this.sysVersionNumber = sysVersionNumber;
    }

    public void setCarsSupplier(CarsSupplier carsSupplier) {
        this.carsSupplier = carsSupplier;
    }

    public CarsSupplier getCarsSupplier() {
        return carsSupplier;
    }

    public void setCarsLossCar(CarsLossCar carsLossCar) {
        this.carsLossCar = carsLossCar;
    }

    public CarsLossCar getCarsLossCar() {
        return carsLossCar;
    }
}
