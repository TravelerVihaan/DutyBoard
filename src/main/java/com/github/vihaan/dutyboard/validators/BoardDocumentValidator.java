package com.github.vihaan.dutyboard.validators;

import com.github.vihaan.dutyboard.storage.database.mongo.documents.BoardDocument;
import com.github.vihaan.dutyboard.storage.database.mongo.repositories.BoardMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Qualifier("document-board-validator")
public class BoardDocumentValidator implements IValidator<BoardDocument>{

    private BoardMongoRepository boardMongoRepository;

    @Autowired
    public BoardDocumentValidator(BoardMongoRepository boardMongoRepository){
        this.boardMongoRepository = boardMongoRepository;
    }

    @Override
    public Set<String> isValid(BoardDocument objectToValidate) {
        Set<String>errors = new HashSet<>();
        if(boardMongoRepository.findByDutyTypeEquals(objectToValidate.getDutyType()).isEmpty()){
            errors.add(DUPLICATE_BOARD_ERROR);
        }
        return isValid(objectToValidate, errors);
    }
}
