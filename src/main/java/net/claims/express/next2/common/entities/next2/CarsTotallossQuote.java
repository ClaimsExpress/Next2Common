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
@NamedQueries({ @NamedQuery(name = "CarsTotallossQuote.findAll", query = "select o from CarsTotallossQuote o") })
@Table(name = "CARS_TOTALLOSS_QUOTE")
public class CarsTotallossQuote implements Serializable {

    private static final long serialVersionUID = 1068203265318246617L;

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
    @Column(name = "TOTALLOSS_QUOTER_ID")
    private BigDecimal totallossQuoterId;
    @Column(name = "TOTALLOSS_QUOTE_AMOUNT")
    private BigDecimal totallossQuoteAmount;
    @Column(name = "TOTALLOSS_QUOTE_CANCEL", length = 1)
    private String totallossQuoteCancel;
    @Column(name = "TOTALLOSS_QUOTE_CURR", length = 36)
    private String totallossQuoteCurr;
    @Temporal(TemporalType.DATE)
    @Column(name = "TOTALLOSS_QUOTE_DATE")
    private Date totallossQuoteDate;
    @Column(name = "TOTALLOSS_QUOTE_DETAILS", length = 1000)
    private String totallossQuoteDetails;
    @Column(name = "TOTALLOSS_QUOTE_DONE", length = 1)
    private String totallossQuoteDone;
    @Id
    @Column(name = "TOTALLOSS_QUOTE_ID", nullable = false, length = 36)
    private String totallossQuoteId;
    @Column(name = "TOTALLOSS_QUOTE_NAME", length = 1000)
    private String totallossQuoteName;
    @Column(name = "TOTALLOSS_QUOTE_TODO", length = 1)
    private String totallossQuoteTodo;
    @Column(name = "TOTALLOSS_QUOTE_TYPE", length = 10)
    private String totallossQuoteType;
    @Column(name = "TOTALLOSS_QUOTE_USER", length = 36)
    private String totallossQuoteUser;
    @ManyToOne
    @JoinColumn(name = "TOTALLOSS_QUOTE_CAR_ID")
    private CarsLossCar carsLossCar;
    @ManyToOne
    @JoinColumn(name = "TOTALLOSS_QUOTE_RS_ID")
    private CarsSupplier carsSupplier;

    public CarsTotallossQuote() {
        totallossQuoteId = UUID.randomUUID().toString();
    }

}
