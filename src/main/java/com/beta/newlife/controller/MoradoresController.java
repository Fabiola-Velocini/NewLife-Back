package com.beta.newlife.controller;

import javax.transaction.Transactional;

import com.beta.newlife.controller.dto.MoradorDTO;
import com.beta.newlife.controller.form.MoradorForm;
import com.beta.newlife.service.MoradorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/moradores")
public class MoradoresController {
    
    @Autowired
    private MoradorService moradorService;

    @GetMapping ("/{id}")
    public ResponseEntity<?> getMoradorById (@PathVariable Long id) {
        MoradorDTO dto = this.moradorService.findMoradorById (id);
        return ResponseEntity.status (HttpStatus.OK).body (dto);
    }

    @PostMapping ()
    public ResponseEntity<?> createMorador (@RequestBody MoradorForm form) {
        this.moradorService.createMorador (form);
        return new ResponseEntity<> (HttpStatus.OK);
    }

    @PutMapping ("/{id}")
    @Transactional
    public ResponseEntity<?> updateMorador (@PathVariable Long id, @RequestBody MoradorForm form) {
        this.moradorService.updateMorador (form, id);
        return new ResponseEntity<> (HttpStatus.OK);
    }

    @DeleteMapping ("/{id}")
    @Transactional
    public ResponseEntity<?> deleteMorador (@PathVariable Long id) {
        this.moradorService.deleteMorador (id);
        return new ResponseEntity<> (HttpStatus.OK);
    }

}
