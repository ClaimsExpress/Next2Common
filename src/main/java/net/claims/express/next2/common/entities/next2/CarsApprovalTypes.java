package net.claims.express.next2.common.entities.next2;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import net.claims.express.next2.common.entities.BaseEntity;

@Data
@Entity
@Table(name = "CARS_APPROVALS_TYPES")
public  class CarsApprovalTypes extends BaseEntity {

	
	@Id
	@Column(name = "APP_TYPE_ID")
	private String appTypeId;
	@ManyToOne
	@JoinColumn(name="APP_INSURANCE_ID")
	private CarsInsurance carsInsurance; //q
	@Column(name = "APP_TYPE")
	private String appType;
	@Column(name = "APP_USER")
	private String appUser;
	@Column(name = "APP_AMOUNT_FROM")
	private double appAmountFrom;
	@Column(name = "APP_AMOUNT_TO")
	private double appAmountTo;
	@Column(name="APP_SEND_EMAIL")
	private String appSendEmail;

	
	public CarsApprovalTypes() {
		this.appTypeId = UUID.randomUUID().toString();
	}
	
	
	
}
