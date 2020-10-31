package com.github.vihaan.dutyboard.storage.database.mongo.repositories;

import com.github.vihaan.dutyboard.storage.database.mongo.documents.WorkerDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WorkerMongoRepository extends MongoRepository<WorkerDocument, String> {

    Optional<WorkerDocument> findByNameEqualsAndSurnameEquals(String name, String surname);
}
