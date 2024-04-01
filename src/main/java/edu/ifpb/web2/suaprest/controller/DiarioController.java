package edu.ifpb.web2.suaprest.controller;

import edu.ifpb.web2.suaprest.model.Diario;
import edu.ifpb.web2.suaprest.service.DiarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diarios")
public class DiarioController {

    @Autowired
    private DiarioService diarioService;

    @GetMapping
    public List<Diario> listarDiarios() {
        return diarioService.listarDiarios();
    }

    @PostMapping
    public Diario cadastrarDiario(@RequestBody Diario diario) {
        return diarioService.cadastrarDiario(diario);
    }

    @PutMapping
    public Diario atualizarDiario(@RequestBody Diario diario) {
        return diarioService.atualizarDiario(diario);
    }

    @DeleteMapping
    public String deletarDiario(@RequestBody Diario diario) {
        return diarioService.deletarDiario(diario);
    }
}
