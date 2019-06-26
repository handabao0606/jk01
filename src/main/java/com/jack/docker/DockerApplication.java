package com.jack.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@SpringBootApplication
@Controller
public class DockerApplication {

   /* @RequestMapping("/")
    public String index(){
        return "index";
    }*/

    @RequestMapping("/")
    public String helloHtml(HashMap<String, Object> map, Model model){
        model.addAttribute("say","欢迎欢迎,热烈欢迎");
        map.put("hello", "欢迎进入HTML页面");
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerApplication.class, args);
    }

}
