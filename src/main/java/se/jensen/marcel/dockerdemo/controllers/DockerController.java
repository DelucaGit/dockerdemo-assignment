package se.jensen.marcel.dockerdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class DockerController {

    @GetMapping("/welcome")
    public String welcomeToDocker(){
        return "Welcome to docker! - Built by Github Actions 2";
    }
}
