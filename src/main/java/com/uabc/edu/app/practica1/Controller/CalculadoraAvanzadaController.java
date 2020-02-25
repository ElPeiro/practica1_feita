package com.uabc.edu.app.practica1.Controller;

import com.uabc.edu.app.practica1.Model.Operacion;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CalculadoraAvanzadaController {

    @PostMapping("/ops")
    public Operacion operaciones(@RequestBody Operacion operacion){

        switch (operacion.getOp()){
            case SUMA:
                operacion.setResultado(operacion.getNumeroA()+
                        operacion.getNumeroB());
                break;
            case RESTA:
                operacion.setResultado(operacion.getNumeroA()-
                        operacion.getNumeroB());
            break;
            case DIVISION:
                if(operacion.getNumeroA()!= 0 && operacion.getNumeroB()!=0){

                }
                break;
            case MULTIPLICACION:
                break;
        }
        return operacion;
    }


}
