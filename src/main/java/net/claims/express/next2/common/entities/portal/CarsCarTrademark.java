package net.claims.express.next2.common.entities.portal;


import lombok.Data;
import net.claims.express.next2.common.entities.BaseEntity;

import java.io.Serializable;

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
@Data
@Entity
@Table(name = "CARS_CAR_TRADEMARK")
public class CarsCarTrademark extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 4472962132147509707L;

    @Column(name = "CAR_TRADEMARK_CODE", length = 5)
    private String carTrademarkCode;
    @Column(name = "CAR_TRADEMARK_DESCRIPTION", length = 40)
    private String carTrademarkDescription;
    @Id
    @Column(name = "CAR_TRADEMARK_ID", nullable = false, length = 36)
    private String carTrademarkId;
    @Column(name = "CAR_TRADEMARK_QUERY_ONLY", length = 50)
    private String carTrademarkQueryOnly;
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
    @OneToMany(orphanRemoval = true, mappedBy = "carsCarTrademark", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsCarShape> carsCarShapeList;
    @ManyToOne
    @JoinColumn(name = "CAR_BRAND_ID")
    private CarsCarBrand carsCarBrand;

    public CarsCarTrademark() {
        carTrademarkId = UUID.randomUUID().toString();
    }


}
