package com.beta.newlife.controller;

import com.beta.newlife.controller.dto.VisitanteDTO;
import com.beta.newlife.controller.form.VisitanteForm;
import com.beta.newlife.service.VisitanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping ("/api/visitantes")
public class VisitantesController {
    
    @Autowired
    private VisitanteService visitanteService;

    @GetMapping ("/{id}")
    public ResponseEntity<?> getVisitanteById (@PathVariable Long id) {
        VisitanteDTO dto = this.visitanteService.findVisitanteById (id);
        return ResponseEntity.status (HttpStatus.OK).body (dto);
    }

    @PostMapping ()
    public ResponseEntity<?> createVisitante (@RequestBody VisitanteForm form) {
        this.visitanteService.createVisitante (form);
        return new ResponseEntity<> (HttpStatus.OK);
    }

    @PutMapping ("/{id}")
    @Transactional
    public ResponseEntity<?> updateVisitante (@PathVariable Long id, @RequestBody VisitanteForm form) {
        this.visitanteService.updateVisitante (form, id);
        return new ResponseEntity<> (HttpStatus.OK);
    }

    @DeleteMapping ("/{id}")
    @Transactional
    public ResponseEntity<?> deleteVisitante (@PathVariable Long id) {
        this.visitanteService.deleteVisitante (id);
        return new ResponseEntity<> (HttpStatus.OK);
    }

}
