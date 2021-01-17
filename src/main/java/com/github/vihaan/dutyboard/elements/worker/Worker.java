package com.github.vihaan.dutyboard.elements.worker;

import com.github.vihaan.dutyboard.elements.worker.presence.Presence;

import java.util.Objects;

public class Worker {

    private final String name;
    private final String surname;
    private String visibleName;
    private Presence presence;

    public Worker(String name, String surname, String visibleName, Presence presence) {
        this.name = name;
        this.surname = surname;
        this.visibleName = visibleName;
        this.presence = presence;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFullName() { return getName() + " " + getSurname();}

    public String getVisibleName() {
        return visibleName;
    }

    public void setVisibleName(String visibleName) {
        this.visibleName = visibleName;
    }

    public Presence getPresence() {
        return presence;
    }

    public void setPresence(Presence presence) {
        this.presence = presence;
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
                ", presence=" + presence +
                '}';
    }
}
