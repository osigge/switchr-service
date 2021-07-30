package de.osigge.switchrservice.model;

import java.net.URL;

import lombok.Data;

@Data
public class Video {
    
    private final String name;
    
    private URL videoURL;

    public Video(final String name) {
        this.name = name;
    }

}