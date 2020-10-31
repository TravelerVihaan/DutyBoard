package com.github.vihaan.dutyboard.storage.database.sql.repositories;

import com.github.vihaan.dutyboard.storage.database.sql.entities.WorkerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WorkerJpaRepository extends JpaRepository<WorkerEntity, Long> {
    Optional<WorkerEntity> findByNameEqualsAndSurnameEquals(String name, String surname);

}
