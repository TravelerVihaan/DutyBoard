package com.github.vihaan.dutyboard.storage.file.json;

import com.github.vihaan.dutyboard.domain.duty.DutyType;
import com.github.vihaan.dutyboard.domain.dutyboard.Board;
import com.github.vihaan.dutyboard.storage.file.FileStorage;
import com.github.vihaan.dutyboard.domain.worker.Worker;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;

@Service
@Qualifier("json-storage")
public class JsonFileStorage implements FileStorage {
    @Override
    public Worker getWorkerByNameOrSurname(String name) {
        return null;
    }

    @Override
    public Collection<Worker> getAllWorkers() {
        return null;
    }

    @Override
    public Worker getWorkerByName(String name) {
        return null;
    }

    @Override
    public Set<Board> getBoards() {
        return null;
    }

    @Override
    public Optional<Board> getBoard(DutyType dutyType) {
        return Optional.empty();
    }

    @Override
    public boolean saveBoard(Board board) {
        return false;
    }

    @Override
    public boolean deleteBoard(Board board) {
        return false;
    }

    @Override
    public boolean saveWorker(Worker worker) {
        return false;
    }

    @Override
    public boolean deleteWorker(Worker worker) {
        return false;
    }
}
