package com.magic.Inicio.servidor;

import com.magic.Inicio.cartas.Cartasbd;
import com.magic.Inicio.repositorio.Cartasrepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/com/magic/Inicio/servidor/cartas")
public class Cartas {
    @Autowired
    //neste momento estamos atribuindo funcoees ao repositorio, se deixarmos sem o autowired o programa retornaria null
    private Cartasrepositorio cartasrepositorio;

    @GetMapping()
    public List<Cartasbd> listar() {
        return cartasrepositorio.findAll();
    }

    @GetMapping("/com/magic/Inicio/servidor/cartas/{id}")
    public ResponseEntity consultar (@PathVariable("id") Integer id) {
        return cartasrepositorio.findById(id)
                .map(record -> ResponseEntity.status(HttpStatus.OK).body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public  Cartasbd salvar(@RequestBody  Cartasbd cartasbd){ //Request Body converte corpo da requisicao para objeto cliente no caso.
        return cartasrepositorio.save(cartasbd);
    }

    @DeleteMapping("/com/magic/Inicio/servidor/cartas/{id}")
    public void deletar (@PathVariable("id") Integer id) {
        cartasrepositorio.deleteById(id);
    }
}
