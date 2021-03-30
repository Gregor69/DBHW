package codeclan.com.example.fileservice;

import codeclan.com.example.fileservice.models.Folder;
import codeclan.com.example.fileservice.models.User;
import codeclan.com.example.fileservice.repositories.FileRepository;
import codeclan.com.example.fileservice.repositories.FolderRepository;
import codeclan.com.example.fileservice.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FileserviceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;



	@Test
	public void createFolder(){
		User user = new User("Henry", "Nuggs");
		userRepository.save(user);
		Folder stuff = new Folder("Stuff", user);
		folderRepository.save(stuff);


	}

}
