package com.github.vihaan.dutyboard.worker.absence;

public enum Presence {
    PRESENT(true),
    ABSENT(false);

    boolean presence;

    Presence(boolean isPresent) {
        this.presence = isPresent;
    }
}
