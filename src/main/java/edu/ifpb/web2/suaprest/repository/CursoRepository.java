package edu.ifpb.web2.suaprest.repository;

import edu.ifpb.web2.suaprest.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
