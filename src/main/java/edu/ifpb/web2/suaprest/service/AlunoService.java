package edu.ifpb.web2.suaprest.service;

import edu.ifpb.web2.suaprest.model.Aluno;
import edu.ifpb.web2.suaprest.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public List<Aluno> listarAlunos() {
        return alunoRepository.findAll();
    }

    public Aluno cadastrarAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public Aluno atualizarAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public String deletarAluno(Aluno alunoRequest) {
        alunoRepository.deleteById(alunoRequest.getMatricula());
        return "Aluno deletado com sucesso.";
    }


    public List<Aluno> findAlunoByProfessor(Long cod_professor) {
        return alunoRepository.findAlunoByProfessor(cod_professor);
    }
}
