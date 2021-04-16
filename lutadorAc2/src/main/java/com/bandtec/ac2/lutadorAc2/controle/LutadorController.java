package com.bandtec.ac2.lutadorAc2.controle;

import com.bandtec.ac2.lutadorAc2.dominio.Lutador;
import com.bandtec.ac2.lutadorAc2.repositorio.LutadoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/lutadores")
public class LutadorController {

    @Autowired
    private LutadoresRepository lutadoresRepository;

    @PostMapping
    public ResponseEntity postLutadores(@RequestBody @Valid Lutador novoLutador) {
        lutadoresRepository.save(novoLutador);
        return ResponseEntity.status(201).build();
    }

    @GetMapping
    public ResponseEntity getLutadores() {
        return ResponseEntity.status(200).body(lutadoresRepository.findAll());
    }

    @GetMapping("/contagem-vivos")
    public ResponseEntity getLutadoresVivos() {
        return ResponseEntity.status(200).body(lutadoresRepository.findByVivo(true));
    }
}
