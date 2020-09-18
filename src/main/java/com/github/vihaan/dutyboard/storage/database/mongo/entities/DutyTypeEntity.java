package com.github.vihaan.dutyboard.storage.database.mongo.entities;

import org.springframework.context.annotation.Profile;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Profile("mongo-storage")
@Document
public class DutyTypeEntity {

    @Id
    private String id;
    private String dutyType;

    public DutyTypeEntity() { }
    public DutyTypeEntity(String id, String dutyType) {
        this.id = id;
        this.dutyType = dutyType;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DutyTypeEntity that = (DutyTypeEntity) o;
        return Objects.equals(dutyType, that.dutyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dutyType);
    }

    @Override
    public String toString() {
        return "DutyTypeEntity{" +
                "id='" + id + '\'' +
                ", dutyType='" + dutyType + '\'' +
                '}';
    }
}
