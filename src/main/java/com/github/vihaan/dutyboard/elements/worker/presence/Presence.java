package com.github.vihaan.dutyboard.elements.worker.presence;

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
