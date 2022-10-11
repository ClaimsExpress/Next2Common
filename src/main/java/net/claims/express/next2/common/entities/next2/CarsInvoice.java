package net.claims.express.next2.common.entities.next2;


import net.claims.express.next2.common.entities.BaseEntity;
import java.io.Serializable;
import java.time.LocalDate;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "CARS_INVOICE")
public class CarsInvoice extends BaseEntity {



    @Column(name = "INVOICES_DEDUCTIBLE")
    private BigDecimal invoicesDeductible;
    @Column(name = "INVOICES_DEPRECIATION")
    private BigDecimal invoicesDepreciation;
    @Column(name = "INVOICES_DIFFERENCE_PAY")
    private BigDecimal invoicesDifferencePay;
    @Column(name = "INVOICES_DIFFERENCE_STAT")
    private BigDecimal invoicesDifferenceStat;
    @Column(name = "INVOICES_EVALUATOR", length = 20)
    private String invoicesEvaluator;
    @Column(name = "INVOICES_EXPERT_REPORT_EXIST", length = 1)
    private String invoicesExpertReportExist;
    @Column(name = "INVOICES_FIN_GARAGE_LABOR")
    private BigDecimal invoicesFinGarageLabor;
    @Column(name = "INVOICES_FIN_GARAGE_PAINT")
    private BigDecimal invoicesFinGaragePaint;
    @Column(name = "INVOICES_FIN_GARAGE_PARTS")
    private BigDecimal invoicesFinGarageParts;
    @Column(name = "INVOICES_FIN_SUPPLIER_LABOR")
    private BigDecimal invoicesFinSupplierLabor;
    @Column(name = "INVOICES_FIN_SUPPLIER_PAINT")
    private BigDecimal invoicesFinSupplierPaint;
    @Column(name = "INVOICES_FIN_SUPPLIER_PARTS")
    private BigDecimal invoicesFinSupplierParts;
    @Column(name = "INVOICES_GARAGE_DEDUCTIBLE")
    private BigDecimal invoicesGarageDeductible;
    @Column(name = "INVOICES_GARAGE_DEPRECIATION")
    private BigDecimal invoicesGarageDepreciation;
    @Column(name = "INVOICES_GARAGE_DISCOUNT")
    private BigDecimal invoicesGarageDiscount;
    @Column(name = "INVOICES_GARAGE_LABOR")
    private BigDecimal invoicesGarageLabor;
    @Column(name = "INVOICES_GARAGE_PARTS")
    private BigDecimal invoicesGarageParts;
    @Column(name = "INVOICES_GARAGE_TOTAL")
    private BigDecimal invoicesGarageTotal;
    @Column(name = "INVOICES_GARAGE_TVA")
    private BigDecimal invoicesGarageTva;
    @Id
    @Column(name = "INVOICES_ID", nullable = false, length = 36)
    private String invoicesId;
    @Column(name = "INVOICES_INJURED_EXIST", length = 1)
    private String invoicesInjuredExist;
    @Column(name = "INVOICES_LABOR")
    private BigDecimal invoicesLabor;
    @Column(name = "INVOICES_MATERIAL_DAMAGE_EXIST", length = 1)
    private String invoicesMaterialDamageExist;
    @Column(name = "INVOICES_PARTS")
    private BigDecimal invoicesParts;
    @Column(name = "INVOICES_RATE")
    private BigDecimal invoicesRate;
    @Column(name = "INVOICES_RATE_EXIST", length = 1)
    private String invoicesRateExist;
    @Column(name = "INVOICES_REQUEST_FORM_EXIST", length = 1)
    private String invoicesRequestFormExist;
    @Column(name = "INVOICES_RESPONSIBILITY_EXIST", length = 1)
    private String invoicesResponsibilityExist;
    @Column(name = "INVOICES_SECOND_DEDUCTIBLES")
    private BigDecimal invoicesSecondDeductibles;
    @Column(name = "INVOICES_SECOND_DEPRECIATION")
    private BigDecimal invoicesSecondDepreciation;
    @Column(name = "INVOICES_SECOND_LABOR")
    private BigDecimal invoicesSecondLabor;
    @Column(name = "INVOICES_SECOND_PARTS")
    private BigDecimal invoicesSecondParts;
    @Column(name = "INVOICES_SECOND_TOTAL")
    private BigDecimal invoicesSecondTotal;
    @Column(name = "INVOICES_SUBROGATION_EXIST", length = 1)
    private String invoicesSubrogationExist;
    @Column(name = "INVOICES_SURVEY_EXIST", length = 1)
    private String invoicesSurveyExist;
    @Column(name = "INVOICES_TOTAL")
    private BigDecimal invoicesTotal;

    @Column(name = "LOG_USER")
    private String logUser;

    @Column(name = "LOG_DATE_TIME")
    private LocalDateTime logDateTime;

    @Column(name = "LOG_COMPUTER")
    private String logComputer;

    @Column(name = "LOG_SOFTWARE")
    private String logSoftware;

    @OneToMany(orphanRemoval = true, mappedBy = "carsInvoice", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsInvoiceChecking> carsInvoiceCheckingList;
    @ManyToOne
    @JoinColumn(name = "INVOICES_CAR_ID")
    private CarsLossCar carsLossCar;


    public CarsInvoice() {
        this.invoicesId = UUID.randomUUID().toString();}
    }



