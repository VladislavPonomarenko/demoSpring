package com.demo.spring;
import com.demo.spring.storage.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
@SpringBootApplication
public class SpringBootUploadFileApplication implements CommandLineRunner{

    @Resource
    StorageService storageService;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootUploadFileApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        storageService.deleteAll();
        storageService.init();
    }
}
