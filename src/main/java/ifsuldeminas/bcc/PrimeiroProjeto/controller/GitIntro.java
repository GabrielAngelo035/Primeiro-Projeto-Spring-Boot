package ifsuldeminas.bcc.PrimeiroProjeto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitIntro {
    @GetMapping("/intro")
    public String intro(){
        return "Introdução ao Git e GitHub";
    }

}
