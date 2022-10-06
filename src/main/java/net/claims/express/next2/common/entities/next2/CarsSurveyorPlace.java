package net.claims.express.next2.common.entities.next2;

import core.adf.accelerator.model.basics.BaseEntity;
import lombok.Data;

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
@Data
@Table(name = "CARS_SURVEYOR_PLACE")
public class CarsSurveyorPlace implements Serializable {

    private static final long serialVersionUID = 5641825081626684296L;

    @Temporal(TemporalType.DATE)
    @Column(name = "SURVEYOR_AS_DATE", nullable = false)
    private Date surveyorAsDate;
    @Column(name = "SURVEYOR_DEALER", length = 1)
    private String surveyorDealer;
    @Column(name = "SURVEYOR_ORDER", nullable = false)
    private BigDecimal surveyorOrder;
    @Id
    @Column(name = "SURVEYOR_PLACE_ID", nullable = false, length = 36)
    private String surveyorPlaceId;
    @Column(name = "SURVEYOR_REMARKS", length = 1000)
    private String surveyorRemarks;
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
    @ManyToOne
    @JoinColumn(name = "SURVEYOR_ID")
    private CarsSupplier carsSupplier;
    @ManyToOne
    @JoinColumn(name = "SURVEYOR_CAZA_ID")
    private CarsCaza carsCaza;
    @ManyToOne
    @JoinColumn(name = "SURVEYOR_REGION_ID")
    private CarsRegion carsRegion;
    @ManyToOne
    @JoinColumn(name = "SURVEYOR_INCURANCE_ID")
    private CarsInsurance carsInsurance;

    public CarsSurveyorPlace() {
        surveyorPlaceId = UUID.randomUUID().toString();
    }

    public Date getSurveyorAsDate() {
        return surveyorAsDate;
    }

    public void setSurveyorAsDate(Date surveyorAsDate) {
        this.surveyorAsDate = surveyorAsDate;
    }


    public String getSurveyorDealer() {
        return surveyorDealer;
    }

    public void setSurveyorDealer(String surveyorDealer) {
        this.surveyorDealer = surveyorDealer;
    }


    public BigDecimal getSurveyorOrder() {
        return surveyorOrder;
    }

    public void setSurveyorOrder(BigDecimal surveyorOrder) {
        this.surveyorOrder = surveyorOrder;
    }

    public String getSurveyorPlaceId() {
        return surveyorPlaceId;
    }

    public void setSurveyorPlaceId(String surveyorPlaceId) {
        this.surveyorPlaceId = surveyorPlaceId;
    }


    public String getSurveyorRemarks() {
        return surveyorRemarks;
    }

    public void setSurveyorRemarks(String surveyorRemarks) {
        this.surveyorRemarks = surveyorRemarks;
    }

    public String getSysCreatedBy() {
        return sysCreatedBy;
    }

    public void setSysCreatedBy(String sysCreatedBy) {
        this.sysCreatedBy = sysCreatedBy;
    }

    public Date getSysCreatedDate() {
        return sysCreatedDate;
    }

    public void setSysCreatedDate(Date sysCreatedDate) {
        this.sysCreatedDate = sysCreatedDate;
    }

    public String getSysUpdatedBy() {
        return sysUpdatedBy;
    }

    public void setSysUpdatedBy(String sysUpdatedBy) {
        this.sysUpdatedBy = sysUpdatedBy;
    }

    public Date getSysUpdatedDate() {
        return sysUpdatedDate;
    }

    public void setSysUpdatedDate(Date sysUpdatedDate) {
        this.sysUpdatedDate = sysUpdatedDate;
    }

    public Long getSysVersionNumber() {
        return sysVersionNumber;
    }

    public void setSysVersionNumber(Long sysVersionNumber) {
        this.sysVersionNumber = sysVersionNumber;
    }

    public CarsSupplier getCarsSupplier() {
        return carsSupplier;
    }

    public void setCarsSupplier(CarsSupplier carsSupplier) {
        this.carsSupplier = carsSupplier;
    }

    public CarsCaza getCarsCaza() {
        return carsCaza;
    }

    public void setCarsCaza(CarsCaza carsCaza) {
        this.carsCaza = carsCaza;
    }

    public CarsRegion getCarsRegion() {
        return carsRegion;
    }

    public void setCarsRegion(CarsRegion carsRegion) {
        this.carsRegion = carsRegion;
    }

    public CarsInsurance getCarsInsurance() {
        return carsInsurance;
    }

    public void setCarsInsurance(CarsInsurance carsInsurance) {
        this.carsInsurance = carsInsurance;
    }
}
