package net.claims.express.next2.common.entities.next2;


import lombok.Data;
import net.claims.express.next2.common.entities.BaseEntity;

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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Data
@Table(name = "CARS_SUPPLIER")
public class CarsSupplier extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 7383253855851486167L;

    @Column(name = "SUPPLIER_ARABIC_NAME", length = 1000)
    private String supplierArabicName;
    @Column(name = "SUPPLIER_BUS_COUNTRY", length = 2)
    private String supplierBusCountry;
    @Column(name = "SUPPLIER_BUS_PHONE", length = 300)
    private String supplierBusPhone;
    @Column(name = "SUPPLIER_BUS_STREET", length = 60)
    private String supplierBusStreet;
    @Column(name = "SUPPLIER_BUS_ZIP_1", length = 4)
    private String supplierBusZip1;
    @Column(name = "SUPPLIER_EMAIL", length = 300)
    private String supplierEmail;
    @Column(name = "SUPPLIER_FAMILY_NAME", length = 500)
    private String supplierFamilyName;
    @Column(name = "SUPPLIER_FATHER_NAME", length = 100)
    private String supplierFatherName;
    @Column(name = "SUPPLIER_FAX", length = 16)
    private String supplierFax;
    @Temporal(TemporalType.DATE)
    @Column(name = "SUPPLIER_FDATE")
    private Date supplierFdate;
    @Column(name = "SUPPLIER_FIRST_NAME", length = 500)
    private String supplierFirstName;
    @Column(name = "SUPPLIER_GRADE_ID", length = 36)
    private String supplierGradeId;
    @Column(name = "SUPPLIER_HOME_BLDG", length = 60)
    private String supplierHomeBldg;
    @Column(name = "SUPPLIER_HOME_COUNTRY", length = 2)
    private String supplierHomeCountry;
    @Column(name = "SUPPLIER_HOME_PHONE", length = 20)
    private String supplierHomePhone;
    @Column(name = "SUPPLIER_HOME_STREET", length = 60)
    private String supplierHomeStreet;
    @Column(name = "SUPPLIER_HOME_ZIP_1", length = 4)
    private String supplierHomeZip1;
    @Id
    @Column(name = "SUPPLIER_ID", nullable = false, length = 36)
    private String supplierId;
    @Temporal(TemporalType.DATE)
    @Column(name = "SUPPLIER_INACTD")
    private Date supplierInactd;
    @Column(name = "SUPPLIER_INITIAL_COUNT")
    private BigDecimal supplierInitialCount;
    @Column(name = "SUPPLIER_INTERM", length = 5)
    private String supplierInterm;
    @Column(name = "SUPPLIER_MECHANIC_LABOR")
    private BigDecimal supplierMechanicLabor;
    @Column(name = "SUPPLIER_MOBILE_PHONE", length = 500)
    private String supplierMobilePhone;
    @Column(name = "SUPPLIER_NAME", length = 100)
    private String supplierName;
    @Column(name = "SUPPLIER_NCONTACT", length = 35)
    private String supplierNcontact;
    @Column(name = "SUPPLIER_NUM")
    private BigDecimal supplierNum;
    @Column(name = "SUPPLIER_OUT_NETWORK", length = 1)
    private String supplierOutNetwork;
    @Column(name = "SUPPLIER_PAINT_LABOR")
    private BigDecimal supplierPaintLabor;
    @Column(name = "SUPPLIER_PREFIX_FAM", length = 10)
    private String supplierPrefixFam;
    @Column(name = "SUPPLIER_REG_NUM", length = 200)
    private String supplierRegNum;
    @Column(name = "SUPPLIER_SHOW_IN_LIST", length = 1)
    private String supplierShowInList;
    @Column(name = "SUPPLIER_SMS", length = 1)
    private String supplierSms;
    @Column(name = "SUPPLIER_SRC", length = 3)
    private String supplierSrc;
    @Column(name = "SUPPLIER_TAXE", length = 1)
    private String supplierTaxe;
    @Column(name = "SUPPLIER_TITRE", length = 2)
    private String supplierTitre;
    @Column(name = "SUPPLIER_TVA_NUM", length = 200)
    private String supplierTvaNum;
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
    @OneToMany(orphanRemoval = true, mappedBy = "carsSupplier", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsBodilyInjury> carsBodilyInjuryList;
    @OneToMany(orphanRemoval = true, mappedBy = "carsSupplier", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsPartsPricingLog> carsPartsPricingLogList;
    @OneToMany(orphanRemoval = true, mappedBy = "carsSupplier", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsResPay> carsResPayList;
    @OneToMany(orphanRemoval = true, mappedBy = "carsSupplier", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsDerPartsPricing> carsDerPartsPricingList;
    @OneToMany(orphanRemoval = true, mappedBy = "carsSupplier", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsDer> carsDerList;
    @OneToMany(orphanRemoval = true, mappedBy = "carsSupplier", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsPayDeletedHistory> carsPayDeletedHistoryList;
    @OneToMany(orphanRemoval = true, mappedBy = "carsSupplier", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsLossCar> carsLossCarList;
    @OneToMany(orphanRemoval = true, mappedBy = "carsSupplier", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsLossTowing> carsLossTowingList;
    @OneToMany(orphanRemoval = true, mappedBy = "carsSupplier", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsSurvey> carsSurveyList;
    @OneToMany(orphanRemoval = true, mappedBy = "carsSupplier", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsTotallossMng> carsTotallossMngList;
    @OneToMany(orphanRemoval = true, mappedBy = "carsSupplier", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsTotallossDispatch> carsTotallossDispatchList;
    @OneToMany(orphanRemoval = true, mappedBy = "carsSupplier", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsInvoiceRecp> carsInvoiceRecpList;
    @OneToMany(orphanRemoval = true, mappedBy = "carsSupplier", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsQuotationHistory> carsQuotationHistoryList;
    @OneToMany(orphanRemoval = true, mappedBy = "carsSupplier", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsPartsDealer> carsPartsDealerList;
    @OneToMany(orphanRemoval = true, mappedBy = "carsSupplier", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsSupplierDetails> carsSupplierDetailsList;
    @OneToMany(orphanRemoval = true, mappedBy = "carsSupplier", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsSurveyRequest> carsSurveyRequestList;
    @OneToMany(orphanRemoval = true, mappedBy = "carsSupplier", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsPreRiskSurvey> carsPreRiskSurveyList;
    @OneToMany(orphanRemoval = true, mappedBy = "carsSupplier", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsInvoiceChecking> carsInvoiceCheckingList;
    @ManyToOne
    @JoinColumn(name = "SUPPLIER_BUS_ID")
    private CarsTown carsTown;
    @OneToMany(orphanRemoval = true, mappedBy = "carsSupplier", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsSurveyorPlace> carsSurveyorPlaceList;
    @OneToMany(orphanRemoval = true, mappedBy = "carsSupplier", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsDerLog> carsDerLogList;
    @OneToMany(orphanRemoval = true, mappedBy = "carsSupplier", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsTotallossQuote> carsTotallossQuoteList;
    @OneToMany(orphanRemoval = true, mappedBy = "carsSupplier", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsMaterialDamage> carsMaterialDamageList;
    @OneToMany(orphanRemoval = true, mappedBy = "carsSupplier", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsFilesSent> carsFilesSentList;

    @OneToMany(orphanRemoval = true, mappedBy = "carsSupplier", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsRepairShopUser> carsRepairShopUserList;

    @OneToMany(orphanRemoval = true, mappedBy = "carsSupplier", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsRepairShopCapacity> carsRepairShopCapacityList;

    @OneToMany(orphanRemoval = true, mappedBy = "carsSupplier", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsCarReplacement> carsCarReplacementList;

    @OneToMany(orphanRemoval = true, mappedBy = "carsSupplierExpert", cascade = {
               CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsRecoveryToTpCompany> carsRecoveryToTpCompanyList;
    
    @OneToMany(orphanRemoval = true, mappedBy = "carsSupplier", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsRepairShop> carsRepairShopList;
    
    @OneToMany(orphanRemoval = true, mappedBy = "carsSupplier", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsRepairShopUnavailable> carsRepairShopUnavailableList;

    @Transient
    private String supplierFullName;

    @ManyToOne
    @JoinColumn(name = "SUPPLIER_HOME_ID")
    private CarsTown carsHomeTown;

    public CarsSupplier() {
        supplierId = UUID.randomUUID().toString();
    }


}
