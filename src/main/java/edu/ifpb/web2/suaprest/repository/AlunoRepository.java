package edu.ifpb.web2.suaprest.repository;

import edu.ifpb.web2.suaprest.model.Aluno;
import edu.ifpb.web2.suaprest.model.AlunoDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    @Query(value = ""
            + "select a.* "
            + " from Aluno a, aluno_professor ap"
            + " where a.matricula = ap.matricula_aluno and ap.matricula_professor = :cod_professor", nativeQuery = true
    )
    List<Aluno> findAlunoByProfessor(@Param("cod_professor") Long cod_professor);

    @Query(value = ""
            + "select a.* "
            + " from Aluno a, aluno_professor ap"
            + " where a.matricula = ap.matricula_aluno and ap.matricula_professor = :cod_professor", nativeQuery = true
    )
    List<AlunoDTO> findAlunoDTOByProfessor(@Param("cod_professor") Long cod_professor);
}
