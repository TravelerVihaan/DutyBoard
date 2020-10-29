package com.github.vihaan.dutyboard.storage.file;

import java.util.List;

public interface FileReader {

    List<String> loadWorkersRawData();

    String IO_READ_PROBLEM = "Problem occurred during reading data from file";
    String IO_WRITE_PROBLEM = "Problem occurred during writing data to file";
    String FILE_NOT_FOUND = "File not found. Workers list will be empty and it can cause some troubles or incorrect program work";

    String CHARSET_UTF8 = "UTF-8";
}