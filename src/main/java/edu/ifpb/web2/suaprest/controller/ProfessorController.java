package edu.ifpb.web2.suaprest.controller;

import edu.ifpb.web2.suaprest.model.Professor;
import edu.ifpb.web2.suaprest.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professores")
public class ProfessorController {
    @Autowired
    private ProfessorService professorService;

    @GetMapping
    public List<Professor> listarProfessores() {
        return professorService.listarProfessores();
    }

    @PostMapping
    public Professor cadastrarProfessor(@RequestBody Professor professor) {
        return professorService.cadastrarProfessor(professor);
    }

    @PutMapping
    public Professor atualizarProfessor(@RequestBody Professor professor) {
        return professorService.atualizarProfessor(professor);
    }
    @DeleteMapping
    public String deletarProfessor(@RequestBody Professor professor) {
        return professorService.deletarProfessor(professor);
    }
}
