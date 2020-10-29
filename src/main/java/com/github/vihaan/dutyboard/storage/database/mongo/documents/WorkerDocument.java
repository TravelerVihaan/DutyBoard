package com.github.vihaan.dutyboard.storage.database.mongo.documents;

import org.springframework.context.annotation.Profile;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.Objects;

@Profile("mongo-storage")
@Document(collection = "workers")
public class WorkerDocument {

    @Id
    private String id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String surname;
    @NotEmpty
    private String visibleName;
    @NotEmpty
    private boolean presentStatus;

    private List<BoardDocument> boards;

    public WorkerDocument() { }

    public WorkerDocument(@NotEmpty String name,
                          @NotEmpty String surname,
                          @NotEmpty String visibleName,
                          @NotEmpty boolean presentStatus,
                          List<BoardDocument> boards) {
        this.name = name;
        this.surname = surname;
        this.visibleName = visibleName;
        this.presentStatus = presentStatus;
        this.boards = boards;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getVisibleName() {
        return visibleName;
    }

    public void setVisibleName(String visibleName) {
        this.visibleName = visibleName;
    }

    public boolean isPresentStatus() {
        return presentStatus;
    }

    public void setPresentStatus(boolean presentStatus) {
        this.presentStatus = presentStatus;
    }

    public List<BoardDocument> getBoards() {
        return boards;
    }

    public void setBoards(List<BoardDocument> boards) {
        this.boards = boards;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkerDocument that = (WorkerDocument) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(surname, that.surname) &&
                Objects.equals(visibleName, that.visibleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, visibleName);
    }

    @Override
    public String toString() {
        return "WorkerDocument{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", visibleName='" + visibleName + '\'' +
                ", presentStatus=" + presentStatus +
                ", boards=" + boards +
                '}';
    }

}
