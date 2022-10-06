package net.claims.express.next2.common.entities.next2;



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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Data
@Entity
@Table(name = "CARS_STATE")
public class CarsState extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 7597145884867047739L;

    @Column(name = "STATE_CODE", length = 2)
    private String stateCode;
    @Column(name = "STATE_DESCRIPTION", length = 200)
    private String stateDescription;
    @Id
    @Column(name = "STATE_ID", nullable = false, length = 36)
    private String stateId;
    @Column(name = "STATE_MARKED", length = 1)
    private String stateMarked;
    @Column(name = "STATE_NATIONALITY", length = 200)
    private String stateNationality;
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
    @OneToMany(orphanRemoval = true, mappedBy = "carsState", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsLossCar> carsLossCarList;

    public CarsState() {
        stateId = UUID.randomUUID().toString();
    }


}
