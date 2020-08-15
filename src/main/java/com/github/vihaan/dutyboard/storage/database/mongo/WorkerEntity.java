package com.github.vihaan.dutyboard.storage.database.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class WorkerEntity {

    @Id
    private String id;
    private String name;
    private String surname;
    private String visibleName;

    public WorkerEntity() { }

    public WorkerEntity(String id, String name, String surname, String visibleName) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.visibleName = visibleName;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkerEntity that = (WorkerEntity) o;
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
        return "WorkerEntity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", visibleName='" + visibleName + '\'' +
                '}';
    }
}
