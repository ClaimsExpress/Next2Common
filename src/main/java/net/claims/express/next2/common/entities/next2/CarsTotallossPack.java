package net.claims.express.next2.common.entities.next2;

import core.adf.accelerator.adfm.utils.StringUtils;
import core.adf.accelerator.model.basics.BaseEntity;
import lombok.Data;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Data
@Table(name = "CARS_TOTALLOSS_PACK")
public class CarsTotallossPack implements Serializable {

    private static final long serialVersionUID = -5773245486268499125L;

    @Column(name = "TOTALLOSS_PACK_AMOUNT")
    private BigDecimal totallossPackAmount;
    @Column(name = "TOTALLOSS_PACK_APPROVED", length = 50)
    private String totallossPackApproved;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TOTALLOSS_PACK_APPROVED_DATE")
    private Date totallossPackApprovedDate;
    @Column(name = "TOTALLOSS_PACK_APPROVED_USER", length = 36)
    private String totallossPackApprovedUser;
    @Column(name = "TOTALLOSS_PACK_CANCEL", length = 1)
    private String totallossPackCancel;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TOTALLOSS_PACK_CANCEL_DATE")
    private Date totallossPackCancelDate;
    @Column(name = "TOTALLOSS_PACK_CANCEL_USER", length = 36)
    private String totallossPackCancelUser;
    @Column(name = "TOTALLOSS_PACK_CURR", length = 100)
    private String totallossPackCurr;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TOTALLOSS_PACK_DATE")
    private Date totallossPackDate;
    @Column(name = "TOTALLOSS_PACK_DESC", length = 1000)
    private String totallossPackDesc;
    @Column(name = "TOTALLOSS_PACK_DETAILS", length = 1000)
    private String totallossPackDetails;
    @Column(name = "TOTALLOSS_PACK_DONE", length = 1)
    private String totallossPackDone;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TOTALLOSS_PACK_DONE_DATE")
    private Date totallossPackDoneDate;
    @Column(name = "TOTALLOSS_PACK_DONE_USER", length = 50)
    private String totallossPackDoneUser;
    @Id
    @Column(name = "TOTALLOSS_PACK_ID", nullable = false, length = 36)
    private String totallossPackId;
    @Column(name = "TOTALLOSS_PACK_NUM", length = 100)
    private String totallossPackNum;
    @Column(name = "TOTALLOSS_PACK_TODO", length = 1)
    private String totallossPackTodo;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TOTALLOSS_PACK_TODO_DATE")
    private Date totallossPackTodoDate;
    @Column(name = "TOTALLOSS_PACK_TODO_USER", length = 36)
    private String totallossPackTodoUser;
    @ManyToOne
    @JoinColumn(name = "TOTALLOSS_INSURANCE_ID")
    private CarsInsurance carsInsurance;
    @OneToMany(orphanRemoval = true, mappedBy = "carsTotallossPack",
               cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsTotallossMng> carsTotallossMngList;

    @OneToMany(orphanRemoval = true, mappedBy = "carsTotallossPack",
               cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @OrderBy("totallossBidSequence asc")
    private List<CarsTotallossBid> carsTotallossBidList;

    @Transient
    private Boolean checkCurrentPack;

    @Transient
    private String checkPack;

    @Column(name = "TOTALLOSS_PACK_MINIMUM_PRICE")
    private BigDecimal totallossPackMinimumPrice;

    @Column(name = "TOTALLOSS_PACK_MINIMUM_BID")
    private BigDecimal totallossPackMinimumBid;


    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TOTALLOSS_PACK_START_DATE")
    private Date totallossPackStartDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TOTALLOSS_PACK_END_DATE")
    private Date totallossPackEndDate;
    @Column(name = "TOTALLOSS_PACK_LOCATION_NOTES", length = 36)
    private String totallossPackLocationNotes;

    @Column(name = "TOTALLOSS_PACK_ONLINE", length = 20)
    private String totallossPackOnline;

    @Transient
    private String bidCurrentWinner;


    @Transient
    private BigDecimal bidCurrentPrice;

    
    public CarsTotallossPack() {
        totallossPackId = UUID.randomUUID().toString();
    }


}
