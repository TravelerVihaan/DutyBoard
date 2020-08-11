package com.github.vihaan.dutyboard.dutyboard;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class Boards {

    private Map<String, IBoard> boards = new HashMap<>();

    public IBoard getBoard(String boardName){
        return boards.get(boardName);
    }

    public Map<String, IBoard> getBoards(){ return boards; }

    public void addBoard(String boardName, IBoard board){
        boards.put(boardName, board);
    }

}
