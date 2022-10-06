package net.claims.express.next2.common.entities.next2;


import java.io.Serializable;

import java.util.Date;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "CARS_TOTALLOSS_DOC_FOL")
public class CarsTotallossDocFol implements Serializable {

    private static final long serialVersionUID = -7492772470616726446L;

   
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
    @Column(name = "TOTALLOSS_DOC_FOL_CANCEL", length = 1)
    private String totallossDocFolCancel;
    @Temporal(TemporalType.DATE)
    @Column(name = "TOTALLOSS_DOC_FOL_CANCEL_DATE")
    private Date totallossDocFolCancelDate;
    @Column(name = "TOTALLOSS_DOC_FOL_CANCEL_USER", length = 50)
    private String totallossDocFolCancelUser;
    @Column(name = "TOTALLOSS_DOC_FOL_CATEGORY", length = 36)
    private String totallossDocFolCategory;
    @Column(name = "TOTALLOSS_DOC_FOL_DETAILS", length = 1000)
    private String totallossDocFolDetails;
    @Column(name = "TOTALLOSS_DOC_FOL_DONE", length = 1)
    private String totallossDocFolDone;
    @Temporal(TemporalType.DATE)
    @Column(name = "TOTALLOSS_DOC_FOL_DONE_DATE")
    private Date totallossDocFolDoneDate;
    @Column(name = "TOTALLOSS_DOC_FOL_DONE_USER", length = 50)
    private String totallossDocFolDoneUser;
    @Id
    @Column(name = "TOTALLOSS_DOC_FOL_ID", nullable = false, length = 36)
    private String totallossDocFolId;
    @Column(name = "TOTALLOSS_DOC_FOL_NATURE", length = 36)
    private String totallossDocFolNature;
    @Temporal(TemporalType.DATE)
    @Column(name = "TOTALLOSS_DOC_FOL_REMIND")
    private Date totallossDocFolRemind;
    @Column(name = "TOTALLOSS_DOC_FOL_TODO", length = 1)
    private String totallossDocFolTodo;
    @Temporal(TemporalType.DATE)
    @Column(name = "TOTALLOSS_DOC_FOL_TODO_DATE")
    private Date totallossDocFolTodoDate;
    @Column(name = "TOTALLOSS_DOC_FOL_TODO_USER", length = 50)
    private String totallossDocFolTodoUser;
    @Column(name = "TOTALLOSS_DOC_FOL_TYPE", length = 36)
    private String totallossDocFolType;
    @ManyToOne
    @JoinColumn(name = "TOTALLOSS_DOC_FOL_CAR_ID")
    private CarsLossCar carsLossCar;

    public CarsTotallossDocFol() {
        totallossDocFolId = UUID.randomUUID().toString();
    }


}
