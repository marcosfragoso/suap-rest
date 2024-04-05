package edu.ifpb.web2.suaprest.controller;

import edu.ifpb.web2.suaprest.model.Curso;
import edu.ifpb.web2.suaprest.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping
    public List<Curso> listarCursos() {
        return cursoService.listarCursos();
    }

    @PostMapping
    public Curso cadastrarcurso(@RequestBody Curso curso) {
        return cursoService.cadastrarCurso(curso);
    }

    @PutMapping
    public Curso atualizarcurso(@RequestBody Curso curso) {
        return cursoService.atualizarCurso(curso);
    }

    @DeleteMapping
    public String deletarCurso(@RequestBody Curso curso) {
        return cursoService.deletarCurso(curso);
    }
}
