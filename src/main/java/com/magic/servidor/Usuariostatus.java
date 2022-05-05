package com.magic.servidor;//package com.yourcar.rodizio.servidor;

import com.yourcar.rodizio.repositorio.Usuariorepositorio;
import com.yourcar.rodizio.usuario.Usuarioval;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

 class Usuariostatus {

    @Autowired //neste momento estamos atribuindo funcoees ao repositorio, se deixarmos sem o autowired o programa retornaria null
    private Usuariorepositorio usuariorepositorio;

    @GetMapping(path = "/com/magic/servidor/usuario/{id}")
    public ResponseEntity consultar (@PathVariable("id") Integer id) {
        return usuariorepositorio.findById(id)
                .map(record -> ResponseEntity.status(HttpStatus.OK).body(record))
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping(path = "/com/magic/servidor/usuario/salvar")
    public Usuarioval salvar(@RequestBody Usuarioval usuario) {
        return usuariorepositorio.save(usuario);
    }
}





