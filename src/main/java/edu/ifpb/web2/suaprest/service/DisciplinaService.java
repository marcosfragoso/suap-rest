package edu.ifpb.web2.suaprest.service;


import edu.ifpb.web2.suaprest.model.Disciplina;
import edu.ifpb.web2.suaprest.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplinaService {

    @Autowired
    private DisciplinaRepository disciplinaRepository;

    public List<Disciplina> listarDisciplinas() {
        return disciplinaRepository.findAll();
    }

    public Disciplina cadastrarDisciplina(Disciplina disciplina) {
        return disciplinaRepository.save(disciplina);
    }

    public Disciplina atualizarDisciplina(Disciplina disciplina) {
        return disciplinaRepository.save(disciplina);
    }

    public String deletarDisciplina(Disciplina disciplinaRequest) {
        disciplinaRepository.deleteById(disciplinaRequest.getId());
        return "Disciplina deletada com sucesso.";
    }
}
