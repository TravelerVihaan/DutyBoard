package com.github.vihaan.dutyboard.storage.database.sql.repositories;

import com.github.vihaan.dutyboard.storage.database.sql.entities.PresenceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PresenceJpaRepository extends JpaRepository<PresenceEntity, Long> { }
