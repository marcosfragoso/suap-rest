package edu.ifpb.web2.suaprest.repository;

import edu.ifpb.web2.suaprest.model.Diario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiarioRepository extends JpaRepository<Diario, Long> {
}
