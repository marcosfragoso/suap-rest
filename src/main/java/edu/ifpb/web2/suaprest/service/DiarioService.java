package edu.ifpb.web2.suaprest.service;

import edu.ifpb.web2.suaprest.model.Diario;
import edu.ifpb.web2.suaprest.repository.DiarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiarioService {

    @Autowired
    private DiarioRepository diarioRepository;

    public List<Diario> listarDiarios() {
        return diarioRepository.findAll();
    }

    public Diario cadastrarDiario(Diario diario) {
        return diarioRepository.save(diario);
    }

    public Diario atualizarDiario(Diario diario) {
        return diarioRepository.save(diario);
    }

    public String deletarDiario(Diario diario) {
        diarioRepository.deleteById(diario.getCodigo());
        return "Diário deletado com sucesso.";
    }
}
