package com.github.vihaan.dutyboard.worker.absence;

public enum Absence {
    PRESENT(true),
    ABSENT(false);

    boolean absence;

    Absence(boolean isPresent) {
        this.absence = isPresent;
    }
}
