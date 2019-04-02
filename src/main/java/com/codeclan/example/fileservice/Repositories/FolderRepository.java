package com.codeclan.example.fileservice.Repositories;

import com.codeclan.example.fileservice.Models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FolderRepository extends JpaRepository<Folder, Long> {
}
