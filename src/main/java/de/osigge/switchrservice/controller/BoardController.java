package de.osigge.switchrservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import de.osigge.switchrservice.model.Board;

@Controller("/boards")
public class BoardController {
    
    @GetMapping
    public @ResponseBody ResponseEntity<Board> getBoard() {
        return ResponseEntity.ok(new Board("Test"));
    }

}