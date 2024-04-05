package edu.ifpb.web2.suaprest.service;

import edu.ifpb.web2.suaprest.model.Curso;
import edu.ifpb.web2.suaprest.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public List<Curso> listarCursos() {
        return cursoRepository.findAll();
    }

    public Curso cadastrarCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    public Curso atualizarCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    public String deletarCurso(Curso curso) {
        cursoRepository.deleteById(curso.getCodigo());
        return "Curso deletado com sucesso.";
    }
}
