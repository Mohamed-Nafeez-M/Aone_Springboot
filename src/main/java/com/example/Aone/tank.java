package com.example.pcm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class tank {   // Class name should start with Capital letter (Java standard)

    @GetMapping("/a_one")
    public String redirectToProject() {
        return "forward:/index.html";
    }
}
