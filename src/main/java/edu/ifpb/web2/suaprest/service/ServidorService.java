package edu.ifpb.web2.suaprest.service;

import edu.ifpb.web2.suaprest.model.Servidor;
import edu.ifpb.web2.suaprest.repository.ServidorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServidorService {
    @Autowired
    private ServidorRepository servidorRepository;

    public List<Servidor> listarServidores() {
        return servidorRepository.findAll();
    }

    public Servidor cadastrarServidor(Servidor servidor) {
        return servidorRepository.save(servidor);
    }

    public Servidor atualizarServidor(Servidor servidor) {
        return servidorRepository.save(servidor);
    }

    public String deletarServidor(Servidor servidor) {
        servidorRepository.deleteById(servidor.getMatricula());
        return "Servidor deletado com sucesso.";
    }
}
