package com.codeclan.example.fileservice.Projections;

import com.codeclan.example.fileservice.Models.File;
import com.codeclan.example.fileservice.Models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedFolder", types = File.class)
public interface EmbedFolder {
    String getName();
    String getExtension();
    int getSize();
    Folder getFolder();
}
