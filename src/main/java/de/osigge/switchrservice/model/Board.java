package de.osigge.switchrservice.model;

import java.util.List;

import lombok.Data;

@Data
public class Board {
    
    private final String name;

    private String description;

    private List<Video> videos;

    public Board(final String name) {
        this.name = name;
    }

}