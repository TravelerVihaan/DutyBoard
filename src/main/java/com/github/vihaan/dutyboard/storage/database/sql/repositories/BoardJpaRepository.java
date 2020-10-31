package com.github.vihaan.dutyboard.storage.database.sql.repositories;

import com.github.vihaan.dutyboard.storage.database.sql.entities.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotEmpty;
import java.util.Optional;

@Repository
public interface BoardJpaRepository extends JpaRepository<BoardEntity, Long> {
    Optional<BoardEntity> findByDutyType_DutyType(@NotEmpty String dutyType);
}
