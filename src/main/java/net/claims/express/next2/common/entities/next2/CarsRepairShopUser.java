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
@Table(name = "CARS_REPAIR_SHOP_USER")
public class CarsRepairShopUser implements Serializable {
    private static final long serialVersionUID = 8000490941964914120L;
    @Column(name = "REPAIR_SHOP_USER_ACTIVE", length = 1)
    private String repairShopUserActive;
    @Column(name = "REPAIR_SHOP_USER_CODE", length = 36)
    private String repairShopUserCode;
    @Temporal(TemporalType.DATE)
    @Column(name = "REPAIR_SHOP_USER_DATE")
    private Date repairShopUserDate;
    @Id
    @Column(name = "REPAIR_SHOP_USER_ID", nullable = false, length = 36)
    private String repairShopUserId;
    
    //REPAIR_SHOP_RATIO
    @Column(name = "REPAIR_SHOP_RATIO")
    private BigDecimal repairShopRatio;
    
//    @Column(name = "REPAIR_SHOP_USER_SUPPLIER_ID", length = 36)
//    private String repairShopUserSupplierId;
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
    @JoinColumn(name = "REPAIR_SHOP_USER_SUPPLIER_ID")
    private CarsSupplier carsSupplier;
    
    @ManyToOne
    @JoinColumn(name = "REPAIR_SHOP_USER_INSURANCE_ID")
    private CarsInsurance carsInsurance;

    public CarsRepairShopUser() {
        repairShopUserId = UUID.randomUUID().toString();
    }

}
