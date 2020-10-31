package com.github.vihaan.dutyboard.validators;

import com.github.vihaan.dutyboard.storage.database.sql.entities.BoardEntity;
import com.github.vihaan.dutyboard.storage.database.sql.repositories.BoardJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Qualifier("jpa-board-validator")
public class BoardEntityValidator implements IValidator<BoardEntity> {

    private BoardJpaRepository boardJpaRepository;

    @Autowired
    public BoardEntityValidator(BoardJpaRepository boardJpaRepository) {
        this.boardJpaRepository = boardJpaRepository;
    }

    @Override
    public Set<String> isValid(BoardEntity objectToValidate) {
        Set<String>errors = new HashSet<>();
        if(boardJpaRepository.findByDutyType_DutyType(objectToValidate.getDutyType().getDutyType()).isEmpty()){
            errors.add(DUPLICATE_BOARD_ERROR);
        }
        return isValid(objectToValidate, errors);
    }
}
