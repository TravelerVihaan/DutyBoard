package com.github.vihaan.dutyboard.storage.database.mongo.repositories;

import com.github.vihaan.dutyboard.storage.database.mongo.entities.DutyTypeEntity;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Profile("mongo-storage")
@Repository
public interface DutyTypeMongoRepository extends MongoRepository<DutyTypeEntity, String> {
}
