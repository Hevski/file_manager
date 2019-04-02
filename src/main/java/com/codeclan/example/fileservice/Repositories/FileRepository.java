package com.codeclan.example.fileservice.Repositories;

import com.codeclan.example.fileservice.Models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface FileRepository extends JpaRepository<File, Long> {
}
