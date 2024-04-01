package edu.ifpb.web2.suaprest.controller;

import edu.ifpb.web2.suaprest.model.Aluno;
import edu.ifpb.web2.suaprest.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;
    @GetMapping
    public List<Aluno> listarAlunos() {
        return alunoService.listarAlunos();
    }

    @PostMapping
    public Aluno cadastrarAluno(@RequestBody Aluno aluno) {
        return alunoService.cadastrarAluno(aluno);
    }

    @PutMapping
    public Aluno atualizarAluno(@RequestBody Aluno aluno) {
        return alunoService.atualizarAluno(aluno);
    }

    @DeleteMapping
    public String deletarAluno(@RequestBody Aluno alunoRequest) {
        return alunoService.deletarAluno(alunoRequest);
    }
}
