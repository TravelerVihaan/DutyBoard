package com.github.vihaan.dutyboard.storage.file.text;

import com.github.vihaan.dutyboard.duty.DutyType;
import com.github.vihaan.dutyboard.dutyboard.Board;
import com.github.vihaan.dutyboard.storage.file.FileStorage;
import com.github.vihaan.dutyboard.worker.Worker;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiPredicate;

@Service
@Qualifier("text-storage")
public class TextFileStorage implements FileStorage {

    private Set<Worker> workersData;
    private Set<Board> boardsData;

    public TextFileStorage() { }

    @Override
    public Worker getWorkerByNameOrSurname(String name) throws IllegalArgumentException{
        if(StringUtils.isEmpty(name)){
            throw new IllegalArgumentException();
        }
        return null;
        //workersData.stream().findFirst(worker -> worker.getSurname().equalsIgnoreCase(name) || worker.getFullName().equalsIgnoreCase(name));
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

    private final BiPredicate<Worker, String> nameComparison = (Worker worker, String name)
            -> worker.getSurname().equalsIgnoreCase(name) || worker.getFullName().equalsIgnoreCase(name);

    private static final Logger LOGGER = LoggerFactory.getLogger(TextFileStorage.class);
}
