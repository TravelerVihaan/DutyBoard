package com.github.vihaan.dutyboard.worker;

import com.github.vihaan.dutyboard.worker.absence.Absence;

import java.util.Objects;

public class Worker {

    private final String name;
    private final String surname;
    private String visibleName;
    private Absence absence;

    public Worker(String name, String surname, String visibleName, Absence absence) {
        this.name = name;
        this.surname = surname;
        this.visibleName = visibleName;
        this.absence = absence;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getVisibleName() {
        return visibleName;
    }

    public void setVisibleName(String visibleName) {
        this.visibleName = visibleName;
    }

    public Absence getAbsence() {
        return absence;
    }

    public void setAbsence(Absence absence) {
        this.absence = absence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return Objects.equals(name, worker.name) &&
                Objects.equals(surname, worker.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", visibleName='" + visibleName + '\'' +
                ", absence=" + absence +
                '}';
    }
}
