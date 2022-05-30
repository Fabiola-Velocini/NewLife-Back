package com.beta.newlife.controller;

import javax.transaction.Transactional;

import com.beta.newlife.controller.dto.VeiculoDTO;
import com.beta.newlife.controller.form.VeiculoForm;
import com.beta.newlife.service.VeiculoService;

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
@RequestMapping("/api/veiculos")
public class VeiculosController {

    @Autowired
    private VeiculoService veiculoService;

    @GetMapping ("/{id}")
    public ResponseEntity<?> getVeiculoById (@PathVariable Long id) {
        VeiculoDTO dto = this.veiculoService.findVeiculoById (id);
        return ResponseEntity.status (HttpStatus.OK).body (dto);
    }

    @PostMapping ()
    public ResponseEntity<?> createVeiculo (@RequestBody VeiculoForm form) {
        this.veiculoService.createVeiculo (form);
        return new ResponseEntity<> (HttpStatus.OK);
    }

    @PutMapping ("/{id}")
    @Transactional
    public ResponseEntity<?> updateVeiculo (@PathVariable Long id, @RequestBody VeiculoForm form) {
        this.veiculoService.updateVeiculo (form, id);
        return new ResponseEntity<> (HttpStatus.OK);
    }

    @DeleteMapping ("/{id}")
    @Transactional
    public ResponseEntity<?> deleteVeiculo (@PathVariable Long id) {
        this.veiculoService.deleteVeiculo (id);
        return new ResponseEntity<> (HttpStatus.OK);
    }

}
