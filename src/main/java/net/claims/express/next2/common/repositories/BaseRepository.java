package net.claims.express.next2.common.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface BaseRepository<T, U>  extends JpaRepository<T, String> {

public List<T> findBySysCreatedBy();
}
