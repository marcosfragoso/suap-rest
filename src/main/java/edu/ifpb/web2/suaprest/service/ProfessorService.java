package edu.ifpb.web2.suaprest.service;

import edu.ifpb.web2.suaprest.model.Professor;
import edu.ifpb.web2.suaprest.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    public List<Professor> listarProfessores(){
        return professorRepository.findAll();
    }

    public Professor cadastrarProfessor(Professor professor) {
        return professorRepository.save(professor);
    }

    public Professor atualizarProfessor(Professor professor) {
        return professorRepository.save(professor);
    }

    public String deletarProfessor(Professor professor) {
        professorRepository.deleteById(professor.getMatricula());
        return "Professor deletado com sucesso.";
    }
}
