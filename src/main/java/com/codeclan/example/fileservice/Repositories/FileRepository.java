package com.codeclan.example.fileservice.Repositories;

import com.codeclan.example.fileservice.Models.File;
import com.codeclan.example.fileservice.Projections.EmbedFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFolder.class)
public interface FileRepository extends JpaRepository<File, Long> {
}
