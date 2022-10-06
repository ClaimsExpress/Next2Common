package net.claims.express.next2.common.entities.portal;


import lombok.Data;
import net.claims.express.next2.common.entities.BaseEntity;

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
@Data
@Entity
@Table(name = "CARS_CAR_INFO")
public class CarsCarInfo extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1707944202158245363L;

    @Column(name = "CAR_INFO_BODY_TYPE", length = 50)
    private String carInfoBodyType;
    @Column(name = "CAR_INFO_BODY_TYPE_CODE", length = 50)
    private String carInfoBodyTypeCode;
    @Column(name = "CAR_INFO_BODY_TYPE_OLD", length = 50)
    private String carInfoBodyTypeOld;
    @Column(name = "CAR_INFO_DENTING", length = 1)
    private String carInfoDenting;
    @Column(name = "CAR_INFO_DOORS", length = 50)
    private String carInfoDoors;
    @Column(name = "CAR_INFO_FROM_YEAR")
    private Integer carInfoFromYear;
    @Column(name = "CAR_INFO_HP")
    private BigDecimal carInfoHp;
    @Id
    @Column(name = "CAR_INFO_ID", nullable = false, length = 36)
    private String carInfoId;
    @Column(name = "CAR_INFO_PAINT", length = 1)
    private String carInfoPaint;
    @Column(name = "CAR_INFO_SIZE", length = 1)
    private String carInfoSize;
    @Column(name = "CAR_INFO_SYMBOL", length = 2)
    private String carInfoSymbol;
    @Column(name = "CAR_INFO_TO_YEAR")
    private Integer carInfoToYear;
    @Column(name = "CAR_INFO_VALUE")
    private BigDecimal carInfoValue;
    @Column(name = "CAR_INFO_WTB", length = 4)
    private String carInfoWtb;
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
    @OneToMany(orphanRemoval = true, mappedBy = "carsCarInfo", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsDer> carsDerList;
    @ManyToOne
    @JoinColumn(name = "CAR_INFO_SHAPE_ID")
    private CarsCarShape carsCarShape;

    public CarsCarInfo() {
        carInfoId = UUID.randomUUID().toString();
    }





}
