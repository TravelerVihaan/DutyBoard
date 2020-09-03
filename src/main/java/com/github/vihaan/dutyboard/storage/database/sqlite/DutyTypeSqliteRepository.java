package com.github.vihaan.dutyboard.storage.database.sqlite;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DutyTypeSqliteRepository  extends JpaRepository<DutyTypeEntity, Long> {
}
