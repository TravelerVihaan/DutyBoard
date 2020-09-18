package com.github.vihaan.dutyboard.storage.database.sql.entities;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Objects;

@Entity
@Table(name = "presence")
public class PresenceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_presence")
    private Long id;

    @NotEmpty
    private boolean isPresent;

    public PresenceEntity() { }
    public PresenceEntity(Long id, boolean isPresent) {
        this.id = id;
        this.isPresent = isPresent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PresenceEntity that = (PresenceEntity) o;
        return isPresent == that.isPresent;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isPresent);
    }

    @Override
    public String toString() {
        return "PresenceEntity{" +
                "id=" + id +
                ", isPresent=" + isPresent +
                '}';
    }
}
