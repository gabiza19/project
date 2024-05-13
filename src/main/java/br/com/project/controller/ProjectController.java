package br.com.project.controller;

import br.com.project.model.Instrutor;
import br.com.project.model.Turma;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/project-api")
public class ProjectController {

    @GetMapping(value = "/get-instrutor", produces = "application/json")
    public Instrutor getInstrutor(){
        Instrutor instrutor = new Instrutor();

        return instrutor;
    }

    @GetMapping(value = "/get-turma", produces = "application/json")
    public Turma getTurma(){
        Turma turma  = new Turma();

        return turma;
    }

}
