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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "CARS_SUPPLIER_DETAILS")
@Data
public class CarsSupplierDetails implements Serializable {

    private static final long serialVersionUID = -2831042602782622020L;

    @Column(name = "SUPPLIER_BLDG", length = 500)
    private String supplierBldg;
    @Id
    @Column(name = "SUPPLIER_DET_ID", nullable = false, length = 36)
    private String supplierDetId;
    @Column(name = "SUPPLIER_DET_NUM")
    private BigDecimal supplierDetNum;
    @Column(name = "SUPPLIER_DET_TYPE", nullable = false, length = 500)
    private String supplierDetType;
    @Column(name = "SUPPLIER_EMAIL", length = 300)
    private String supplierEmail;
    @Column(name = "SUPPLIER_FAX", length = 500)
    private String supplierFax;
    @Column(name = "SUPPLIER_MOBILE_PHONE", length = 500)
    private String supplierMobilePhone;
    @Column(name = "SUPPLIER_NUM")
    private BigDecimal supplierNum;
    @Column(name = "SUPPLIER_PHONE", length = 500)
    private String supplierPhone;
    @Column(name = "SUPPLIER_STREET", length = 500)
    private String supplierStreet;
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
    @JoinColumn(name = "SUPPLIER_ID")
    private CarsSupplier carsSupplier;
    @ManyToOne
    @JoinColumn(name = "SUPPLIER_TOWN_ID")
    private CarsTown carsTown;

    public CarsSupplierDetails() {
        supplierDetId = UUID.randomUUID().toString();
    }


}
