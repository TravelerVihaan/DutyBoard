package com.github.vihaan.dutyboard.storage.database.mongo.repositories;

import com.github.vihaan.dutyboard.storage.database.mongo.documents.WorkerDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerMongoRepository extends MongoRepository<WorkerDocument, String> {
}
