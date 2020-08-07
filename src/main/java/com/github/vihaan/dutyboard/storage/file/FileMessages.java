package com.github.vihaan.dutyboard.storage.file;

interface FileMessages {
    static final String IO_READ_PROBLEM = "Problem occured during reading data from file";
    static final String IO_WRITE_PROBLEM = "Problem occured during writing data to file";
    static final String FILE_NOT_FOUND = "File not found. Workers list will be empty and it can cause some troubles or incorrect program work";
}
