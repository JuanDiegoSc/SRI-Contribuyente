package com.sriContribuyente.microContribuyente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private ServiceCont serviceCont;
    @GetMapping("/contribuyente")
    public Boolean getContribuyente(@RequestParam(value = "cedula") String cedula) {
        return serviceCont.getApiResponse(cedula);
    }
}