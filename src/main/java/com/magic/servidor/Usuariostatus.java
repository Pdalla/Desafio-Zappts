package com.magic.servidor;//package com.yourcar.rodizio.servidor;

import com.magic.repositorio.Usuariorepositorio;
import com.magic.usuarios.Usuariobd;
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
    public Usuariobd salvar(@RequestBody Usuariobd usuariobd) {
        return usuariorepositorio.save(usuariobd);
    }


}





