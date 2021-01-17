package com.github.vihaan.dutyboard.storage.file.text.mapper;

public interface TextToObjectMapper<T> {

    T mapToObjects (String[] rawList);
}
