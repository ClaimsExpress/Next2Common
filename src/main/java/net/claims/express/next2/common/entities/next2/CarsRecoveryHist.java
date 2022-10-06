package net.claims.express.next2.common.entities.next2;

import lombok.Data;

import java.io.Serializable;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Data
@Entity
@Table(name = "CARS_RECOVERY_HIST")
public class CarsRecoveryHist implements Serializable {
    private static final long serialVersionUID = -1406805326049712837L;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REC_HIST_FILLED_DATA_DATE")
    private Date recHistFilledDataDate;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REC_HIST_FROM_DATA_DATE")
    private Date recHistFromDataDate;
    @Id
    @Column(name = "REC_HIST_ID", nullable = false, length = 36)
    private String recHistId;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REC_HIST_TO_DATA_DATE")
    private Date recHistToDataDate;
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

    public CarsRecoveryHist() {
        recHistId = UUID.randomUUID().toString();
    }


}
