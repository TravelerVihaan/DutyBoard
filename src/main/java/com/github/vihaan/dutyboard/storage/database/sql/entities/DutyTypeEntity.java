package com.github.vihaan.dutyboard.storage.database.sql.entities;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Objects;

@Entity
@Table(name = "duty_type")
public class DutyTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_duty")
    private Long id;

    @NotEmpty
    private String dutyType;

    public DutyTypeEntity() {}
    public DutyTypeEntity(Long id, String dutyType) {
        this.id = id;
        this.dutyType = dutyType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
