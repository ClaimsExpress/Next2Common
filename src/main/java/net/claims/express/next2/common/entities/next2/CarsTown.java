package net.claims.express.next2.common.entities.next2;


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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Data
@Entity
@Table(name = "CARS_TOWN")
public class CarsTown extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 3679297133149855417L;

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
    @Column(name = "TOWN_ARABIC_NAME", length = 500)
    private String townArabicName;
    @Column(name = "TOWN_CODE", nullable = false, length = 5)
    private String townCode;
    @Id
    @Column(name = "TOWN_ID", nullable = false, length = 36)
    private String townId;
    @Column(name = "TOWN_LATITUDE")
    private BigDecimal townLatitude;
    @Column(name = "TOWN_LONGITUDE")
    private BigDecimal townLongitude;
    @Column(name = "TOWN_NAME", length = 75)
    private String townName;
    @OneToMany(orphanRemoval = true, mappedBy = "carsTown", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsSurveyRequest> carsSurveyRequestList;
    @OneToMany(orphanRemoval = true, mappedBy = "carsTown", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsLossCar> carsLossCarList;
    @ManyToOne
    @JoinColumn(name = "TOWN_CAZA_ID")
    private CarsCaza carsCaza;
    @OneToMany(orphanRemoval = true, mappedBy = "carsTown", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsLossTowing> carsLossTowingList;
    @OneToMany(orphanRemoval = true, mappedBy = "carsTown", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsTotallossDispatch> carsTotallossDispatchList;
    @OneToMany(orphanRemoval = true, mappedBy = "carsTown", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsSurvey> carsSurveyList;
    @OneToMany(orphanRemoval = true, mappedBy = "carsTown", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsTotallossMng> carsTotallossMngList;
    @OneToMany(orphanRemoval = true, mappedBy = "carsTown", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsSupplierDetails> carsSupplierDetailsList;
    @OneToMany(orphanRemoval = true, mappedBy = "carsTown", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsBodilyInjury> carsBodilyInjuryList;
    @OneToMany(orphanRemoval = true, mappedBy = "carsTown", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsPreRiskSurvey> carsPreRiskSurveyList;
    @OneToMany(orphanRemoval = true, mappedBy = "carsTown", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsSupplier> carsSupplierList;
    @OneToMany(orphanRemoval = true, mappedBy = "carsTown", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsTownTerritory> carsTownTerritoryList;
    @OneToMany(orphanRemoval = true, mappedBy = "carsTown", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsMaterialDamage> carsMaterialDamageList;

    public CarsTown() {
        townId = UUID.randomUUID().toString();
    }

}
