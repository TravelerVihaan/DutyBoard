package com.github.vihaan.dutyboard.storage.database.sql.entities;

import org.springframework.context.annotation.Profile;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Set;

@Entity
@Profile("sql-storage")
@Table(name = "workers")
public class WorkerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_worker")
    private Long id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String surname;
    @NotEmpty
    private String visibleName;
    @NotNull
    @ManyToOne
    @JoinColumn(name="presence_id")
    private PresenceEntity presence;
    @ManyToMany(mappedBy = "workers")
    private Set<BoardEntity> boards;

    public WorkerEntity() { }

    public WorkerEntity(@NotEmpty String name,
                        @NotEmpty String surname,
                        @NotEmpty String visibleName,
                        @NotNull PresenceEntity presence) {
        this.name = name;
        this.surname = surname;
        this.visibleName = visibleName;
        this.presence = presence;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public PresenceEntity getPresence() {
        return presence;
    }

    public void setPresence(PresenceEntity presence) {
        this.presence = presence;
    }

    public Set<BoardEntity> getBoards() {
        return boards;
    }

    public void setBoards(Set<BoardEntity> boards) {
        this.boards = boards;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkerEntity that = (WorkerEntity) o;
        return Objects.equals(name, that.name) &&
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
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", visibleName='" + visibleName + '\'' +
                ", presence=" + presence +
                '}';
    }
}
