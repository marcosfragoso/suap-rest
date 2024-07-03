package edu.ifpb.web2.suaprest.controller;

import edu.ifpb.web2.suaprest.model.Disciplina;
import edu.ifpb.web2.suaprest.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {

    @Autowired
    private DisciplinaService disciplinaService;

    @GetMapping
    public List<Disciplina> listarDisciplinas() {
        return disciplinaService.listarDisciplinas();
    }

    @PostMapping
    public Disciplina cadastrarDisciplina(@RequestBody Disciplina disciplina) {
        return disciplinaService.cadastrarDisciplina(disciplina);
    }

    @PutMapping
    public Disciplina atualizarDisciplina(@RequestBody Disciplina disciplina) {
        return disciplinaService.atualizarDisciplina(disciplina);
    }

    @DeleteMapping
    public String deletarDisciplina(@RequestBody Disciplina disciplinaRequest) {
        return disciplinaService.deletarDisciplina(disciplinaRequest);
    }
}
