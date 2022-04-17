package org.adaitw.apibot_coachjava.controller;


import org.adaitw.apibot_coachjava.model.entities.Concepto;
import org.adaitw.apibot_coachjava.service.ConceptoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConceptoController {
       @Autowired
        private ConceptoService conceptoService;

    @RequestMapping (value = "/conceptos", method = RequestMethod.GET,produces = "application/json")
    public List<Concepto> getConceptos() {
        return conceptoService.findAllCconceptos();

                }
}



