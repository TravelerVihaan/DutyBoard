package com.github.vihaan.dutyboard.storage.database.mongo.documents;

import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

@Profile("mongo-storage")
@Document(collection = "boards")
public class BoardDocument {

    @Id
    private String id;
    @NotNull
    @Indexed(unique = true)
    private String boardName;
    @NotNull
    private String dutyType;
    @NotNull
    private WorkerDocument currentWorker;
    @NotNull
    private List<WorkerDocument> workers;

    public BoardDocument() { }

    public BoardDocument(@NotNull String dutyType, WorkerDocument currentWorker, List<WorkerDocument> workers) {
        this.dutyType = dutyType;
        this.currentWorker = currentWorker;
        this.workers = workers;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDutyType() {
        return dutyType;
    }

    public void setDutyType(String dutyType) {
        this.dutyType = dutyType;
    }

    public List<WorkerDocument> getWorkers() {
        return workers;
    }

    public void setWorkers(List<WorkerDocument> workers) {
        this.workers = workers;
    }

    public WorkerDocument getCurrentWorker() {
        return currentWorker;
    }

    public void setCurrentWorker(WorkerDocument currentWorker) {
        this.currentWorker = currentWorker;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoardDocument that = (BoardDocument) o;
        return dutyType.equals(that.dutyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dutyType);
    }

    @Override
    public String toString() {
        return "BoardDocument{" +
                "id='" + id + '\'' +
                ", dutyType='" + dutyType + '\'' +
                ", currentWorker=" + currentWorker +
                ", workers=" + workers +
                '}';
    }
}
