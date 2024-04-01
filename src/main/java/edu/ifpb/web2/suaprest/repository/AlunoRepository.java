package edu.ifpb.web2.suaprest.repository;

import edu.ifpb.web2.suaprest.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
