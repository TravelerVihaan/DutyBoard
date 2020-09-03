package com.github.vihaan.dutyboard.storage.database.sql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DutyTypeJpaRepository extends JpaRepository<DutyTypeEntity, Long> {
}
