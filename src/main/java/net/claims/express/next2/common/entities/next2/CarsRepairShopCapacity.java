package net.claims.express.next2.common.entities.next2;

import core.adf.accelerator.adfm.utils.StringUtils;
import lombok.Data;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.Date;

import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Data
@Table(name = "CARS_REPAIR_SHOP_CAPACITY")
public class CarsRepairShopCapacity implements Serializable {
    private static final long serialVersionUID = -6752332741431187834L;
    @Column(name = "RSC_CAPACITY", nullable = false)
    private BigDecimal rscCapacity;
    @Temporal(TemporalType.DATE)
    @Column(name = "RSC_DATE", nullable = false)
    private Date rscDate;
    @Id
    @Column(name = "RSC_ID", nullable = false, length = 36)
    private String rscId;
//    @Column(name = "RSC_SUPPLIER_ID", nullable = false, length = 36)
//    private String rscSupplierId;
    
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
    
    @ManyToOne
    @JoinColumn(name = "RSC_SUPPLIER_ID")
    private CarsSupplier carsSupplier;

    @OneToMany(orphanRemoval = true, mappedBy = "carsRepairShopCapacity", cascade = {
               CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsRepairShopActivity> carsRepairShopActivityList;
    
    @Transient
    private Date fromDate;
    
    @Transient
    private Date toDate;
    
    @Transient
    private String reserve;

    public CarsRepairShopCapacity() {
        rscId = UUID.randomUUID().toString();
    }



}
