package net.claims.express.next2.common.entities.next2;


import java.io.Serializable;

import java.math.BigDecimal;

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
@NamedQueries({ @NamedQuery(name = "CarsTotallossDispNote.findAll", query = "select o from CarsTotallossDispNote o") })
@Table(name = "CARS_TOTALLOSS_DISP_NOTE")
public class CarsTotallossDispNote implements Serializable {

    private static final long serialVersionUID = -3596854253185640981L;

    
    @Id
    @Column(name = "TOTALLOSS_DISP_NOTE_ID", nullable = false, length = 36)
    private String totallossDispNoteId;
    @Temporal(TemporalType.DATE)
    @Column(name = "TOTALLOSS_TOW_DATE")
    private Date totallossTowDate;
    @Column(name = "TOTALLOSS_TOW_NOTE", length = 1000)
    private String totallossTowNote;
    @Column(name = "TOTALLOSS_TOW_NUM")
    private BigDecimal totallossTowNum;
    @Column(name = "TOTALLOSS_TOW_USER", length = 36)
    private String totallossTowUser;
    @ManyToOne
    @JoinColumn(name = "TOTALLOSS_TOW_CAR_ID")
    private CarsLossCar carsLossCar;

    public CarsTotallossDispNote() {
        totallossDispNoteId = UUID.randomUUID().toString();
    }


}
