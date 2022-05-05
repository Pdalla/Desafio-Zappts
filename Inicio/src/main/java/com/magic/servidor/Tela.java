package com.magic.servidor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormatSymbols;
import java.util.Calendar;

@RestController
public class Tela {
    @GetMapping(path = "/com/magic/servidor/mensagem")
    public String checar() {
        return "Ola";
    }
    public String weekDay(Calendar cal) { return new DateFormatSymbols().getWeekdays()[cal.get(Calendar.DAY_OF_WEEK)]; }

    }




