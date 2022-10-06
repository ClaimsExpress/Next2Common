package net.claims.express.next2.common.repositories;

import net.claims.express.next2.common.entities.next2.CarsRecoveryHist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface CarsRecoveryHistRepository  extends JpaRepository<CarsRecoveryHist,String> {
}
