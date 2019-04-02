package com.codeclan.example.fileservice;

import com.codeclan.example.fileservice.Models.File;
import com.codeclan.example.fileservice.Models.Folder;
import com.codeclan.example.fileservice.Models.User;
import com.codeclan.example.fileservice.Repositories.FileRepository;
import com.codeclan.example.fileservice.Repositories.FolderRepository;
import com.codeclan.example.fileservice.Repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FileserviceApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canCreateFileAndFolderAndSave(){
		User user2 = new User("Shepherd");
		userRepository.save(user2);
		Folder folder = new Folder("Farm Animals", user2);
		folderRepository.save(folder);
		File file = new File("Chickens", ".txt", 6, folder);
		fileRepository.save(file);
		User user = new User("Farmer");
		userRepository.save(user);

	}
}
