package net.claims.express.next2.common.repositories;

import net.claims.express.next2.common.entities.portal.CarsCarShape;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories

public interface CarsCarShapeRepository   extends JpaRepository<CarsCarShape,String> {

}
