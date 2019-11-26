package hello;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import storage.FileUploadController;
import java.io.File;

@SpringBootApplication
public class Application {
    public static void main(String[] args) throws Exception {
        new File(FileUploadController.uploadDirectory).mkdir();
        SpringApplication.run(Application.class, args);
    }
}
