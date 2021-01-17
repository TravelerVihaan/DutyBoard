package com.github.vihaan.dutyboard.storage.database.sql.entities;

import com.github.vihaan.dutyboard.elements.worker.Worker;
import org.springframework.context.annotation.Profile;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

@Entity
@Profile("sql-storage")
@Table(name = "boards")
public class BoardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_board")
    private Long id;
    @NotNull
    @Column(name = "board_name", unique = true, nullable = false)
    private String boardName;
    @ManyToOne
    private WorkerEntity currectWorker;
    @ManyToMany
    @JoinTable(name = "boards_workers",
                joinColumns = {@JoinColumn(name = "board_id",
                        referencedColumnName = "id_board")},
                inverseJoinColumns = {@JoinColumn(name= "worker_id",
                        referencedColumnName = "id_worker")})
    private List<WorkerEntity> workers;
    @NotNull
    @OneToOne
    @JoinColumn(name = "duty_type_id")
    private DutyTypeEntity dutyType;

    public BoardEntity() { }
    public BoardEntity(List<WorkerEntity> workers, @NotNull DutyTypeEntity dutyType) {
        this.workers = workers;
        this.dutyType = dutyType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<WorkerEntity> getWorkers() {
        return workers;
    }

    public void setWorkers(List<WorkerEntity> workers) {
        this.workers = workers;
    }

    public DutyTypeEntity getDutyType() {
        return dutyType;
    }

    public void setDutyType(DutyTypeEntity dutyType) {
        this.dutyType = dutyType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoardEntity that = (BoardEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(workers, that.workers) &&
                dutyType.equals(that.dutyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dutyType);
    }

    @Override
    public String toString() {
        return "BoardEntity{" +
                "workers=" + workers +
                ", dutyType=" + dutyType +
                '}';
    }
}
