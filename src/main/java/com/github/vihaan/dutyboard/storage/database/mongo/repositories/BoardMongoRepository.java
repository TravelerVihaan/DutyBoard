package com.github.vihaan.dutyboard.storage.database.mongo.repositories;

import com.github.vihaan.dutyboard.storage.database.mongo.documents.BoardDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BoardMongoRepository extends MongoRepository<BoardDocument, String> {

    Optional<BoardDocument> findByDutyTypeEquals(String dutyType);
}
