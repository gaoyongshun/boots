package com.gys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@SpringBootApplication
@RestController
public class BootesApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootesApplication.class,args);
    }

    @RequestMapping("/index")
    public void index(HttpServletResponse response) throws IOException {
        response.getOutputStream().println("hello world");
    }

}
