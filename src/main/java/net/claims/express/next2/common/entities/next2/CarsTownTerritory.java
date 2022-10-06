package net.claims.express.next2.common.entities.next2;

import lombok.Data;
import net.claims.express.next2.common.entities.BaseEntity;

import java.io.Serializable;

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
@Data
@Entity
@Table(name = "CARS_TOWN_TERRITORY")
public class CarsTownTerritory extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -57827179979785873L;

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
    @Id
    @Column(name = "TOWN_TERRITORY_ID", nullable = false, length = 36)
    private String townTerritoryId;
    @Column(name = "TOWN_TERRITORY_TERRITORY", length = 2)
    private String townTerritoryTerritory;
    @ManyToOne
    @JoinColumn(name = "TOWN_TERRITORY_INSURANCE_ID")
    private CarsInsurance carsInsurance;
    @ManyToOne
    @JoinColumn(name = "TOWN_TERRITORY_CITY_ID")
    private CarsTown carsTown;

    public CarsTownTerritory() {
        townTerritoryId = UUID.randomUUID().toString();
    }


}
