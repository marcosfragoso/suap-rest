package edu.ifpb.web2.suaprest.controller;

import edu.ifpb.web2.suaprest.model.Servidor;
import edu.ifpb.web2.suaprest.service.ServidorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servidores")
public class ServidorController {

    @Autowired
    private ServidorService servidorService;

    @GetMapping
    public List<Servidor> listarServidores() {
        return servidorService.listarServidores();
    }

    @PostMapping
    public Servidor cadastrarServidor(@RequestBody Servidor servidor) {
        return servidorService.cadastrarServidor(servidor);
    }

    @PutMapping
    public Servidor atualizarServidor(@RequestBody Servidor servidor) {
        return servidorService.atualizarServidor(servidor);
    }

    @DeleteMapping
    public String deletarServidor(@RequestBody Servidor servidor) {
        return servidorService.deletarServidor(servidor);
    }
}
