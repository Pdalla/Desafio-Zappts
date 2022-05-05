package com.magic.servidor;

import com.magic.cartas.Cartasbd;
import com.magic.repositorio.Cartasrepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/com/magic/servidor/cartas")
public class Carroval {
    @Autowired
    //neste momento estamos atribuindo funcoees ao repositorio, se deixarmos sem o autowired o programa retornaria null
    private Cartasrepositorio cartasrepositorio;

    @GetMapping
    public List<Cartasbd> listar() {
        return cartasrepositorio.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public  Cartasbd salvar(@RequestBody  Cartasbd carros){ //Request Body converte corpo da requisicao para objeto cliente no caso.
        return cartasrepositorio.save(carros);
    }
}
