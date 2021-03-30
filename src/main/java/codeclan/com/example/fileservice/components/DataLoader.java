package codeclan.com.example.fileservice.components;


import codeclan.com.example.fileservice.models.File;
import codeclan.com.example.fileservice.models.Folder;
import codeclan.com.example.fileservice.models.User;
import codeclan.com.example.fileservice.repositories.FileRepository;
import codeclan.com.example.fileservice.repositories.FolderRepository;
import codeclan.com.example.fileservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader(){
    }

    public void run(ApplicationArguments args) {
        User henry = new User("Henry", "Nuggs");
        userRepository.save(henry);
        User alfie = new User("Alfie", "Chonk");
        userRepository.save(alfie);
        Folder stuff = new Folder("Stuff", henry);
        folderRepository.save(stuff);
        Folder morestuff = new Folder("Morestuff", henry);
        folderRepository.save(morestuff);
        File music = new File("Music", "mp3", 200, stuff);
        fileRepository.save(music);
        File pics = new File("Pics", "jpeg", 500, morestuff);
        fileRepository.save(pics);

    }
}
