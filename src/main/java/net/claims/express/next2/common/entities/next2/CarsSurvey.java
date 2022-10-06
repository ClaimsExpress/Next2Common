package net.claims.express.next2.common.entities.next2;


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
@Table(name = "CARS_SURVEY")
public class CarsSurvey implements Serializable {

    private static final long serialVersionUID = -2194249262951952238L;

    @Temporal(TemporalType.DATE)
    @Column(name = "SURVEY_ANSWER_RECEIVED_DATE")
    private Date surveyAnswerReceivedDate;
    @Column(name = "SURVEY_ANSWER_RECEIVED_EXIST", length = 1)
    private String surveyAnswerReceivedExist;
    @Column(name = "SURVEY_AUTHORIZED", length = 1)
    private String surveyAuthorized;
    @Temporal(TemporalType.DATE)
    @Column(name = "SURVEY_CANCELLED_DATE")
    private Date surveyCancelledDate;
    @Column(name = "SURVEY_CANCELLED_TLV", length = 1)
    private String surveyCancelledTlv;
    @Column(name = "SURVEY_CANCELLED_USER", length = 36)
    private String surveyCancelledUser;
    @Column(name = "SURVEY_CANCEL_ASSESS", length = 3)
    private String surveyCancelAssess;
    @Temporal(TemporalType.DATE)
    @Column(name = "SURVEY_CANCEL_ASSESS_DATE")
    private Date surveyCancelAssessDate;
    @Column(name = "SURVEY_CANCEL_ASSESS_REASON", length = 500)
    private String surveyCancelAssessReason;
    @Column(name = "SURVEY_CANCEL_ASSESS_USER", length = 50)
    private String surveyCancelAssessUser;
    @Column(name = "SURVEY_CANCEL_REQUEST_SURVEY", length = 1)
    private String surveyCancelRequestSurvey;
    @Column(name = "SURVEY_CARS_REPAIRED", length = 1)
    private String surveyCarsRepaired;
    @Column(name = "SURVEY_CAR_AREA", length = 500)
    private String surveyCarArea;
    @Column(name = "SURVEY_CAR_BRAND", length = 5)
    private String surveyCarBrand;
    @Column(name = "SURVEY_CAR_LOCATION", length = 500)
    private String surveyCarLocation;
    @Column(name = "SURVEY_CAR_REGISTRATION", length = 1)
    private String surveyCarRegistration;
    @Temporal(TemporalType.DATE)
    @Column(name = "SURVEY_CONFIRMED_DATE")
    private Date surveyConfirmedDate;
    @Column(name = "SURVEY_CONFIRMED_TLV", length = 1)
    private String surveyConfirmedTlv;
    @Column(name = "SURVEY_CONFIRMED_USER", length = 36)
    private String surveyConfirmedUser;
    @Column(name = "SURVEY_CONTACT_PHONE", length = 100)
    private String surveyContactPhone;
    @Column(name = "SURVEY_COST")
    private BigDecimal surveyCost;
    @Column(name = "SURVEY_DAMAGE", length = 100)
    private String surveyDamage;
    @Temporal(TemporalType.DATE)
    @Column(name = "SURVEY_DATE")
    private Date surveyDate;
    @Column(name = "SURVEY_DECLARATION", length = 1)
    private String surveyDeclaration;
    @Column(name = "SURVEY_DONE_AUTHORIZ", length = 1)
    private String surveyDoneAuthoriz;
    @Temporal(TemporalType.DATE)
    @Column(name = "SURVEY_DONE_AUTHORIZ_DATE")
    private Date surveyDoneAuthorizDate;
    @Column(name = "SURVEY_DONE_REQUEST_SURVEY", length = 1)
    private String surveyDoneRequestSurvey;
    @Temporal(TemporalType.DATE)
    @Column(name = "SURVEY_DONE_REQUEST_SURV_DATE")
    private Date surveyDoneRequestSurvDate;
    @Column(name = "SURVEY_DRIVERING_LICENSE", length = 1)
    private String surveyDriveringLicense;
    @Column(name = "SURVEY_EVALUATOR", length = 20)
    private String surveyEvaluator;
    @Column(name = "SURVEY_EXIST", length = 1)
    private String surveyExist;
    @Column(name = "SURVEY_FINAL_OK", length = 1)
    private String surveyFinalOk;
    @Temporal(TemporalType.DATE)
    @Column(name = "SURVEY_FINAL_SURVEY_DATE")
    private Date surveyFinalSurveyDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "SURVEY_GROUP_DATE")
    private Date surveyGroupDate;
    @Id
    @Column(name = "SURVEY_ID", nullable = false, length = 36)
    private String surveyId;
    @Column(name = "SURVEY_KM")
    private BigDecimal surveyKm;
    @Column(name = "SURVEY_LABOR_AMOUNT")
    private BigDecimal surveyLaborAmount;
    @Column(name = "SURVEY_MAJOR_DAMAGE", length = 1)
    private String surveyMajorDamage;
    @Column(name = "SURVEY_MAJOR_DAMAGE_CHECKED", length = 1)
    private String surveyMajorDamageChecked;
    @Temporal(TemporalType.DATE)
    @Column(name = "SURVEY_MAJOR_DAMAGE_DATE")
    private Date surveyMajorDamageDate;
    @Column(name = "SURVEY_MAJOR_DAMAGE_USER", length = 50)
    private String surveyMajorDamageUser;
    @Column(name = "SURVEY_NAME_TO_ASSIGN", length = 20)
    private String surveyNameToAssign;
    @Column(name = "SURVEY_NEED_AUTHORIZ", length = 1)
    private String surveyNeedAuthoriz;
    @Temporal(TemporalType.DATE)
    @Column(name = "SURVEY_NEED_AUTHORIZ_DATE")
    private Date surveyNeedAuthorizDate;
    @Column(name = "SURVEY_NOT_MAJOR_DAMAGE", length = 1)
    private String surveyNotMajorDamage;
    @Temporal(TemporalType.DATE)
    @Column(name = "SURVEY_NOT_MAJOR_DAMAGE_DATE")
    private Date surveyNotMajorDamageDate;
    @Column(name = "SURVEY_NOT_MAJOR_DAMAGE_USER", length = 50)
    private String surveyNotMajorDamageUser;
    @Column(name = "SURVEY_NO_DAYS_FOR_REP")
    private BigDecimal surveyNoDaysForRep;
    @Column(name = "SURVEY_PARTS_AMOUNT")
    private BigDecimal surveyPartsAmount;
    @Column(name = "SURVEY_PIC", length = 1)
    private String surveyPic;
    @Temporal(TemporalType.DATE)
    @Column(name = "SURVEY_PIC_DATE")
    private Date surveyPicDate;
    @Column(name = "SURVEY_PIC_USER", length = 50)
    private String surveyPicUser;
    @Column(name = "SURVEY_PLACE", length = 300)
    private String surveyPlace;
    @Column(name = "SURVEY_PLATE", length = 50)
    private String surveyPlate;
    @Column(name = "SURVEY_REMARKS", length = 2000)
    private String surveyRemarks;
    @Temporal(TemporalType.DATE)
    @Column(name = "SURVEY_REPAIR_DATE")
    private Date surveyRepairDate;
    @Column(name = "SURVEY_REPAIR_HELPPOINT", length = 50)
    private String surveyRepairHelppoint;
    @Column(name = "SURVEY_REPLACE_PARTS", length = 100)
    private String surveyReplaceParts;
    @Temporal(TemporalType.DATE)
    @Column(name = "SURVEY_REP_FOLLOW_DATE")
    private Date surveyRepFollowDate;
    @Column(name = "SURVEY_REP_FOLLOW_DONE", length = 1)
    private String surveyRepFollowDone;
    @Column(name = "SURVEY_REP_FOLLOW_USER", length = 50)
    private String surveyRepFollowUser;
    @Column(name = "SURVEY_REQUEST_REF", length = 200)
    private String surveyRequestRef;
    @Column(name = "SURVEY_REQUEST_SURVEY_PLACE", length = 300)
    private String surveyRequestSurveyPlace;
    @Column(name = "SURVEY_REQUEST_SURVEY_TYPE")
    private BigDecimal surveyRequestSurveyType;
    @Temporal(TemporalType.DATE)
    @Column(name = "SURVEY_RESURVEY_DATE")
    private Date surveyResurveyDate;
    @Column(name = "SURVEY_RESURVEY_EXIST", length = 1)
    private String surveyResurveyExist;
    @Column(name = "SURVEY_SEQUENCE")
    private BigDecimal surveySequence;
    @Column(name = "SURVEY_SHEET", length = 1)
    private String surveySheet;
    @Temporal(TemporalType.DATE)
    @Column(name = "SURVEY_SHEET_DATE")
    private Date surveySheetDate;
    @Column(name = "SURVEY_SHEET_ESTIMATOR", length = 100)
    private String surveySheetEstimator;
    @Column(name = "SURVEY_SHEET_USER", length = 50)
    private String surveySheetUser;
    @Column(name = "SURVEY_SURVEYOR_EST_AMOUNT")
    private BigDecimal surveySurveyorEstAmount;
    @Temporal(TemporalType.DATE)
    @Column(name = "SURVEY_SURVEYOR_EST_DATE")
    private Date surveySurveyorEstDate;
    @Column(name = "SURVEY_SURVEYOR_EST_NAME", length = 50)
    private String surveySurveyorEstName;
    @Column(name = "SURVEY_SURVEYOR_EST_USER", length = 50)
    private String surveySurveyorEstUser;
    @Temporal(TemporalType.DATE)
    @Column(name = "SURVEY_USB_DATE")
    private Date surveyUsbDate;
    @Column(name = "SURVEY_USB_EXIST", length = 1)
    private String surveyUsbExist;
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
    @JoinColumn(name = "SURVEY_CAR_AREA_CITY_ID")
    private CarsTown carsTown;
    @ManyToOne
    @JoinColumn(name = "SURVEY_CAR_AREA_ID")
    private CarsSupplier carsSupplier;
    @ManyToOne
    @JoinColumn(name = "SURVEY_REQUEST_ID")
    private CarsSurveyRequest carsSurveyRequest;
    @ManyToOne
    @JoinColumn(name = "FILES_ID")
    private CarsFilesSent carsFilesSent;
    @ManyToOne
    @JoinColumn(name = "SURVEY_CAR_ID")
    private CarsLossCar carsLossCar;

    public CarsSurvey() {
        surveyId = UUID.randomUUID().toString();
    }

}
