package net.claims.express.next2.common.entities.next2;


import lombok.Data;
import net.claims.express.next2.common.entities.BaseEntity;

import java.io.Serializable;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Data
@Entity
@Table(name = "CARS_SUBLINE")
public class CarsSubline extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 7134311992782086386L;

    @Column(name = "SUBLINE_CODE", length = 100)
    private String sublineCode;
    @Column(name = "SUBLINE_DESC", length = 500)
    private String sublineDesc;
    @Id
    @Column(name = "SUBLINE_ID", nullable = false, length = 36)
    private String sublineId;
    @Column(name = "SUBLINE_NOTES", length = 500)
    private String sublineNotes;
    @ManyToOne
    @JoinColumn(name = "SUBLINE_INSURANCE_ID")
    private CarsInsurance carsInsurance;

    public CarsSubline() {
        sublineId = UUID.randomUUID().toString();
    }

}
