package com.github.vihaan.dutyboard.storage.database.mongo;

import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Profile("mongo-storage")
@Repository
public interface DutyTypeMongoRepository extends MongoRepository<DutyTypeEntity, String> {
}
