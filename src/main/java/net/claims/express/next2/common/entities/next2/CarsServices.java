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
@Table(name = "CARS_SERVICES")
public class CarsServices extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -8054792834823927019L;

    @Column(name = "SERVICE_DESCRIPTION", length = 600)
    private String serviceDescription;
    @Id
    @Column(name = "SERVICE_ID", nullable = false, length = 36)
    private String serviceId;
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
    @OneToMany(orphanRemoval = true, mappedBy = "carsServices", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsNotification> carsNotificationList;

    public CarsServices() {
        serviceId = UUID.randomUUID().toString();
    }


}
