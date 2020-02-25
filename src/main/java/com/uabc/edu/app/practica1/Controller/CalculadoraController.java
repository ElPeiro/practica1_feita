package com.uabc.edu.app.practica1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalculadoraController {
@GetMapping("/resta")
public double resta(@RequestParam(value = "numA") double x,
                    @RequestParam(value = "numB") double y){

        double resultado;

        resultado = x + y;

        return resultado;
    }
@GetMapping("/suma")
    public double suma(@RequestParam(value = "numA") double x ,
                       @RequestParam(value = "numB") double y){
        double resultado;

        resultado = x +y;
        return resultado;
    }
    @GetMapping("/division")
    public double division(@RequestParam(value = "numA")double x ,
                           @RequestParam(value = "numB")double y){
        double resultado;

        resultado = x / y;
        return resultado;
    }
@GetMapping("/multiplicacion")
    public double multiplicacion(@RequestParam(value = "numA")double x ,
                                 @RequestParam(value = "numB")double y){
        double resultado;

        resultado = x * y;
        return resultado;
    }
@GetMapping("/elevar2")
    public double elevar(@RequestParam(value = "numA")double x){
    double resultado;


    resultado = Math.pow(x,2);
    return resultado;
}
@GetMapping("/porcentaje")
    public double porcentaje(@RequestParam(value = "numA")double x ,
                             @RequestParam(value = "numB")double y ){

    double resultado;

    resultado = x * (y/100);


    return resultado;
}

}
