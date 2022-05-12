package com.magic.Inicio.servidor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/*import Usuariorepositorio;*/

@RestController /*classe de controlador / resposta do servidor*/
public class Statusserv {
    @GetMapping(path = "/com/magic/Inicio/servidor/status")
    public String check() {
        return "online";
    }
    }

