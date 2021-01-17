package com.github.vihaan.dutyboard.domain.worker.presence;

public enum Presence {
    PRESENT(true),
    ABSENT(false);

    boolean presence;

    Presence(boolean isPresent) {
        this.presence = isPresent;
    }

    boolean getPresence(){
        return presence;
    }
}
