package com.github.vihaan.dutyboard.storage.database.sql.entities;

import org.springframework.context.annotation.Profile;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Objects;

@Entity
@Table(name = "duty_type")
@Profile("sql-storage")
public class DutyTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_duty")
    private Long id;

    @NotEmpty
    @Column(name = "duty_type", unique = true, nullable = false)
    private String dutyType;

    @OneToOne(mappedBy = "dutyType")
    private BoardEntity board;

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

    public BoardEntity getBoard() {
        return board;
    }

    public void setBoard(BoardEntity board) {
        this.board = board;
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
