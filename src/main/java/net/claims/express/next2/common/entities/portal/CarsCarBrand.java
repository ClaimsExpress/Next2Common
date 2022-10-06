package net.claims.express.next2.common.entities.portal;

import lombok.Data;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
@Getter
@Setter
@Entity
@Table(name = "V_LOSS_CAR2")
@EntityListeners(AuditingEntityListener.class)
public class CarsCarBrand {
    @Id
    @Column(name = "CAR_BRAND_ID", nullable = false)
    private String carBrandId;
    @Column(name = "CAR_BRAND_CODE", nullable = true)
    private String carBrandCode;
    @Column(name = "CAR_BRAND_DESCRIPTION", nullable = true)
    private String carBrandDescription ;




}
