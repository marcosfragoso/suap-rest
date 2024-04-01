package edu.ifpb.web2.suaprest.repository;

import edu.ifpb.web2.suaprest.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
