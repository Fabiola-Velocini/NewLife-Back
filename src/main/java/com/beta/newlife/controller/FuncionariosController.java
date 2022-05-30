package com.beta.newlife.controller;

import javax.transaction.Transactional;

import com.beta.newlife.controller.dto.FuncionarioDTO;
import com.beta.newlife.controller.form.FuncionarioForm;
import com.beta.newlife.service.FuncionarioService;

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
@RequestMapping ("/api/funcionarios")
public class FuncionariosController {
    
    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping ("/{id}")
    public ResponseEntity<?> getFuncionarioById (@PathVariable Long id) {
        FuncionarioDTO dto = this.funcionarioService.findFuncionarioById (id);
        return ResponseEntity.status (HttpStatus.OK).body (dto);
    }

    @PostMapping ()
    public ResponseEntity<?> createFuncionario (@RequestBody FuncionarioForm form) {
        this.funcionarioService.createFuncionario (form);
        return new ResponseEntity<> (HttpStatus.OK);
    }

    @PutMapping ("/{id}")
    @Transactional
    public ResponseEntity<?> updateFuncionario (@PathVariable Long id, @RequestBody FuncionarioForm form) {
        this.funcionarioService.updateFuncionario (form, id);
        return new ResponseEntity<> (HttpStatus.OK);
    }

    @DeleteMapping ("/{id}")
    @Transactional
    public ResponseEntity<?> deleteFuncionario (@PathVariable Long id) {
        this.funcionarioService.deleteFuncionario (id);
        return new ResponseEntity<> (HttpStatus.OK);
    }
    
}