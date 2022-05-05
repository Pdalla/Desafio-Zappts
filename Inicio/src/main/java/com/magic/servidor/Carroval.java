package com.magic.servidor;

import com.yourcar.rodizio.carros.Carrosinf;
import com.yourcar.rodizio.repositorio.Carrorepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/com/magic/servidor/carros")
public class Carroval {
    @Autowired
    //neste momento estamos atribuindo funcoees ao repositorio, se deixarmos sem o autowired o programa retornaria null
    private Carrorepositorio carrorepositorio;

    @GetMapping
    public List<Carrosinf> listar() {
        return carrorepositorio.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public  Carrosinf salvar(@RequestBody  Carrosinf carros){ //Request Body converte corpo da requisicao para objeto cliente no caso.
        return carrorepositorio.save(carros);
    }
}
