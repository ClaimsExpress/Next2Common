package net.claims.express.next2.common.entities.next2;

import core.adf.accelerator.adfm.utils.StringUtils;
import core.adf.accelerator.model.basics.BaseEntity;
import lombok.Data;

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
@Table(name = "CARS_SURVEY_REQUEST")
public class CarsSurveyRequest implements Serializable {

    private static final long serialVersionUID = 7002368921329530825L;

    @Column(name = "RE_SURVEY_REQUEST", length = 1)
    private String reSurveyRequest;
    @Temporal(TemporalType.DATE)
    @Column(name = "SURVEY_DISPATCH_DATE")
    private Date surveyDispatchDate;
    @Column(name = "SURVEY_DISPATCH_NOTE", length = 500)
    private String surveyDispatchNote;
    @Column(name = "SURVEY_DISPATCH_USER", length = 36)
    private String surveyDispatchUser;
    @Column(name = "SURVEY_REQUEST_ADDRESS", length = 500)
    private String surveyRequestAddress;
    @Column(name = "SURVEY_REQUEST_CANCELED", length = 50)
    private String surveyRequestCanceled;
    @Temporal(TemporalType.DATE)
    @Column(name = "SURVEY_REQUEST_DATE")
    private Date surveyRequestDate;
    @Column(name = "SURVEY_REQUEST_GARAGE_NAME", length = 500)
    private String surveyRequestGarageName;
    @Id
    @Column(name = "SURVEY_REQUEST_ID", nullable = false, length = 36)
    private String surveyRequestId;
    @Column(name = "SURVEY_REQUEST_NOTE", length = 1000)
    private String surveyRequestNote;
    @Column(name = "SURVEY_REQUEST_ORDER")
    private BigDecimal surveyRequestOrder;
    @Column(name = "SURVEY_REQUEST_PHONE", length = 200)
    private String surveyRequestPhone;
    @Column(name = "SURVEY_REQUEST_SEQUENCE")
    private BigDecimal surveyRequestSequence;
    @Column(name = "SURVEY_REQUEST_STATUS", length = 36)
    private String surveyRequestStatus;
    @Column(name = "SURVEY_REQUEST_USER", length = 36)
    private String surveyRequestUser;
    @Column(name = "SURVEY_REQUEST_VIP", length = 50)
    private String surveyRequestVip;
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
    @JoinColumn(name = "SURVEY_DEPARTURE_TOWN_ID")
    private CarsTown carsTown;
    @ManyToOne
    @JoinColumn(name = "SURVEY_REQUEST_TOWN_ID")
    private CarsTown carsTownRequest;
    @ManyToOne
    @JoinColumn(name = "SURVEY_REQUEST_SURVEYOR_ID")
    private CarsSupplier carsSupplier;
    @ManyToOne
    @JoinColumn(name = "SURVEY_REQUEST_GARAGE_ID")
    private CarsSupplier carsGarage;
    @OneToMany(orphanRemoval = true, mappedBy = "carsSurveyRequest", cascade = {
               CascadeType.PERSIST, CascadeType.MERGE })
    private List<CarsSurvey> carsSurveyList;
    @ManyToOne
    @JoinColumn(name = "SURVEY_REQUEST_CAR_ID")
    private CarsLossCar carsLossCar;

    @ManyToOne
    @JoinColumn(name = "SURVEY_REQUEST_MATERIAL_ID")
    private CarsMaterialDamage carsMaterialDamage;

    @Transient
    private String garageName;

    @Transient
    private String townName;


    public CarsSurveyRequest() {
        surveyRequestId = UUID.randomUUID().toString();
    }


}
