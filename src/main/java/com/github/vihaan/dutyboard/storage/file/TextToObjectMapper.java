package com.github.vihaan.dutyboard.storage.file;

public interface TextToObjectMapper<T> {

    T mapToObjects (String[] rawList);
}
