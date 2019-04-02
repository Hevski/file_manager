package com.codeclan.example.fileservice.Components;

import com.codeclan.example.fileservice.Models.File;
import com.codeclan.example.fileservice.Models.Folder;
import com.codeclan.example.fileservice.Models.User;
import com.codeclan.example.fileservice.Repositories.FileRepository;
import com.codeclan.example.fileservice.Repositories.FolderRepository;
import com.codeclan.example.fileservice.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        User robert = new User("Robert");
        userRepository.save(robert);

        User kyle = new User("Kyle");
        userRepository.save(kyle);

        Folder farmAnimals = new Folder("Farm Animals", robert);
        folderRepository.save(farmAnimals);

        Folder farmStock = new Folder("Farm Stock", robert);
        folderRepository.save(farmStock);

        File pigs = new File("Pigs", ".txt", 8, farmAnimals);
        fileRepository.save(pigs);

        File shed = new File("Shed Items", ".txt", 7, farmStock);
        fileRepository.save(shed);
    }




}
