package net.claims.express.next2.common.entities.next2;


import lombok.Data;
import net.claims.express.next2.common.entities.BaseEntity;
import org.springframework.util.StringUtils;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;

import java.util.List;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Data
@Entity
@Table(name = "CARS_REGION")
public class CarsRegion extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1689923212824280407L;

    @Column(name = "REGION_ARABIC_NAME", length = 500)
    private String regionArabicName;
    @Id
    @Column(name = "REGION_ID", nullable = false, length = 36)
    private String regionId;
    @Column(name = "REGION_NAME", length = 75)
    private String regionName;
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
    @OneToMany(orphanRemoval = true, mappedBy = "carsRegion", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsSurveyorPlace> carsSurveyorPlaceList;
    @OneToMany(orphanRemoval = true, mappedBy = "carsRegion", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsCaza> carsCazaList;

    public CarsRegion() {
        regionId = UUID.randomUUID().toString();
    }


}
