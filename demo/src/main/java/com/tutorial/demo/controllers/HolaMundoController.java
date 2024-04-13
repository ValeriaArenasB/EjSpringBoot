package com.tutorial.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {
    @GetMapping("/usuario")
    String hola(){
        return "hola usuario";
    }

    @GetMapping("/saludo")
    public String saludo(@RequestParam String nombre) {
        return "Hola " + nombre;
        // probar con: https://8080-valeriare14-ejspringboo-mwdn4gj5qoo.ws-us110.gitpod.io/saludo?nombre=ValeriaArenas
    }

    @GetMapping("/suma")
    public String Suma(@RequestParam Integer a, @RequestParam Integer b) {
        return "" + (a + b);
        // probar con: https://8080-valeriare14-ejspringboo-mwdn4gj5qoo.ws-us110.gitpod.io/suma?a=10&b=11
    }

    @GetMapping("/validar/{clase}")
    public String validar(@PathVariable String clase, @RequestParam String id) {
        return "validando la clase " + clase +  " y el id " + id;
        // probar con: https://8080-valeriare14-ejspringboo-mwdn4gj5qoo.ws-us110.gitpod.io/validar/libro?id=10
    }


    }

