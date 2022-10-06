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

@Entity
@Data
@Table(name = "CARS_CAR_SHAPE")
public class CarsCarShape extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -3471251233679819943L;

    @Column(name = "CAR_SHAPE_CODE", length = 5)
    private String carShapeCode;
    @Column(name = "CAR_SHAPE_DESCRIPTION", length = 40)
    private String carShapeDescription;
    @Id
    @Column(name = "CAR_SHAPE_ID", nullable = false, length = 36)
    private String carShapeId;
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
    @JoinColumn(name = "CAR_TRADEMARK_ID")
    private CarsCarTrademark carsCarTrademark;
    @OneToMany(orphanRemoval = true, mappedBy = "carsCarShape", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsPreRiskSurvey> carsPreRiskSurveyList;
    @OneToMany(orphanRemoval = true, mappedBy = "carsCarShape", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsDerLog> carsDerLogList;
    @OneToMany(orphanRemoval = true, mappedBy = "carsCarShape", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsPolicyCar> carsPolicyCarList;
    @OneToMany(orphanRemoval = true, mappedBy = "carsCarShape", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsDer> carsDerList;
    @OneToMany(orphanRemoval = true, mappedBy = "carsCarShape", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsLossCar> carsLossCarList;
    @OneToMany(orphanRemoval = true, mappedBy = "carsCarShape", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsCarInfo> carsCarInfoList;

    public CarsCarShape() {
        carShapeId = UUID.randomUUID().toString();
    }




}
