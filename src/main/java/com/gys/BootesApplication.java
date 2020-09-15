package com.gys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

@SpringBootApplication
@RestController
public class BootesApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootesApplication.class,args);
    }

    @RequestMapping("/index")
    public void index(HttpServletResponse response) throws IOException {
        ServletOutputStream out = response.getOutputStream();
        out.println("hello world");
        out.close();
    }

    @RequestMapping("/login")
    public void login(HttpServletResponse response) throws IOException {
        ServletOutputStream out = response.getOutputStream();
        out.println("登录");
        out.close();
    }
}
