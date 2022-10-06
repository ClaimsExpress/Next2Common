package net.claims.express.next2.common.entities.next2;

import core.adf.accelerator.adfm.utils.StringUtils;
import core.adf.accelerator.model.basics.BaseEntity;
import lombok.Data;

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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Data
@Table(name = "CARS_SERIE")
public class CarsSerie implements Serializable {

    private static final long serialVersionUID = 7597145884867047739L;

    @Column(name = "SERIE_FILING")
    private BigDecimal serieFiling;
    @Id
    @Column(name = "SERIE_ID", nullable = false, length = 36)
    private String serieId;
    @Column(name = "SERIE_INSURANCE_ID", length = 36)
    private String serieInsuranceId;
    @Column(name = "SERIE_NAME", length = 75)
    private String serieName;
    @Column(name = "SERIE_TYPE", length = 10)
    private String serieType;
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


    @Transient
    private String mode;

    public CarsSerie() {
        serieId = UUID.randomUUID().toString();
    }



}
