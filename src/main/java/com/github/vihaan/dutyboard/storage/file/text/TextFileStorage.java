package com.github.vihaan.dutyboard.storage.file.text;

import com.github.vihaan.dutyboard.duty.DutyType;
import com.github.vihaan.dutyboard.dutyboard.Board;
import com.github.vihaan.dutyboard.storage.file.FileStorage;
import com.github.vihaan.dutyboard.worker.Worker;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;

@Service
@Qualifier("text-storage")
public class TextFileStorage implements FileStorage {

    @Override
    public Worker getWorkerByNameOrSurname(String name) {
        return null;
    }

    @Override
    public Collection<Worker> getAllWorkers() {
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
